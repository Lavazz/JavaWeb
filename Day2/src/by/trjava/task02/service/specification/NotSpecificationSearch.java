package by.trjava.task02.service.specification;

import by.trjava.task02.entity.Edition;

class NotSpecificationSearch extends CompositeSpecificationSearch {
    private SpecificationSearch spec1;

    public NotSpecificationSearch(SpecificationSearch spec1) {
        this.spec1 = spec1;
    }

    public boolean isSatisfiedBy(Edition edition) {
        return !spec1.isSatisfiedBy(edition);
    }
}
