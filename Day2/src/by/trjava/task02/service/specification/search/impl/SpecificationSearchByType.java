package by.trjava.task02.service.specification.search.impl;

import by.trjava.task02.dao.Parser;
import by.trjava.task02.entity.Edition;
import by.trjava.task02.service.specification.CompositeSpecificationSearch;

public class SpecificationSearchByType extends CompositeSpecificationSearch {
    String type;

    public SpecificationSearchByType(String type) {
        this.type = type;
    }

    @Override
    public boolean isSatisfiedBy(Edition edition) {
        return this.type.equals(edition.getClass().getSimpleName());
    }

}
