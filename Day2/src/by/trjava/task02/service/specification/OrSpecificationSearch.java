package by.trjava.task02.service.specification;

import by.trjava.task02.entity.Edition;

class OrSpecificationSearch extends CompositeSpecificationSearch {
    private SpecificationSearch spec1;
    private SpecificationSearch spec2;

    public OrSpecificationSearch(SpecificationSearch spec1, SpecificationSearch spec2) {
        this.spec1 = spec1;
        this.spec2 = spec2;
    }

    public boolean isSatisfiedBy(Edition edition) {
        return spec1.isSatisfiedBy(edition) || spec2.isSatisfiedBy(edition);
    }
}
