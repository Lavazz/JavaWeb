package by.trjava.task02.controller;

import by.trjava.task02.entity.Book;
import by.trjava.task02.entity.Edition;
import by.trjava.task02.exception.*;
import by.trjava.task02.service.comparator.ComparatorByReleaseYear;
import by.trjava.task02.service.comparator.ComparatorByTitle;
import by.trjava.task02.service.specification.SpecificationSearch;
import by.trjava.task02.service.specification.search.impl.SpecificationSearchByGenre;
import by.trjava.task02.service.specification.search.impl.SpecificationSearchByNumberOfPages;
import by.trjava.task02.service.specification.search.impl.SpecificationSearchByTitleFirstLetter;
import by.trjava.task02.service.specification.search.impl.SpecificationSearchByType;
import by.trjava.task02.service.specification.util.UtilSpecification;
import by.trjava.task02.service.specification.util.impl.UtilSpecificationImpl;
import org.apache.log4j.Logger;
import repository.Repository;
import repository.impl.RepositoryImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LibraryImpl implements Library {
    String name;
    int count;

    private static LibraryImpl instance = new LibraryImpl();

    public static LibraryImpl getInstance() {
        return instance;
    }

    private LibraryImpl() {
    }

    private static final Logger LOGGER = Logger.getLogger(LibraryImpl.class);

    Repository repository = RepositoryImpl.getInstance();
    List<Edition> editionList = new ArrayList<>();

    @Override
    public void makeLibrary() {

        try {
            repository.save();
            editionList = repository.getAll();
            LOGGER.info("Save all editions in repository: ");
            for (Edition edition : editionList) {
                LOGGER.info(edition);
            }
        } catch (WrongPathException | WrongKeyDAOException | WrongValueDAOException | NotNumberException | WrongFileException e) {
            LOGGER.error("Check parameters" + e.getMessage());
        }

        SpecificationSearch specificationSearch = new SpecificationSearchByType("Book");
        List<Edition> search = repository.find(specificationSearch);
        LOGGER.info("\n");
        LOGGER.info("Find next Book:");
        for (Edition edition : search) {
            LOGGER.info(edition);
        }

        LOGGER.info("\n");
        UtilSpecification utilSpecification = UtilSpecificationImpl.getInstance();
        int sum = utilSpecification.calculateSum(search);
        LOGGER.info("Sum of pages of all books :" + sum + " pages");

        SpecificationSearch searchByGenre = new SpecificationSearchByGenre("Belletristic");
        SpecificationSearch searchByRangePages = new SpecificationSearchByNumberOfPages(100, 400);
        List<Edition> searchGenre = repository.find(searchByGenre.And(searchByRangePages));
        LOGGER.info("\n");
        LOGGER.info("Find next belletristic Books with number of pages 205-300 :");
        for (Edition edition : searchGenre) {
            LOGGER.info(edition);
        }

        SpecificationSearch searchByFirstLetter = new SpecificationSearchByTitleFirstLetter("T");
        List<Edition> searchFirstLetter = repository.find(searchByFirstLetter);
        LOGGER.info("\n");
        LOGGER.info("Find next editions start with letter T: ");
        for (Edition edition : searchFirstLetter) {
            LOGGER.info(edition);
            repository.clear();
        }


        Comparator comparator = new ComparatorByReleaseYear();
        editionList.sort(comparator);
        LOGGER.info("\n");
        LOGGER.info("Sort editions by release year: ");
        for (Edition edition : editionList) {
            LOGGER.info(edition);
        }


        // repository.clear();

    }

}
