package by.trjava.task02.service.comparator;

import by.trjava.task02.entity.Edition;

import java.util.Comparator;

public class ComparatorByReleaseYear implements Comparator<Edition> {

    @Override
    public int compare(Edition o1, Edition o2) {
        if (o1.getReleaseYear()> o2.getReleaseYear()) {
            return 1;
        }
        if (o1.getReleaseYear() == o2.getReleaseYear()) {
            return 0;
        }
        return -1;
    }
}
