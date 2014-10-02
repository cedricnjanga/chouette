/**
 * Projet CHOUETTE
 *
 * ce projet est sous license libre
 * voir LICENSE.txt pour plus de details
 *
 */

package fr.certu.chouette.dao.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeMethod;

import fr.certu.chouette.filter.Filter;
import fr.certu.chouette.model.neptune.Route;

/**
 * @author michel
 * 
 */
public class RouteDaoTemplateTests extends AbstractDaoTemplateTests<Route>
{

   /*
    * (non-Javadoc)
    * 
    * @see
    * fr.certu.chouette.dao.hibernate.AbstractDaoTemplateTests#createDaoTemplate
    * ()
    */
   @Override
   @BeforeMethod(alwaysRun = true)
   public void createDaoTemplate()
   {
      initDaoTemplate("Route", "routeDao");
   }

   /*
    * (non-Javadoc)
    * 
    * @see
    * fr.certu.chouette.dao.hibernate.AbstractDaoTemplateTests#refreshBean()
    */
   @Override
   public void refreshBean()
   {
      bean = createRoute();
   }

   @Override
   protected List<FilterData> getSelectFilters()
   {
      List<FilterData> ret = new ArrayList<FilterData>();
      ret.add(new FilterData("Route : line.name", Filter.getNewEqualsFilter(
            "line.name", "TestNG Line"), 1));
      return ret;
   }

}
