<?xml version = '1.0' encoding = 'UTF-8'?>
<xsl:stylesheet version="1.0" xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/" xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20" xmlns:ns0="http://xmlns.oracle.com/pcbpel/adapter/file/POApplication/JMSConsumer/WriteShippingRequestMessage" xmlns:bpel="http://docs.oasis-open.org/wsbpel/2.0/process/executable" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:pc="http://xmlns.oracle.com/pcbpel/" xmlns:bpm="http://xmlns.oracle.com/bpmn20/extensions" xmlns:plt="http://schemas.xmlsoap.org/ws/2003/05/partner-link/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:ora="http://schemas.oracle.com/xpath/extension" xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator" xmlns:tns="http://xmlns.oracle.com/pcbpel/adapter/jms/POApplication/JMSConsumer/JMSConsumer" xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction" xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc" xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue" xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath" xmlns:med="http://schemas.oracle.com/mediator/xpath" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:jca="http://xmlns.oracle.com/pcbpel/wsdl/jca/" xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath" xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk" xmlns:imp1="http://xmlns.oracle.com/ns/order" xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap" exclude-result-prefixes="xsi xsl pc plt wsdl tns jca imp1 xsd ns0 bpws xp20 bpel bpm ora socket mhdr oraext dvm hwf med ids xdk xref ldap" xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas"
                xmlns:oraxsl="http://www.oracle.com/XSL/Transform/java">
  <oracle-xsl-mapper:schema>
      <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
      <oracle-xsl-mapper:mapSources>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="../WSDLs/JMSConsumer.wsdl"/>
            <oracle-xsl-mapper:rootElement name="shippingRequest" namespace="http://xmlns.oracle.com/ns/order"/>
         </oracle-xsl-mapper:source>
      </oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:mapTargets>
         <oracle-xsl-mapper:target type="WSDL">
            <oracle-xsl-mapper:schema location="../WSDLs/WriteShippingRequestMessage.wsdl"/>
            <oracle-xsl-mapper:rootElement name="shippingRequest" namespace="http://xmlns.oracle.com/ns/order"/>
         </oracle-xsl-mapper:target>
      </oracle-xsl-mapper:mapTargets>
      <oracle-xsl-mapper:mapShowPrefixes type="true"/>
      <!--GENERATED BY ORACLE XSL MAPPER 12.2.1.0.0(XSLT Build 151013.0700.0085) AT [TUE MAY 03 16:46:34 EDT 2016].-->
   </oracle-xsl-mapper:schema>
   <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
   <xsl:template match="/">
    <imp1:shippingRequest>
      <imp1:orderId>
        <xsl:value-of select="/imp1:shippingRequest/imp1:orderId"/>
      </imp1:orderId>
      <imp1:custName>
        <xsl:value-of select="/imp1:shippingRequest/imp1:custName"/>
      </imp1:custName>
      <imp1:shippingAddress>
        <xsl:if test="/imp1:shippingRequest/imp1:shippingAddress/imp1:street">
          <imp1:street>
            <xsl:value-of select="/imp1:shippingRequest/imp1:shippingAddress/imp1:street"/>
          </imp1:street>
        </xsl:if>
        <xsl:if test="/imp1:shippingRequest/imp1:shippingAddress/imp1:city">
          <imp1:city>
            <xsl:value-of select="/imp1:shippingRequest/imp1:shippingAddress/imp1:city"/>
          </imp1:city>
        </xsl:if>
        <xsl:if test="/imp1:shippingRequest/imp1:shippingAddress/imp1:state">
          <imp1:state>
            <xsl:value-of select="/imp1:shippingRequest/imp1:shippingAddress/imp1:state"/>
          </imp1:state>
        </xsl:if>
        <xsl:if test="/imp1:shippingRequest/imp1:shippingAddress/imp1:zip">
          <imp1:zip>
            <xsl:value-of select="/imp1:shippingRequest/imp1:shippingAddress/imp1:zip"/>
          </imp1:zip>
        </xsl:if>
        <xsl:if test="/imp1:shippingRequest/imp1:shippingAddress/imp1:country">
          <imp1:country>
            <xsl:value-of select="/imp1:shippingRequest/imp1:shippingAddress/imp1:country"/>
          </imp1:country>
        </xsl:if>
      </imp1:shippingAddress>
    </imp1:shippingRequest>
  </xsl:template>
</xsl:stylesheet>