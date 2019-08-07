package by.trjava.task02.service.util.impl;

import by.trjava.task02.entity.Book;
import by.trjava.task02.entity.Edition;
import by.trjava.task02.service.util.UtilSpecification;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UtilSpecificationImplTest {

    @Test
    public void calculateSum() {
        Edition book = new Book(2, "trafficRegulations", 296, 2017, 10,
                "Pavlov", "BookEducation");
        Edition book1 = new Book(5, "TheMasterAndMargarita", 254, 1967, 8.0,
                "Bulgakov", "Belletristic");
        Edition book2 = new Book(1, "trafficRegulations", 200, 2017, 10,
                "Pavlov", "BookEducation");
        List<Edition> actualList=new ArrayList<>();
        actualList.add(book);
        actualList.add(book1);
        actualList.add(book2);
        UtilSpecification utilSpecification=new UtilSpecificationImpl();
      int actual= utilSpecification.calculateSum(actualList);
        int expected=296+254+200;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateSumFalse() {
        Edition book = new Book(2, "trafficRegulations", 296, 2017, 10,
                "Pavlov", "BookEducation");
        Edition book1 = new Book(5, "TheMasterAndMargarita", 254, 1967, 8.0,
                "Bulgakov", "Belletristic");
        Edition book2 = new Book(1, "trafficRegulations", 200, 2017, 10,
                "Pavlov", "BookEducation");
        List<Edition> actualList=new ArrayList<>();
        actualList.add(book);
        actualList.add(book1);
        actualList.add(book2);
        UtilSpecification utilSpecification=new UtilSpecificationImpl();
        int actual= utilSpecification.calculateSum(actualList);
        int expected=296+254+200+1;
        assertNotEquals(expected, actual);
    }
}