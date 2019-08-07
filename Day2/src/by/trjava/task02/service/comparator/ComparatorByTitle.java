package by.trjava.task02.service.comparator;

import by.trjava.task02.entity.Edition;

import java.util.Comparator;

public class ComparatorByTitle implements Comparator<Edition> {
    @Override
    public int compare(Edition o1, Edition o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
