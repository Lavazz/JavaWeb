package repository.impl;

import by.trjava.task02.dao.Creator;
import by.trjava.task02.dao.exception.*;
import by.trjava.task02.dao.repository.impl.RepositoryImpl;
import by.trjava.task02.entity.Book;
import by.trjava.task02.entity.Edition;
import by.trjava.task02.entity.Newspaper;
import by.trjava.task02.service.comparator.ComparatorByReleaseYear;
import by.trjava.task02.service.specification.SpecificationSearch;
import by.trjava.task02.service.specification.search.impl.*;
import org.junit.Test;
import by.trjava.task02.dao.repository.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class RepositoryImplTest {

    Creator creator=Creator.getInstance();
    Repository repository = RepositoryImpl.getInstance();
    @Test
    public void findByTitle() throws NotNumberException, WrongKeyDAOException, WrongFileException, WrongValueDAOException, WrongPathException, EditionNotFoundException, IncorrectTypeException {
       creator.create();
        repository.getAll();

        SpecificationSearch specificationSearch = new SpecificationSearchByTitle("trafficRegulations");
        List<Edition> actual = repository.find(specificationSearch);

        List<Edition> expected = new ArrayList<>();
        expected.add(new Book(2, "trafficRegulations", 296, 2017, 10,
                "Pavlov", "BookEducation"));
        assertEquals(expected, actual);
        repository.clear();
    }

    @Test
    public void findByType() throws NotNumberException, WrongKeyDAOException, WrongFileException, WrongValueDAOException, WrongPathException, EditionNotFoundException, IncorrectTypeException {
        creator.create();
        repository.getAll();

        SpecificationSearch specificationSearch = new SpecificationSearchByType("Book");
        List<Edition> actual = repository.find(specificationSearch);

        List<Edition> expected = new ArrayList<>();
        expected.add(new Book(1, "HarryPotter", 200, 1997, 60,
                "Rowling", "Belletristic"));
        expected.add(new Book(2, "trafficRegulations", 296, 2017, 10,
                "Pavlov", "BookEducation"));
        expected.add(new Book(3, "WarAndPeace", 1226, 1869, 8,
                "Tolstoy", "Belletristic"));
        expected.add(new Book(4, "JavaMethodsProgrammings", 898, 2013, 11,
                "Blinov", "BookEducation"));
        expected.add(new Book(5, "TheMasterAndMargarita", 256, 1967, 8,
                "Bulgakov", "Belletristic"));
        assertEquals(expected, actual);
        repository.clear();
    }


    @Test
    public void findByFirsLetter() throws NotNumberException, WrongKeyDAOException, WrongFileException, WrongValueDAOException, WrongPathException, EditionNotFoundException, IncorrectTypeException {
        creator.create();
        repository.getAll();

        SpecificationSearch specificationSearch = new SpecificationSearchByTitleFirstLetter("T");
        List<Edition> actual = repository.find(specificationSearch);

        List<Edition> expected = new ArrayList<>();
        expected.add(new Book(2, "trafficRegulations", 296, 2017, 10,
                "Pavlov", "BookEducation"));
        expected.add(new Book(5, "TheMasterAndMargarita", 256, 1967, 8,
                "Bulgakov", "Belletristic"));
        expected.add(new Newspaper(10, "Times", 22, 2007, 8,
                "Danko", 4, "political"));

        assertEquals(expected, actual);
        repository.clear();
    }

    @Test
    public void findTwoParameters() throws NotNumberException, WrongKeyDAOException, WrongFileException, WrongValueDAOException, WrongPathException, EditionNotFoundException, IncorrectTypeException {
        creator.create();
        repository.getAll();

        SpecificationSearch specificationSearch = new SpecificationSearchByGenre("Belletristic");
        SpecificationSearch specificationSearch1 = new SpecificationSearchByNumberOfPages(100, 400);
        List<Edition> actual = repository.find(specificationSearch.And(specificationSearch1));

        List<Edition> expected = new ArrayList<>();
        expected.add(new Book(1, "HarryPotter", 200, 1997, 60,
                "Rowling", "Belletristic"));
        expected.add(new Book(5, "TheMasterAndMargarita", 256, 1967, 8,
                "Bulgakov", "Belletristic"));
        assertEquals(expected, actual);
        repository.clear();
    }

    @Test
    public void sort() throws NotNumberException, WrongKeyDAOException, WrongFileException, WrongValueDAOException, WrongPathException, EditionNotFoundException, IncorrectTypeException {
        creator.create();
        repository.getAll();

        SpecificationSearch specificationSearch = new SpecificationSearchByGenre("Belletristic");
        List<Edition> actual = repository.find(specificationSearch);
        Comparator comparator = new ComparatorByReleaseYear();
        actual.sort(comparator);

        List<Edition> expected = new ArrayList<>();

        expected.add(new Book(3, "WarAndPeace", 1226, 1869, 8,
                "Tolstoy", "Belletristic"));
        expected.add(new Book(5, "TheMasterAndMargarita", 256, 1967, 8,
                "Bulgakov", "Belletristic"));
        expected.add(new Book(1, "HarryPotter", 200, 1997, 60,
                "Rowling", "Belletristic"));

        assertEquals(expected, actual);
        repository.clear();
    }

    @Test
    public void delete() throws NotNumberException, WrongKeyDAOException, WrongFileException, WrongValueDAOException, WrongPathException {
        Repository repository = RepositoryImpl.getInstance();
        repository.add(new Book(3, "WarAndPeace", 1226, 1869, 8,
                "Tolstoy", "Belletristic"));
        repository.add(new Book(5, "TheMasterAndMargarita", 256, 1967, 8,
                "Bulgakov", "Belletristic"));
        repository.add(new Book(1, "HarryPotter", 200, 1997, 60,
                "Rowling", "Belletristic"));

        repository.delete((new Book(3, "WarAndPeace", 1226, 1869, 8,
                "Tolstoy", "Belletristic")));

        List<Edition> expected = new ArrayList<>();

        expected.add(new Book(5, "TheMasterAndMargarita", 256, 1967, 8,
                "Bulgakov", "Belletristic"));
        expected.add(new Book(1, "HarryPotter", 200, 1997, 60,
                "Rowling", "Belletristic"));

        assertEquals(expected, repository.getAll());
        repository.clear();
    }
}