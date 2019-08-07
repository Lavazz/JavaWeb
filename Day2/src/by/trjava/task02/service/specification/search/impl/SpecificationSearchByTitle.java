package by.trjava.task02.service.specification.search.impl;

import by.trjava.task02.entity.Edition;
import by.trjava.task02.service.specification.CompositeSpecificationSearch;
import by.trjava.task02.service.specification.SpecificationSearch;

public class SpecificationSearchByTitle extends CompositeSpecificationSearch {
    String title;

    public SpecificationSearchByTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean isSatisfiedBy(Edition edition) {
    return this.title.equals(edition.getTitle());
}
    }

