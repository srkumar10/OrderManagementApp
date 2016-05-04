package techlabs.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class OnlineStoreViewSDOImpl extends SDODataObject implements OnlineStoreViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 1;

   public OnlineStoreViewSDOImpl() {}

   public java.lang.String getProdId() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setProdId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getQuantity() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setQuantity(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }


}

