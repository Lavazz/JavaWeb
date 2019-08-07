package by.trjava.task02.service.specification.search.impl;

import by.trjava.task02.entity.Album;
import by.trjava.task02.entity.Book;
import by.trjava.task02.entity.Edition;
import by.trjava.task02.entity.type.EditionType;
import by.trjava.task02.service.specification.CompositeSpecificationSearch;
import by.trjava.task02.service.specification.SpecificationSearch;

public class SpecificationSearchByGenre extends CompositeSpecificationSearch {
    String genre;

    public SpecificationSearchByGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean isSatisfiedBy(Edition edition) {
        return this.genre.equals(edition.getGenre());
    }
}
