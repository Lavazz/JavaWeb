package by.trjava.task02.dao;

import by.trjava.task02.exception.WrongKeyDAOException;
import by.trjava.task02.exception.WrongValueDAOException;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void parseString() throws WrongKeyDAOException, WrongValueDAOException {
        String line = " Book : ID=1, GENRE=Belletristic, TITLE=HarryPotter, AUTHOR=Rowling";
        Map<String, Object> expected = new HashMap<>();
        expected.put("ID", "1");
        expected.put("GENRE", "Belletristic");
        expected.put("TITLE", "HarryPotter");
        expected.put("AUTHOR", "Rowling");
        Map<String, Object> actual = Parser.parseString(line);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseStringWrong() throws WrongKeyDAOException, WrongValueDAOException {
        String line = "Book : ID=2, GENRE=Belletristic, TITLE=HarryPotter, AUTHOR=Rowling";
        Map<String, Object> expected = new HashMap<>();
        expected.put("ID", "1");
        expected.put("GENRE", "Belletristic");
        expected.put("TITLE", "HarryPotter");
        expected.put("AUTHOR", "Rowling");
        Map<String, Object> actual = Parser.parseString(line);
        Assert.assertNotEquals(expected, actual);
    }

    @Test(expected = WrongValueDAOException.class)
    public void parseStringValueException() throws WrongKeyDAOException, WrongValueDAOException {
        String line = "Book : ID=2000000, GENRE=Belletristic, TITLE=HarryPotter, AUTHOR=Rowling";
        Parser.parseString(line);
    }

    @Test(expected = WrongKeyDAOException.class)
    public void parseStringKeyException() throws WrongKeyDAOException, WrongValueDAOException {
        String line = "Book : number=2, GENRE=Belletristic, TITLE=HarryPotter, AUTHOR=Rowling";
        Parser.parseString(line);
    }


    @Test
    public void findEditionTypeBook() {
        String line = "Book : ID=2, GENRE=Belletristic, TITLE=HarryPotter, AUTHOR=Rowling";
        String expected = "Book";
        String actual = Parser.findEditionType(line);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findEditionTypeAlbum() {
        String line = "Album : ID=5, GENRE=Art, TITLE=ArtAlbum";
        String expected = "Album";
        String actual = Parser.findEditionType(line);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findEditionTypeMagazine() {
        String line = "Magazine : ID=14, GENRE=science, TITLE=NationalGeographic";
        String expected = "Magazine";
        String actual = Parser.findEditionType(line);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findEditionTypeNewspaper() {
        String line = "Newspaper : ID=10, GENRE=political, TITLE=Times";
        String expected = "Newspaper";
        String actual = Parser.findEditionType(line);
        Assert.assertEquals(expected, actual);
    }
}