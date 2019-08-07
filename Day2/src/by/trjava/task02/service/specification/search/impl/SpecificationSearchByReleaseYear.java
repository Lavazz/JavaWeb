package by.trjava.task02.service.specification.search.impl;

import by.trjava.task02.entity.Edition;
import by.trjava.task02.service.specification.CompositeSpecificationSearch;
import by.trjava.task02.service.specification.SpecificationSearch;

public class SpecificationSearchByReleaseYear extends CompositeSpecificationSearch {
    int releaseYearMin;
    int releaseYearMax;
    int releaseYear;

    public SpecificationSearchByReleaseYear(int releaseYearMin, int releaseYearMax) {
        this.releaseYearMin = releaseYearMin;
        this.releaseYearMax = releaseYearMax;
    }

    public SpecificationSearchByReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
        this.releaseYearMin = releaseYear - 1;
        this.releaseYearMax = releaseYear + 1;
    }

    @Override
    public boolean isSatisfiedBy(Edition edition) {
        return releaseYearMin < edition.getReleaseYear() && releaseYearMax > edition.getReleaseYear();
    }
}
