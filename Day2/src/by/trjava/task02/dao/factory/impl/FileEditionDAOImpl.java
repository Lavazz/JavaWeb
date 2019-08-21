package by.trjava.task02.dao.factory.impl;

import by.trjava.task02.dao.FileEditionDAO;
import by.trjava.task02.dao.repository.impl.RepositoryImpl;
import by.trjava.task02.entity.*;
import by.trjava.task02.entity.Magazine;
import by.trjava.task02.entity.Newspaper;
import by.trjava.task02.entity.Album;
import by.trjava.task02.dao.exception.NotNumberException;

/**
 * This class contains method for create editions
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @since JDK1.0
 */
public class FileEditionDAOImpl implements FileEditionDAO {
    // Singleton
    private static FileEditionDAOImpl instance = new FileEditionDAOImpl();

    public static FileEditionDAOImpl getInstance() {
        return instance;
    }

    private FileEditionDAOImpl() {
    }

    Edition edition = null;

    /**
     * This method creates objects, which are transferred to the repository
     *
     * @param editionType type of object, which is necessary create
     * @return object {@code Edition} which is transferred to the repository
     * @throws NumberFormatException if expected a number from a string, but there is a different type
     * @throws NotNumberException
     * @see interface FileApplianceDAO
     * @see RepositoryImpl
     */
    @Override
    public Edition create(String editionType) throws NumberFormatException, NotNumberException {
        try {
            switch (editionType) {
                case "Book":
                    edition = new Book();
                    break;
                case "Album":
                    edition = new Album();
                    break;
                case "Magazine":
                    edition = new Magazine();
                    break;
                case "Newspaper":
                    edition = new Newspaper();
                    break;
            }
        } catch (NumberFormatException nfe) {
            throw new NotNumberException("Value in map is incorrect: ", nfe);
        }
        return edition;
    }

}




