package by.trjava.task02.dao.impl;

import by.trjava.task02.dao.FileEditionDAO;
import by.trjava.task02.entity.*;
import by.trjava.task02.entity.Magazine;
import by.trjava.task02.entity.Newspaper;
import by.trjava.task02.entity.Album;
import by.trjava.task02.entity.type.EditionType;
import by.trjava.task02.exception.NotNumberException;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * This class contains method for create editions
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @since JDK1.0
 */
public class FileEditionDAOImpl implements FileEditionDAO {
    private static final Logger LOGGER = Logger.getLogger(FileEditionDAOImpl.class);
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
     * @param editionMap  is map with information about the created object
     * @return object {@code Edition} which is transferred to the repository
     * @throws NumberFormatException if expected a number from a string, but there is a different type
     * @throws NotNumberException
     * @see interface FileApplianceDAO
     * @see repository.impl.RepositoryImpl
     */
    @Override
    public Edition create(String editionType, Map<String, Object> editionMap) throws NumberFormatException, NotNumberException {
        try {
            switch (editionType) {
                case "Book":
                    edition = new Book(
                            Integer.parseInt((String) editionMap.get(EditionType.Book.ID.toString())),
                            (String) editionMap.get(EditionType.Book.TITLE.toString()),
                            Integer.parseInt((String) editionMap.get(EditionType.Book.NUMBER_OF_PAGES.toString())),
                            Integer.parseInt((String) editionMap.get(EditionType.Book.RELEASE_YEAR.toString())),
                            Double.parseDouble((String) editionMap.get(EditionType.Book.INITIAL_PRICE.toString())),
                            (String) editionMap.get(EditionType.Book.AUTHOR.toString()),
                            (String) editionMap.get(EditionType.Album.GENRE.toString()));
                    break;
                case "Album":
                    edition = new Album(
                            Integer.parseInt((String) editionMap.get(EditionType.Album.ID.toString())),
                            (String) editionMap.get(EditionType.Album.TITLE.toString()),
                            Integer.parseInt((String) editionMap.get(EditionType.Album.NUMBER_OF_PAGES.toString())),
                            Integer.parseInt((String) editionMap.get(EditionType.Album.RELEASE_YEAR.toString())),
                            Double.parseDouble((String) editionMap.get(EditionType.Album.INITIAL_PRICE.toString())),
                            (String) editionMap.get(EditionType.Album.DESIGNER.toString()),
                            (String) editionMap.get(EditionType.Album.GENRE.toString()));
                    break;
                case "Magazine":
                    edition = new Magazine(
                            Integer.parseInt((String) editionMap.get(EditionType.Magazine.ID.toString())),
                            (String) editionMap.get(EditionType.Magazine.TITLE.toString()),
                            Integer.parseInt((String) editionMap.get(EditionType.Magazine.NUMBER_OF_PAGES.toString())),
                            Integer.parseInt((String) editionMap.get(EditionType.Magazine.RELEASE_YEAR.toString())),
                            Double.parseDouble((String) editionMap.get(EditionType.Magazine.INITIAL_PRICE.toString())),
                            (String) editionMap.get(EditionType.Magazine.EDITOR.toString()),
                            Integer.parseInt((String) editionMap.get(EditionType.Magazine.RELEASE_MONTH.toString())),
                            (String) editionMap.get(EditionType.Magazine.GENRE.toString()));

                    break;
                case "Newspaper":
                    edition = new Newspaper(
                            Integer.parseInt((String) editionMap.get(EditionType.Newspaper.ID.toString())),
                            (String) editionMap.get(EditionType.Newspaper.TITLE.toString()),
                            Integer.parseInt((String) editionMap.get(EditionType.Newspaper.NUMBER_OF_PAGES.toString())),
                            Integer.parseInt((String) editionMap.get(EditionType.Newspaper.RELEASE_YEAR.toString())),
                            Double.parseDouble((String) editionMap.get(EditionType.Newspaper.INITIAL_PRICE.toString())),
                            (String) editionMap.get(EditionType.Newspaper.EDITOR.toString()),
                            Integer.parseInt((String) editionMap.get(EditionType.Newspaper.RELEASE_MONTH.toString())),
                            (String) editionMap.get(EditionType.Newspaper.GENRE.toString()));
                    break;
                default:
                    LOGGER.debug("Edition type is wrong " + editionType);
                    throw new IllegalStateException("Unexpected value: " + editionType);
            }
        } catch (NumberFormatException nfe) {
            LOGGER.debug("Value in map is not number: " + nfe);
            throw new NotNumberException("Value in map is incorrect: ", nfe);
        }
        return edition;
    }

}




