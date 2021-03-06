package techlabs.services.server.serviceinterface;

import java.lang.reflect.Method;

import java.math.BigDecimal;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import javax.interceptor.Interceptors;

import oracle.jbo.common.Diagnostic;
import oracle.jbo.common.sdo.SDOHelper;
import oracle.jbo.common.service.types.FindControl;
import oracle.jbo.common.service.types.FindCriteria;
import oracle.jbo.common.service.types.ProcessControl;
import oracle.jbo.common.service.types.ProcessData;
import oracle.jbo.server.svc.ServiceContextInterceptor;
import oracle.jbo.server.svc.ServiceImpl;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;

import techlabs.services.common.serviceinterface.OrdersService;

import techlabs.views.common.ItemsVOSDO;
import techlabs.views.common.OrdersVOSDO;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Apr 16 09:56:04 EDT 2016
// ---------------------------------------------------------------------
@Stateless(name="techlabs.services.common.OrdersServiceBean", mappedName="OrdersServiceBean")
@Remote(OrdersService.class)
@PortableWebService(targetNamespace="/techlabs/services/common/", serviceName="OrdersService",
    portName="OrdersServiceSoapHttpPort", endpointInterface="techlabs.services.common.serviceinterface.OrdersService")
@Interceptors( { ServiceContextInterceptor.class })
public class OrdersServiceImpl extends ServiceImpl implements OrdersService {
    private static boolean _isInited = false;

    /**
     * This is the default constructor (do not remove).
     */
    public OrdersServiceImpl() {
        init();
        setApplicationModuleDefName("techlabs.services.OrdersSDOAppModule");
        setConfigurationName("OrdersService");
    }

    /**
     * Generated method. Do not modify. Do initialization in the constructor
     */
    protected void init() {
        if (_isInited) {
            return;
        }
        synchronized (OrdersServiceImpl.class) {
            if (_isInited) {
                return;
            }
            try {
                SDOHelper.INSTANCE.defineSchema("techlabs/services/common/serviceinterface/", "OrdersService.xsd");
                _isInited = true;
            } catch (Exception ex) {
                Diagnostic.printStackTrace(ex);
            }
        }
    }

    /**
     * getItemsVO1: generated method. Do not modify.
     */
    public ItemsVOSDO getItemsVO1(BigDecimal itemId) throws ServiceException {
        return (ItemsVOSDO)get(new Object[] { itemId }, "ItemsVO1",
                               ItemsVOSDO.class);
    }

    /**
     * createItemsVO1: generated method. Do not modify.
     */
    public ItemsVOSDO createItemsVO1(ItemsVOSDO itemsVO1) throws ServiceException {
        return (ItemsVOSDO)create(itemsVO1, "ItemsVO1");
    }

    /**
     * updateItemsVO1: generated method. Do not modify.
     */
    public ItemsVOSDO updateItemsVO1(ItemsVOSDO itemsVO1) throws ServiceException {
        return (ItemsVOSDO)update(itemsVO1, "ItemsVO1");
    }

    /**
     * deleteItemsVO1: generated method. Do not modify.
     */
    public void deleteItemsVO1(ItemsVOSDO itemsVO1) throws ServiceException {
        delete(itemsVO1, "ItemsVO1");
    }

    /**
     * mergeItemsVO1: generated method. Do not modify.
     */
    public ItemsVOSDO mergeItemsVO1(ItemsVOSDO itemsVO1) throws ServiceException {
        return (ItemsVOSDO)merge(itemsVO1, "ItemsVO1");
    }

    /**
     * findItemsVO1: generated method. Do not modify.
     */
    public List<ItemsVOSDO> findItemsVO1(FindCriteria findCriteria,
                                         FindControl findControl) throws ServiceException {
        return (List<ItemsVOSDO>)find(findCriteria, findControl, "ItemsVO1",
                                      ItemsVOSDO.class);
    }

    /**
     * processItemsVO1: generated method. Do not modify.
     */
    public List<ItemsVOSDO> processItemsVO1(String changeOperation,
                                            List<ItemsVOSDO> itemsVO1,
                                            ProcessControl processControl) throws ServiceException {
        return (List<ItemsVOSDO>)process(changeOperation, processControl,
                                         itemsVO1, "ItemsVO1");
    }

    /**
     * processCSItemsVO1: generated method. Do not modify.
     */
    public ProcessData processCSItemsVO1(ProcessData processData,
                                         ProcessControl processControl) throws ServiceException {
        return processChangeSummary(processData, processControl, "ItemsVO1");
    }

    /**
     * getOrdersVO1: generated method. Do not modify.
     */
    public OrdersVOSDO getOrdersVO1(BigDecimal ordId) throws ServiceException {
        return (OrdersVOSDO)get(new Object[] { ordId }, "OrdersVO1",
                                OrdersVOSDO.class);
    }

    /**
     * createOrdersVO1: generated method. Do not modify.
     */
    public OrdersVOSDO createOrdersVO1(OrdersVOSDO ordersVO1) throws ServiceException {
        return (OrdersVOSDO)create(ordersVO1, "OrdersVO1");
    }

    /**
     * updateOrdersVO1: generated method. Do not modify.
     */
    public OrdersVOSDO updateOrdersVO1(OrdersVOSDO ordersVO1) throws ServiceException {
        return (OrdersVOSDO)update(ordersVO1, "OrdersVO1");
    }

    /**
     * deleteOrdersVO1: generated method. Do not modify.
     */
    public void deleteOrdersVO1(OrdersVOSDO ordersVO1) throws ServiceException {
        delete(ordersVO1, "OrdersVO1");
    }

    /**
     * mergeOrdersVO1: generated method. Do not modify.
     */
    public OrdersVOSDO mergeOrdersVO1(OrdersVOSDO ordersVO1) throws ServiceException {
        return (OrdersVOSDO)merge(ordersVO1, "OrdersVO1");
    }

    /**
     * findOrdersVO1: generated method. Do not modify.
     */
    public List<OrdersVOSDO> findOrdersVO1(FindCriteria findCriteria,
                                           FindControl findControl) throws ServiceException {
        return (List<OrdersVOSDO>)find(findCriteria, findControl, "OrdersVO1",
                                       OrdersVOSDO.class);
    }

    /**
     * processOrdersVO1: generated method. Do not modify.
     */
    public List<OrdersVOSDO> processOrdersVO1(String changeOperation,
                                              List<OrdersVOSDO> ordersVO1,
                                              ProcessControl processControl) throws ServiceException {
        return (List<OrdersVOSDO>)process(changeOperation, processControl,
                                          ordersVO1, "OrdersVO1");
    }

    /**
     * processCSOrdersVO1: generated method. Do not modify.
     */
    public ProcessData processCSOrdersVO1(ProcessData processData,
                                          ProcessControl processControl) throws ServiceException {
        return processChangeSummary(processData, processControl, "OrdersVO1");
    }
}
