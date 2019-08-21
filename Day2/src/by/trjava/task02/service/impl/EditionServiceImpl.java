package by.trjava.task02.service.impl;

import by.trjava.task02.dao.FileEditionDAO;
import by.trjava.task02.dao.exception.EditionNotFoundException;
import by.trjava.task02.dao.repository.Repository;
import by.trjava.task02.dao.repository.impl.RepositoryImpl;
import by.trjava.task02.entity.Edition;
import by.trjava.task02.dao.exception.*;
import by.trjava.task02.service.EditionService;
import by.trjava.task02.service.specification.SpecificationSearch;

import java.util.Comparator;
import java.util.List;

public class EditionServiceImpl implements EditionService {

//    private static EditionService instance = new EditionServiceImpl();
//
//    public static EditionService getInstance() {
//        return instance;
//    }
//
//    public EditionServiceImpl() {
//    }

    Repository repository = RepositoryImpl.getInstance();

    @Override
    public void add(Edition edition) {
        repository.add(edition);
    }

    @Override
    public List<Edition> getAll(){
       return repository.getAll();
    }

    @Override
    public List<Edition> find(SpecificationSearch specificationSearch) throws EditionNotFoundException {
        return repository.find(specificationSearch);
    }

    @Override
    public void delete(Edition edition) {
        repository.delete(edition);
    }

    @Override
    public void sort(Comparator<Edition> comparator) {
        repository.sort(comparator);
    }

    @Override
    public void clear() {
        repository.clear();
    }
}
