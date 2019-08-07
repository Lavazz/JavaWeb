package by.trjava.task02.service.util.impl;

import by.trjava.task02.entity.Edition;
import by.trjava.task02.service.util.UtilSpecification;

import java.util.List;

public class UtilSpecificationImpl implements UtilSpecification {

    int sumOfPagesInGenre=0;

    private static UtilSpecification instance=new UtilSpecificationImpl();

    public static UtilSpecification getInstance(){
        return instance;
    }

    UtilSpecificationImpl(){}

   @Override
    public int calculateSum(List<Edition> editionList){
        for(Edition edition: editionList) {
            sumOfPagesInGenre+=edition.getNumberOfPages();
        }
        return sumOfPagesInGenre;
    }
}
