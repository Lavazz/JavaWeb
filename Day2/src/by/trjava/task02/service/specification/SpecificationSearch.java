package by.trjava.task02.service.specification;

import by.trjava.task02.entity.Edition;

public interface SpecificationSearch {
    boolean isSatisfiedBy(Edition edition);
    SpecificationSearch And(SpecificationSearch other);
    SpecificationSearch Or(SpecificationSearch other);
    SpecificationSearch Not();
}

