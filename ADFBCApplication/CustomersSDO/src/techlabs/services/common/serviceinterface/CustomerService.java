package techlabs.services.common.serviceinterface;

import java.math.BigDecimal;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;

import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import oracle.jbo.common.service.types.FindControl;
import oracle.jbo.common.service.types.FindCriteria;
import oracle.jbo.common.service.types.ProcessControl;
import oracle.jbo.common.service.types.ProcessData;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
import oracle.webservices.annotations.SDODatabinding;

import techlabs.views.common.AddressVOSDO;
import techlabs.views.common.CustomersVOSDO;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Apr 16 10:33:00 EDT 2016
// ---------------------------------------------------------------------
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, style = SOAPBinding.Style.DOCUMENT)
@PortableWebService(targetNamespace="/techlabs/services/common/customers",
    name="CustomerService", wsdlLocation="techlabs/services/common/serviceinterface/CustomerService.wsdl")
@SDODatabinding(schemaLocation="techlabs/services/common/serviceinterface/CustomerService.xsd")
public interface CustomerService {
    public static final String NAME = "{/techlabs/services/common/customers}CustomerService";

    @WebMethod(action="/techlabs/services/common/customers/getAddressVO1",
        operationName="getAddressVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="getAddressVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="getAddressVO1Response")
    @WebResult(name="result")
    AddressVOSDO getAddressVO1(@WebParam(mode = WebParam.Mode.IN, name="addrId")
        BigDecimal addrId) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/createAddressVO1",
        operationName="createAddressVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="createAddressVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="createAddressVO1Response")
    @WebResult(name="result")
    AddressVOSDO createAddressVO1(@WebParam(mode = WebParam.Mode.IN, name="addressVO1")
        AddressVOSDO addressVO1) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/updateAddressVO1",
        operationName="updateAddressVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="updateAddressVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="updateAddressVO1Response")
    @WebResult(name="result")
    AddressVOSDO updateAddressVO1(@WebParam(mode = WebParam.Mode.IN, name="addressVO1")
        AddressVOSDO addressVO1) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/deleteAddressVO1",
        operationName="deleteAddressVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="deleteAddressVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="deleteAddressVO1Response")
    void deleteAddressVO1(@WebParam(mode = WebParam.Mode.IN, name="addressVO1")
        AddressVOSDO addressVO1) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/mergeAddressVO1",
        operationName="mergeAddressVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="mergeAddressVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="mergeAddressVO1Response")
    @WebResult(name="result")
    AddressVOSDO mergeAddressVO1(@WebParam(mode = WebParam.Mode.IN, name="addressVO1")
        AddressVOSDO addressVO1) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/findAddressVO1",
        operationName="findAddressVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="findAddressVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="findAddressVO1Response")
    @WebResult(name="result")
    List<AddressVOSDO> findAddressVO1(@WebParam(mode = WebParam.Mode.IN, name="findCriteria")
        FindCriteria findCriteria, @WebParam(mode = WebParam.Mode.IN, name="findControl")
        FindControl findControl) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/processAddressVO1",
        operationName="processAddressVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="processAddressVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="processAddressVO1Response")
    @WebResult(name="result")
    List<AddressVOSDO> processAddressVO1(@WebParam(mode = WebParam.Mode.IN,
            name="changeOperation")
        String changeOperation, @WebParam(mode = WebParam.Mode.IN, name="addressVO1")
        List<AddressVOSDO> addressVO1, @WebParam(mode = WebParam.Mode.IN,
            name="processControl")
        ProcessControl processControl) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/processCSAddressVO1",
        operationName="processCSAddressVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="processCSAddressVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="processCSAddressVO1Response")
    @WebResult(name="result")
    ProcessData processCSAddressVO1(@WebParam(mode = WebParam.Mode.IN, name="processData")
        ProcessData processData, @WebParam(mode = WebParam.Mode.IN, name="processControl")
        ProcessControl processControl) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/getCustomersVO1",
        operationName="getCustomersVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="getCustomersVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="getCustomersVO1Response")
    @WebResult(name="result")
    CustomersVOSDO getCustomersVO1(@WebParam(mode = WebParam.Mode.IN, name="custId")
        BigDecimal custId) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/createCustomersVO1",
        operationName="createCustomersVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="createCustomersVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="createCustomersVO1Response")
    @WebResult(name="result")
    CustomersVOSDO createCustomersVO1(@WebParam(mode = WebParam.Mode.IN, name="customersVO1")
        CustomersVOSDO customersVO1) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/updateCustomersVO1",
        operationName="updateCustomersVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="updateCustomersVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="updateCustomersVO1Response")
    @WebResult(name="result")
    CustomersVOSDO updateCustomersVO1(@WebParam(mode = WebParam.Mode.IN, name="customersVO1")
        CustomersVOSDO customersVO1) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/deleteCustomersVO1",
        operationName="deleteCustomersVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="deleteCustomersVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="deleteCustomersVO1Response")
    void deleteCustomersVO1(@WebParam(mode = WebParam.Mode.IN, name="customersVO1")
        CustomersVOSDO customersVO1) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/mergeCustomersVO1",
        operationName="mergeCustomersVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="mergeCustomersVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="mergeCustomersVO1Response")
    @WebResult(name="result")
    CustomersVOSDO mergeCustomersVO1(@WebParam(mode = WebParam.Mode.IN, name="customersVO1")
        CustomersVOSDO customersVO1) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/findCustomersVO1",
        operationName="findCustomersVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="findCustomersVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="findCustomersVO1Response")
    @WebResult(name="result")
    List<CustomersVOSDO> findCustomersVO1(@WebParam(mode = WebParam.Mode.IN,
            name="findCriteria")
        FindCriteria findCriteria, @WebParam(mode = WebParam.Mode.IN, name="findControl")
        FindControl findControl) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/processCustomersVO1",
        operationName="processCustomersVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="processCustomersVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="processCustomersVO1Response")
    @WebResult(name="result")
    List<CustomersVOSDO> processCustomersVO1(@WebParam(mode = WebParam.Mode.IN,
            name="changeOperation")
        String changeOperation, @WebParam(mode = WebParam.Mode.IN, name="customersVO1")
        List<CustomersVOSDO> customersVO1, @WebParam(mode = WebParam.Mode.IN,
            name="processControl")
        ProcessControl processControl) throws ServiceException;

    @WebMethod(action="/techlabs/services/common/customers/processCSCustomersVO1",
        operationName="processCSCustomersVO1")
    @RequestWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="processCSCustomersVO1")
    @ResponseWrapper(targetNamespace="/techlabs/services/common/customers/types/",
        localName="processCSCustomersVO1Response")
    @WebResult(name="result")
    ProcessData processCSCustomersVO1(@WebParam(mode = WebParam.Mode.IN, name="processData")
        ProcessData processData, @WebParam(mode = WebParam.Mode.IN, name="processControl")
        ProcessControl processControl) throws ServiceException;
}