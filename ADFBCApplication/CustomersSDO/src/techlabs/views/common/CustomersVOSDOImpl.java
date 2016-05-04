package techlabs.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class CustomersVOSDOImpl extends SDODataObject implements CustomersVOSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 4;

   public CustomersVOSDOImpl() {}

   public java.math.BigDecimal getCustId() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setCustId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getFirstName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setFirstName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getLastName() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setLastName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.String getEmail() {
      return getString(START_PROPERTY_INDEX + 3);
   }

   public void setEmail(java.lang.String value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.util.List getAddressVO() {
      return getList(START_PROPERTY_INDEX + 4);
   }

   public void setAddressVO(java.util.List value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }


}

