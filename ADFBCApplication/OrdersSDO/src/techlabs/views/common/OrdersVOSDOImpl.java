package techlabs.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class OrdersVOSDOImpl extends SDODataObject implements OrdersVOSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 6;

   public OrdersVOSDOImpl() {}

   public java.math.BigDecimal getOrdId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setOrdId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.math.BigDecimal getCustId() {
      return getBigDecimal(START_PROPERTY_INDEX + 1);
   }

   public void setCustId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.math.BigDecimal getTotalPrice() {
      return getBigDecimal(START_PROPERTY_INDEX + 2);
   }

   public void setTotalPrice(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.sql.Timestamp getDateOrdered() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 3);
   }

   public void setDateOrdered(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.sql.Timestamp getDateShipped() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 4);
   }

   public void setDateShipped(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getStatus() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setStatus(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.util.List getItemsVO() {
      return getList(START_PROPERTY_INDEX + 6);
   }

   public void setItemsVO(java.util.List value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }


}

