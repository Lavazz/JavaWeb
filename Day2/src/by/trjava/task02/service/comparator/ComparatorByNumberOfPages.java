package by.trjava.task02.service.comparator;

import by.trjava.task02.entity.Edition;

import java.util.Comparator;

public class ComparatorByNumberOfPages implements Comparator<Edition> {

    @Override
    public int compare(Edition o1, Edition o2) {
        if (o1.getNumberOfPages()> o2.getNumberOfPages()) {
            return 1;
        }
        if (o1.getNumberOfPages() == o2.getNumberOfPages()) {
            return 0;
        }
        return -1;
    }
}
