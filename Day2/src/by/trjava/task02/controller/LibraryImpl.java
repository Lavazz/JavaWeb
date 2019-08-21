package by.trjava.task02.controller;

import by.trjava.task02.dao.Creator;
import by.trjava.task02.dao.exception.*;
import by.trjava.task02.entity.Edition;
import by.trjava.task02.service.EditionService;
import by.trjava.task02.service.ServiceRepository;
import by.trjava.task02.service.comparator.ComparatorByReleaseYear;
import by.trjava.task02.service.specification.SpecificationSearch;
import by.trjava.task02.service.specification.search.impl.*;
import by.trjava.task02.service.util.UtilSpecification;
import by.trjava.task02.service.util.impl.UtilSpecificationImpl;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LibraryImpl implements Library {

    private static LibraryImpl instance = new LibraryImpl();

    public static LibraryImpl getInstance() {
        return instance;
    }

    private LibraryImpl() {
    }

    private static final Logger LOGGER = Logger.getLogger(LibraryImpl.class);

    ServiceRepository serviceRepository = ServiceRepository.getInstance();
    EditionService editionService = serviceRepository.getEditionService();
    List<Edition> editionList = new ArrayList<>();
    Creator creator=Creator.getInstance();

    @Override
    public void makeLibrary() {

        try {
            creator.create();
            List<Edition> editionList=editionService.getAll();
            LOGGER.info("Save all editions in repository: ");
            for (Edition edition : editionList) {
                LOGGER.info(edition);
            }
        } catch (WrongPathException | WrongKeyDAOException | WrongValueDAOException
                                     | NotNumberException | WrongFileException | IncorrectTypeException e) {
            LOGGER.error(e.getMessage());
        }

        SpecificationSearch specificationSearch = new SpecificationSearchByType("Book");
        List<Edition> search = null;
        try {
            search = editionService.find(specificationSearch);
        } catch (EditionNotFoundException e) {
            LOGGER.error(e.getMessage());
        }
        LOGGER.info("\"======================\""+"\n");
        LOGGER.info("Find next Book:");
        for (Edition edition : search) {
            LOGGER.info(edition);
        }

        LOGGER.info("\"======================\""+"\n");
        UtilSpecification utilSpecification = UtilSpecificationImpl.getInstance();
        int sum = utilSpecification.calculateSum(search);
        LOGGER.info("Sum of pages of all books :" + sum + " pages");

        LOGGER.info("\"======================\""+"\n");
        SpecificationSearch searchByID = new SpecificationSearchByID(7);
       // List<Edition> ed=new ArrayList<>();
        try {
            List<Edition> ed = editionService.find(searchByID);

        double price=ed.get(0).calculateCurrentPrice();
        LOGGER.info("initialPrise="+ed.get(0).getInitialPrice());
        LOGGER.info("currentPrice="+price);
        } catch (EditionNotFoundException e) {
            LOGGER.error(e.getMessage());
        }

        SpecificationSearch searchByGenre = new SpecificationSearchByGenre("Belletristic");
        SpecificationSearch searchByRangePages = new SpecificationSearchByNumberOfPages(100, 400);
        List<Edition> searchGenre = null;
        try {
            searchGenre = editionService.find(searchByGenre.And(searchByRangePages));
        } catch (EditionNotFoundException e) {
            LOGGER.error(e.getMessage());
        }
        LOGGER.info("\"======================\""+"\n");
        LOGGER.info("Find next belletristic Books with number of pages 205-300 :");
        for (Edition edition : searchGenre) {
            LOGGER.info(edition);
        }

        SpecificationSearch searchByFirstLetter = new SpecificationSearchByTitleFirstLetter("T");
        List<Edition> searchFirstLetter = null;
        try {
            searchFirstLetter = editionService.find(searchByFirstLetter);
        } catch (EditionNotFoundException e) {
            LOGGER.error(e.getMessage());
        }
        LOGGER.info("\"======================\""+"\n");
        LOGGER.info("Find next editions start with letter T: ");
        for (Edition edition : searchFirstLetter) {
            LOGGER.info(edition);
        }

        editionList=editionService.getAll();
        Comparator comparator = new ComparatorByReleaseYear();
        editionList.sort(comparator);
        LOGGER.info("\"======================\""+"\n");
        LOGGER.info("Sort editions by release year: ");
        for (Edition edition : editionList) {
            LOGGER.info(edition);
        }
    }

}