package by.trjava.task01.service;

import by.trjava.task01.service.impl.ApplianceServiceImpl;

/**
 * This class create instance of ServiceFactory
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @see ServiceFactory
 * @since JDK1.0
 */
public final class ServiceFactory {
    //Singleton
    private static final ServiceFactory instance = new ServiceFactory();

    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceFactory() {
    }

    public ApplianceService getApplianceService() {
        return applianceService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }
}
