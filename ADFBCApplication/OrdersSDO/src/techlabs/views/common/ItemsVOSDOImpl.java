package techlabs.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class ItemsVOSDOImpl extends SDODataObject implements ItemsVOSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 4;

   public ItemsVOSDOImpl() {}

   public java.math.BigDecimal getItemId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setItemId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getOrdId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setOrdId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getProdId() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setProdId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getPrice() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setPrice(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getQuantity() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setQuantity(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }


}

