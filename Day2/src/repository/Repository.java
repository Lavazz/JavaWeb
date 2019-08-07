package repository;

import by.trjava.task02.entity.Edition;
import by.trjava.task02.exception.*;
import by.trjava.task02.service.specification.SpecificationSearch;

import java.util.Comparator;
import java.util.List;

public interface Repository<T extends Edition> {
    void save() throws WrongValueDAOException, WrongPathException, WrongFileException, NotNumberException, WrongKeyDAOException;

    List<T> getAll();

    List<Edition> find(SpecificationSearch specificationSearch);

    void delete(T edition);

    void sort(Comparator<T> comparator);

    void clear();

}
