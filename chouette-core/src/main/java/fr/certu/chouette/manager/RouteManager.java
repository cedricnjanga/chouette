/**
 * Projet CHOUETTE
 *
 * ce projet est sous license libre
 * voir LICENSE.txt pour plus de details
 *
 */

package fr.certu.chouette.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.transaction.annotation.Transactional;

import fr.certu.chouette.common.ChouetteException;
import fr.certu.chouette.core.CoreException;
import fr.certu.chouette.core.CoreExceptionCode;
import fr.certu.chouette.filter.Filter;
import fr.certu.chouette.model.neptune.JourneyPattern;
import fr.certu.chouette.model.neptune.PTLink;
import fr.certu.chouette.model.neptune.Route;
import fr.certu.chouette.model.neptune.StopPoint;
import fr.certu.chouette.model.user.User;
import fr.certu.chouette.plugin.validation.report.PhaseReportItem;

/**
 * @author michel
 * 
 */
@SuppressWarnings("unchecked")
public class RouteManager extends AbstractNeptuneManager<Route>
{
   private static final Logger logger = Logger.getLogger(RouteManager.class);

   public RouteManager()
   {
      super(Route.class, Route.ROUTE_KEY);
   }

   @Override
   protected void propagateValidation(User user, List<Route> beans,
         JSONObject parameters, PhaseReportItem report, boolean propagate)
         throws ChouetteException
   {

      // aggregate dependent objects for validation
      List<PTLink> ptLinks = new ArrayList<PTLink>();
      List<JourneyPattern> journeyPatterns = new ArrayList<JourneyPattern>();
      for (Route route : beans)
      {
         if (route.getPtLinks() != null)
            ptLinks.addAll(route.getPtLinks());
         if (route.getJourneyPatterns() != null)
            journeyPatterns.addAll(route.getJourneyPatterns());

      }

      // propagate validation on PTLinks
      if (ptLinks.size() > 0)
      {
         AbstractNeptuneManager<PTLink> manager = (AbstractNeptuneManager<PTLink>) getManager(PTLink.class);
         if (manager.canValidate())
         {
            manager.validate(user, ptLinks, parameters, report, propagate);
         } else
         {
            manager.propagateValidation(user, ptLinks, parameters, report,
                  propagate);
         }
      }

      // propagate validation on journey patterns
      if (journeyPatterns.size() > 0)
      {
         AbstractNeptuneManager<JourneyPattern> manager = (AbstractNeptuneManager<JourneyPattern>) getManager(JourneyPattern.class);
         if (manager.canValidate())
         {
            manager.validate(user, journeyPatterns, parameters, report,
                  propagate);
         } else
         {
            manager.propagateValidation(user, journeyPatterns, parameters,
                  report, propagate);
         }
      }

      return;
   }

   @Override
   protected Logger getLogger()
   {
      return logger;
   }

   @Transactional
   @Override
   public void saveAll(User user, List<Route> routes, boolean propagate,
         boolean fast) throws ChouetteException
   {
      /* TODO : inactivate PTLink */
      INeptuneManager<JourneyPattern> jpManager = (INeptuneManager<JourneyPattern>) getManager(JourneyPattern.class);
      // INeptuneManager<PTLink> ptLinkManager = (INeptuneManager<PTLink>)
      // getManager(PTLink.class);
      INeptuneManager<StopPoint> stopPointManager = (INeptuneManager<StopPoint>) getManager(StopPoint.class);

      super.saveAll(user, routes, propagate, fast);

      if (propagate)
      {
         List<JourneyPattern> journeyPatterns = new ArrayList<JourneyPattern>();
         List<StopPoint> stopPoints = new ArrayList<StopPoint>();
         // List<PTLink> links = new ArrayList<PTLink>();
         for (Route route : routes)
         {
            mergeCollection(journeyPatterns, route.getJourneyPatterns());
            mergeCollection(stopPoints, route.getStopPoints());
            // mergeCollection(links,route.getPtLinks());
         }

         if (!stopPoints.isEmpty())
            stopPointManager.saveAll(user, stopPoints, propagate, fast);

         if (!journeyPatterns.isEmpty())
            jpManager.saveAll(user, journeyPatterns, propagate, fast);

         // if(!links.isEmpty())
         // ptLinkManager.saveAll(user, links,propagate,fast);
      }
   }

   @Override
   public void completeObject(User user, Route route) throws ChouetteException
   {
      route.complete();

   }

   @Transactional
   @Override
   public int removeAll(User user, Filter filter) throws ChouetteException
   {
      if (getDao() == null)
         throw new CoreException(CoreExceptionCode.NO_DAO_AVAILABLE,
               "unavailable resource");
      if (!filter.getType().equals(Filter.Type.EQUALS))
      {
         throw new CoreException(CoreExceptionCode.DELETE_IMPOSSIBLE,
               "unvalid filter");
      }
      int ret = getDao().removeAll(filter);
      logger.debug("" + ret + " routes deleted");
      return ret;

   }

}
