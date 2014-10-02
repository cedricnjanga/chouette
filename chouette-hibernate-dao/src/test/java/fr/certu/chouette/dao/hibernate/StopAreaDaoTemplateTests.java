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

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fr.certu.chouette.filter.Filter;
import fr.certu.chouette.model.neptune.StopArea;
import fr.certu.chouette.model.neptune.type.ChouetteAreaEnum;

/**
 * @author michel
 * 
 */
public class StopAreaDaoTemplateTests extends
      AbstractDaoTemplateTests<StopArea>
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
      initDaoTemplate("StopArea", "stopAreaDao");
   }

   @Test(groups = { "hibernate" }, description = "daoTemplate should return count of objects")
   public void verifyCount2()
   {
      refreshBean();
      // bean.setId(Long.valueOf(0));
      daoTemplate.save(bean);
      Assert.assertFalse(bean.getId().equals(Long.valueOf(0)),
            "created Bean should have id different of zero");
      Filter filter = Filter.getNewEqualsFilter("areaType",
            ChouetteAreaEnum.BoardingPosition);
      Long count = daoTemplate.count(filter);
      Assert.assertTrue(count > 0, "count Bean should be 1");
      filter = Filter.getNewInFilter("areaType", new Object[] {
            ChouetteAreaEnum.BoardingPosition, ChouetteAreaEnum.Quay });
      count = daoTemplate.count(filter);
      Assert.assertTrue(count > 0, "count Bean should be 1");
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
      bean = createStopArea();
   }

   @Override
   protected List<FilterData> getSelectFilters()
   {
      List<FilterData> ret = new ArrayList<FilterData>();
      ret.add(new FilterData("StopArea : countryCode", Filter
            .getNewEqualsFilter("countryCode", "39397"), 1));
      return ret;
   }

}
