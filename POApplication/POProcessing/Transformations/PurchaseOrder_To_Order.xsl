<?xml version = '1.0' encoding = 'UTF-8'?>
<xsl:stylesheet version="1.0" xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20" xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/" xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction" xmlns:bpel="http://docs.oasis-open.org/wsbpel/2.0/process/executable" xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc" xmlns:ns0="http://xmlns.oracle.com/pcbpel/adapter/file/POApplication/POProcessing/WritePOFileService" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue" xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath" xmlns:jca="http://xmlns.oracle.com/pcbpel/wsdl/jca/" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:med="http://schemas.oracle.com/mediator/xpath" xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath" xmlns:bpm="http://xmlns.oracle.com/bpmn20/extensions" xmlns:inp1="http://xmlns.oracle.com/ns/order" xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk" xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions" xmlns:plt="http://schemas.xmlsoap.org/ws/2003/05/partner-link/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:ora="http://schemas.oracle.com/xpath/extension" xmlns:tns="http://oracle.com/sca/soapservice/POApplication/POProcessing/ReceivePO" xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator" xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap" exclude-result-prefixes="xsi xsl inp1 xsd wsdl tns ns0 jca plt xp20 bpws mhdr bpel oraext dvm hwf med ids bpm xdk xref ora socket ldap" xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas">
  <oracle-xsl-mapper:schema>
      <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
      <oracle-xsl-mapper:mapSources>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/POApplication/WSDLs/ReceivePO.wsdl"/>
            <oracle-xsl-mapper:rootElement name="PurchaseOrder" namespace="http://xmlns.oracle.com/ns/order"/>
         </oracle-xsl-mapper:source>
      </oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:mapTargets>
         <oracle-xsl-mapper:target type="WSDL">
            <oracle-xsl-mapper:schema location="../WSDLs/WritePOFileService.wsdl"/>
            <oracle-xsl-mapper:rootElement name="Order" namespace="http://xmlns.oracle.com/ns/order"/>
         </oracle-xsl-mapper:target>
      </oracle-xsl-mapper:mapTargets>
      <oracle-xsl-mapper:mapShowPrefixes type="true"/>
      <!--GENERATED BY ORACLE XSL MAPPER 12.2.1.0.0(XSLT Build 151013.0700.0085) AT [TUE MAY 03 16:46:38 EDT 2016].-->
   </oracle-xsl-mapper:schema>
   <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
   <xsl:template match="/">
    <inp1:Order>
      <inp1:customerId>
        <xsl:value-of select="/inp1:PurchaseOrder/inp1:CustID"/>
      </inp1:customerId>
      <inp1:orderId>
        <xsl:value-of select="/inp1:PurchaseOrder/inp1:ID"/>
      </inp1:orderId>
      <inp1:payMethod>
        <xsl:value-of select="/inp1:PurchaseOrder/inp1:payOption"/>
      </inp1:payMethod>
      <inp1:shipMethod>
        <xsl:value-of select="/inp1:PurchaseOrder/inp1:shipChoice"/>
      </inp1:shipMethod>
      <inp1:orderTotal>
        <xsl:text disable-output-escaping="no">0.0</xsl:text>
      </inp1:orderTotal>
      <xsl:if test="/inp1:PurchaseOrder/inp1:status">
        <inp1:status>
          <xsl:value-of select="/inp1:PurchaseOrder/inp1:status"/>
        </inp1:status>
      </xsl:if>
      <inp1:creditCard>
        <inp1:cardNumber>
          <xsl:value-of select="/inp1:PurchaseOrder/inp1:ccNumber"/>
        </inp1:cardNumber>
        <inp1:cardType>
          <xsl:value-of select="/inp1:PurchaseOrder/inp1:ccType"/>
        </inp1:cardType>
      </inp1:creditCard>
      <inp1:items>
        <inp1:inStock>
          <xsl:text disable-output-escaping="no">true</xsl:text>
        </inp1:inStock>
        <xsl:for-each select="/inp1:PurchaseOrder/inp1:items/inp1:item">
          <inp1:item>
            <inp1:prodId>
              <xsl:value-of select="inp1:productID"/>
            </inp1:prodId>
            <inp1:prodName>
              <xsl:value-of select="inp1:productName"/>
            </inp1:prodName>
            <xsl:if test="inp1:price">
              <inp1:price>
                <xsl:value-of select="inp1:price"/>
              </inp1:price>
            </xsl:if>
            <xsl:if test="inp1:quantity">
              <inp1:qty>
                <xsl:value-of select="inp1:quantity"/>
              </inp1:qty>
            </xsl:if>
            <inp1:itemTotal>
              <xsl:value-of select="inp1:price * inp1:quantity"/>
            </inp1:itemTotal>
          </inp1:item>
        </xsl:for-each>
      </inp1:items>
    </inp1:Order>
  </xsl:template>
</xsl:stylesheet>