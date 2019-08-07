package by.trjava.task02.service.specification.search.impl;

import by.trjava.task02.entity.Edition;
import by.trjava.task02.service.specification.CompositeSpecificationSearch;

public class SpecificationSearchByTitleFirstLetter extends CompositeSpecificationSearch {
    String firstLetter;

    public SpecificationSearchByTitleFirstLetter(char firstLetter) {
         this.firstLetter = String.valueOf(firstLetter).toLowerCase();
    }
    public SpecificationSearchByTitleFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter.toLowerCase();
    }

    @Override
           public boolean isSatisfiedBy(Edition edition) {
           return this.firstLetter.equals(String.valueOf(edition.getTitle().charAt(0)).toLowerCase());
    }
}
