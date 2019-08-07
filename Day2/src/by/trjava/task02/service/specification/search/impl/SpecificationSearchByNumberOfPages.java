package by.trjava.task02.service.specification.search.impl;

import by.trjava.task02.entity.Edition;
import by.trjava.task02.service.specification.CompositeSpecificationSearch;
import by.trjava.task02.service.specification.SpecificationSearch;

public class SpecificationSearchByNumberOfPages extends CompositeSpecificationSearch {
    int numberOfPagesMin;
    int numberOfPagesMax;
int numberOfPages;

    public SpecificationSearchByNumberOfPages(int numberOfPagesMin, int numberOfPagesMax) {
        this.numberOfPagesMin = numberOfPagesMin;
        this.numberOfPagesMax = numberOfPagesMax;
    }

    public SpecificationSearchByNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
        this.numberOfPagesMin=numberOfPages-1;
        this.numberOfPagesMax=numberOfPages+1;

    }

    @Override
    public boolean isSatisfiedBy(Edition edition) {
       boolean result=false;

        return numberOfPagesMin<edition.getNumberOfPages()&&numberOfPagesMax>edition.getNumberOfPages();
    }
}
