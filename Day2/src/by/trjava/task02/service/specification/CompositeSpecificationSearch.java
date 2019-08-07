package by.trjava.task02.service.specification;

import by.trjava.task02.entity.Edition;

public abstract class CompositeSpecificationSearch implements SpecificationSearch {
    public abstract boolean isSatisfiedBy(Edition edition);

    public SpecificationSearch And(SpecificationSearch other) {
        return new AndSpecificationSearch(this, other);
    }

    public SpecificationSearch Or(SpecificationSearch other) {
        return new OrSpecificationSearch(this, other);
    }

    public SpecificationSearch Not() {
        return new NotSpecificationSearch(this);
    }
}
