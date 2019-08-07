package by.trjava.task02.service.specification.search.impl;

import by.trjava.task02.entity.Edition;
import by.trjava.task02.service.specification.CompositeSpecificationSearch;
import by.trjava.task02.service.specification.SpecificationSearch;

public class SpecificationSearchByID extends CompositeSpecificationSearch  {
    int id;

    public SpecificationSearchByID(int id) {
        this.id = id;
    }

    @Override
    public boolean isSatisfiedBy(Edition edition) {
        return this.id==edition.getId();

    }
}
