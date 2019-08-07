package by.trjava.task02.service.specification.search.impl;

import by.trjava.task02.entity.Edition;
import by.trjava.task02.service.specification.CompositeSpecificationSearch;
import by.trjava.task02.service.specification.SpecificationSearch;

public class SpecificationSearchByPrice extends CompositeSpecificationSearch {
    double initialPrice;
    double initialPriceMax;
    double initialPriceMin;

    public SpecificationSearchByPrice(double initialPrice) {
                this.initialPrice = initialPrice;
        this.initialPriceMin = initialPrice-1;
        this.initialPriceMax = initialPrice+1;
    }

    public SpecificationSearchByPrice(double initialPriceMin, double initialPriceMax) {
        this.initialPriceMin = initialPriceMin;
        this.initialPriceMax = initialPriceMax;
    }

       @Override
    public boolean isSatisfiedBy(Edition edition) {
        boolean result=false;

        return initialPriceMin<edition.getInitialPrice()&&initialPriceMax>edition.getInitialPrice();
    }

}
