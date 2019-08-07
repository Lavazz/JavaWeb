package by.trjava.task02.service;

import by.trjava.task02.entity.Edition;
import by.trjava.task02.exception.*;
import by.trjava.task02.service.specification.SpecificationSearch;

import java.util.Comparator;
import java.util.List;

public interface EditionService {
    List<Edition> save() throws NotNumberException, WrongKeyDAOException, WrongFileException, WrongValueDAOException, WrongPathException;

    List<Edition> find(SpecificationSearch specificationSearch);

    void delete(Edition edition);

    void sort(Comparator<Edition> comparator);

    void clear();
}
