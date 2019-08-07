package by.trjava.task02.service.impl;

import by.trjava.task02.dao.FileEditionDAO;
import by.trjava.task02.dao.repository.Repository;
import by.trjava.task02.dao.repository.impl.RepositoryImpl;
import by.trjava.task02.entity.Edition;
import by.trjava.task02.exception.*;
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
    public List<Edition> save() throws NotNumberException, WrongKeyDAOException, WrongFileException, WrongValueDAOException, WrongPathException {

        repository.save();
        return repository.getAll();
    }

    @Override
    public List<Edition> find(SpecificationSearch specificationSearch) {
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
