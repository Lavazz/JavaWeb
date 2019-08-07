package by.trjava.task02.dao;

import by.trjava.task02.dao.impl.FileEditionDAOImpl;

/**
 * This class responsible for creating a single instance appliances
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */

public class DAOFactory {
    //Singleton
    private static final DAOFactory instance = new DAOFactory();

    public static DAOFactory getInstance() {
        return instance;
    }

    private DAOFactory() {
    }

    private final FileEditionDAO editionDAO = FileEditionDAOImpl.getInstance();

    public FileEditionDAO getEditionDAO() {
        return editionDAO;
    }



}
