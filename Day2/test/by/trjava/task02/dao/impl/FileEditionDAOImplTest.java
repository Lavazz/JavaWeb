package by.trjava.task02.dao.impl;

import by.trjava.task02.dao.FileEditionDAO;
import by.trjava.task02.entity.*;
import by.trjava.task02.exception.NotNumberException;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FileEditionDAOImplTest {

    @Test
    public void createBook() throws NotNumberException {
        Map<String, Object> map=new HashMap<>();
        map.put("ID", "2");
        map.put("GENRE", "BookEducation");
        map.put("TITLE", "trafficRegulations");
        map.put("AUTHOR", "Pavlov");
        map.put("NUMBER_OF_PAGES", "296");
        map.put("RELEASE_YEAR", "2017");
        map.put("INITIAL_PRICE", "10");

        FileEditionDAO  fileEditionDAO=FileEditionDAOImpl.getInstance( );
      Edition expected=fileEditionDAO.create("Book", map);
      Edition actual=new Book(2, "trafficRegulations", 296, 2017, 10,
              "Pavlov", "BookEducation");
      assertEquals(expected, actual);
    }

    @Test
    public void createAlbum() throws NotNumberException {
        Map<String, Object> map=new HashMap<>();
        map.put("ID", "6");
        map.put("GENRE", "Art");
        map.put("TITLE", "ArtAlbum");
        map.put("DESIGNER", "Sezzan");
        map.put("NUMBER_OF_PAGES", "28");
        map.put("RELEASE_YEAR", "1941");
        map.put("INITIAL_PRICE", "10");

        FileEditionDAO  fileEditionDAO=FileEditionDAOImpl.getInstance( );
        Edition expected=fileEditionDAO.create("Album", map);
        Edition actual=new Album(6, "ArtAlbum", 28, 1941, 10,
                "Sezzan", "Art");
        assertNotEquals(expected, actual);
    }
    @Test
    public void createMagazine() throws NotNumberException {
        Map<String, Object> map=new HashMap<>();
        map.put("ID", "14");
        map.put("GENRE", "science");
        map.put("TITLE", "NationalGeographic");
        map.put("EDITOR", "Pavlov");
        map.put("NUMBER_OF_PAGES", "296");
        map.put("RELEASE_YEAR", "1997");
        map.put("INITIAL_PRICE", "10");
        map.put("RELEASE_MONTH", "3");

        FileEditionDAO  fileEditionDAO=FileEditionDAOImpl.getInstance( );
        Edition expected=fileEditionDAO.create("Magazine", map);
        Edition actual=new Magazine(14, "NationalGeographic", 296, 1997, 10,
                "Pavlov", 3,"science");
        assertEquals(expected, actual);
    }

    @Test
    public void createNewspaper() throws NotNumberException {
        Map<String, Object> map=new HashMap<>();
        map.put("ID", "10");
        map.put("GENRE", "political");
        map.put("TITLE", "Times");
        map.put("EDITOR", "Pavlov");
        map.put("NUMBER_OF_PAGES", "296");
        map.put("RELEASE_YEAR", "2007");
        map.put("INITIAL_PRICE", "10");
        map.put("RELEASE_MONTH", "3");

        FileEditionDAO  fileEditionDAO=FileEditionDAOImpl.getInstance( );
        Edition expected=fileEditionDAO.create("Newspaper", map);
        Edition actual=new Newspaper(10, "Times", 296, 2007, 10,
                "Pavlov", 3,"political" );
        assertEquals(expected, actual);
    }

}