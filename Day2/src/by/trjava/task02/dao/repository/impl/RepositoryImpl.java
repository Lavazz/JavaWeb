package by.trjava.task02.dao.repository.impl;

import by.trjava.task02.dao.exception.*;
import by.trjava.task02.service.specification.SpecificationSearch;
import by.trjava.task02.dao.repository.Repository;
import by.trjava.task02.entity.Edition;

import java.util.*;

//import static java.util.stream.Collectors.toList;

/**
 * This class to save objects, find and delete these objects in the collection
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @since JDK 1.0
 */
public class RepositoryImpl implements Repository {
    //Singleton
    private static RepositoryImpl instance = new RepositoryImpl();

    public static RepositoryImpl getInstance() {
        return instance;
    }

    private RepositoryImpl() {
    }

    private List<Edition> editionList = new ArrayList<>();

    /**
     * This method get editions from factory and save its in ArrayList
     *
     * @throws WrongKeyDAOException   if Key is empty
     * @throws WrongValueDAOException if value is not String or number
     * @throws WrongPathException     if {@code File} is not find
     * @throws WrongFileException     if an input-output exception occurs
     * @throws NotNumberException     if expected a number from a string, but there is a different type
     */

       @Override
    public void add(Edition edition) {
        if (edition != null) {
            editionList.add(edition);
        }
    }

    /**
     * This method return objects from the repository
     *
     * @return collection with all editions  which which are stored in the repository
     */
    @Override
    public List<Edition> getAll() {
        return editionList;
    }

    @Override
    public List<Edition> find(SpecificationSearch specificationSearch) throws EditionNotFoundException {
        List<Edition> searchedList = new ArrayList<Edition>();
        int count=0;
        for (Edition edition : editionList) {
            //checks whether the object satisfies the search condition
            if (specificationSearch.isSatisfiedBy(edition)) {
                searchedList.add(edition);
                count++;
            }
        }
        if (count==0){
            throw new EditionNotFoundException("Edition with this criterion is not found");
        }
        return searchedList;
    }

    /**
     * This method delete objects, which are saved in the repository
     *
     * @param edition - object, which is necessary delete
     */
    @Override
    public void delete(Edition edition) {
        editionList.remove(edition);
    }

    /**
     * This method sorts objects, which are saved in the repository
     *
     * @param comparator which is needed for sorting
     */
    @Override
    public void sort(Comparator comparator) {
        editionList.sort(comparator);
    }

    @Override
    public void clear() {
        editionList.clear();
    }

}

