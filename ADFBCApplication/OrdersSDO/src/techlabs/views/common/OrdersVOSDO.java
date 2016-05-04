package techlabs.views.common;

public interface OrdersVOSDO extends java.io.Serializable {

   public java.math.BigDecimal getOrdId();

   public void setOrdId(java.math.BigDecimal value);

   public java.math.BigDecimal getCustId();

   public void setCustId(java.math.BigDecimal value);

   public java.math.BigDecimal getTotalPrice();

   public void setTotalPrice(java.math.BigDecimal value);

   public java.sql.Timestamp getDateOrdered();

   public void setDateOrdered(java.sql.Timestamp value);

   public java.sql.Timestamp getDateShipped();

   public void setDateShipped(java.sql.Timestamp value);

   public java.lang.String getStatus();

   public void setStatus(java.lang.String value);

   public java.util.List getItemsVO();

   public void setItemsVO(java.util.List value);


}

