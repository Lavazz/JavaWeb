package by.trjava.task02.service;

import by.trjava.task02.dao.exception.EditionNotFoundException;
import by.trjava.task02.entity.Edition;
import by.trjava.task02.dao.exception.*;
import by.trjava.task02.service.specification.SpecificationSearch;

import java.util.Comparator;
import java.util.List;

public interface EditionService {

    public void add(Edition edition);

    List<Edition> getAll();

    List<Edition> find(SpecificationSearch specificationSearch) throws EditionNotFoundException;

    void delete(Edition edition);

    void sort(Comparator<Edition> comparator);

    void clear();
}
