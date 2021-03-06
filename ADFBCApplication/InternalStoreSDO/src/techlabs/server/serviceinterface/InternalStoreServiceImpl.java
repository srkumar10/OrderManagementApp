package techlabs.server.serviceinterface;

import java.lang.reflect.Method;

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

import techlabs.common.InternalStoreViewSDO;
import techlabs.common.serviceinterface.InternalStoreService;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 21 22:17:32 EDT 2016
// ---------------------------------------------------------------------
@Stateless(name="techlabs.common.InternalStoreServiceBean", mappedName="InternalStoreServiceBean")
@Remote(InternalStoreService.class)
@PortableWebService(targetNamespace="http://xmlns.techlabs.local/oracle/apps",
    serviceName="InternalStoreService", portName="InternalStoreServiceSoapHttpPort",
    endpointInterface="techlabs.common.serviceinterface.InternalStoreService")
@Interceptors( { ServiceContextInterceptor.class })
public class InternalStoreServiceImpl extends ServiceImpl implements InternalStoreService {
    private static boolean _isInited = false;

    /**
     * This is the default constructor (do not remove).
     */
    public InternalStoreServiceImpl() {
        init();
        setApplicationModuleDefName("techlabs.InternalStoreAppModule");
        setConfigurationName("InternalStoreService");
    }

    /**
     * Generated method. Do not modify. Do initialization in the constructor
     */
    protected void init() {
        if (_isInited) {
            return;
        }
        synchronized (InternalStoreServiceImpl.class) {
            if (_isInited) {
                return;
            }
            try {
                SDOHelper.INSTANCE.defineSchema("techlabs/common/serviceinterface/", "InternalStoreService.xsd");
                _isInited = true;
            } catch (Exception ex) {
                Diagnostic.printStackTrace(ex);
            }
        }
    }

    /**
     * getInternalStoreView1: generated method. Do not modify.
     */
    public InternalStoreViewSDO getInternalStoreView1(String prodId) throws ServiceException {
        return (InternalStoreViewSDO)get(new Object[] { prodId },
                                         "InternalStoreView1",
                                         InternalStoreViewSDO.class);
    }

    /**
     * createInternalStoreView1: generated method. Do not modify.
     */
    public InternalStoreViewSDO createInternalStoreView1(InternalStoreViewSDO internalStoreView1) throws ServiceException {
        return (InternalStoreViewSDO)create(internalStoreView1,
                                            "InternalStoreView1");
    }

    /**
     * updateInternalStoreView1: generated method. Do not modify.
     */
    public InternalStoreViewSDO updateInternalStoreView1(InternalStoreViewSDO internalStoreView1) throws ServiceException {
        return (InternalStoreViewSDO)update(internalStoreView1,
                                            "InternalStoreView1");
    }

    /**
     * deleteInternalStoreView1: generated method. Do not modify.
     */
    public void deleteInternalStoreView1(InternalStoreViewSDO internalStoreView1) throws ServiceException {
        delete(internalStoreView1, "InternalStoreView1");
    }

    /**
     * mergeInternalStoreView1: generated method. Do not modify.
     */
    public InternalStoreViewSDO mergeInternalStoreView1(InternalStoreViewSDO internalStoreView1) throws ServiceException {
        return (InternalStoreViewSDO)merge(internalStoreView1,
                                           "InternalStoreView1");
    }

    /**
     * findInternalStoreView1: generated method. Do not modify.
     */
    public List<InternalStoreViewSDO> findInternalStoreView1(FindCriteria findCriteria,
                                                             FindControl findControl) throws ServiceException {
        return (List<InternalStoreViewSDO>)find(findCriteria, findControl,
                                                "InternalStoreView1",
                                                InternalStoreViewSDO.class);
    }

    /**
     * processInternalStoreView1: generated method. Do not modify.
     */
    public List<InternalStoreViewSDO> processInternalStoreView1(String changeOperation,
                                                                List<InternalStoreViewSDO> internalStoreView1,
                                                                ProcessControl processControl) throws ServiceException {
        return (List<InternalStoreViewSDO>)process(changeOperation,
                                                   processControl,
                                                   internalStoreView1,
                                                   "InternalStoreView1");
    }

    /**
     * processCSInternalStoreView1: generated method. Do not modify.
     */
    public ProcessData processCSInternalStoreView1(ProcessData processData,
                                                   ProcessControl processControl) throws ServiceException {
        return processChangeSummary(processData, processControl, "InternalStoreView1");
    }
}
