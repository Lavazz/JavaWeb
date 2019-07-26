package by.trjava.task01.dao;

import by.trjava.task01.dao.impl.FileApplianceDAOImpl;

/**
 * This class responsible for creating a single instance appliances
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */
public final class DAOFactory {
    //Singleton
    private static final DAOFactory instance = new DAOFactory();

    public static DAOFactory getInstance() {
        return instance;
    }

    private DAOFactory() {
    }

    private final FileApplianceDAO applianceDAO = FileApplianceDAOImpl.getInstance();

    public FileApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }

}