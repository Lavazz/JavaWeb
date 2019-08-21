package by.trjava.task02.dao;

import by.trjava.task02.dao.exception.WrongFileException;
import by.trjava.task02.dao.exception.WrongPathException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FileReaderTest {

    @Test
    public void readEditionList() throws WrongPathException, WrongFileException {
        List<String> expected = new ArrayList<>();
        expected.add("Book : ID=1, GENRE=Belletristic, TITLE=HarryPotter, AUTHOR=Rowling, RELEASE_YEAR=1997, NUMBER_OF_PAGES=200,  INITIAL_PRICE=60;");
        expected.add("Book : ID=2, GENRE=BookEducation, TITLE=trafficRegulations, AUTHOR=Pavlov, RELEASE_YEAR=2017, NUMBER_OF_PAGES=296,  INITIAL_PRICE=10;");
        expected.add("Book : ID=3, GENRE=Belletristic, TITLE=WarAndPeace, AUTHOR=Tolstoy,  RELEASE_YEAR=1869, NUMBER_OF_PAGES=1226,  INITIAL_PRICE=8;");
        expected.add("Book : ID=4, GENRE=BookEducation, TITLE=JavaMethodsProgrammings, AUTHOR=Blinov, RELEASE_YEAR=2013, NUMBER_OF_PAGES=898,  INITIAL_PRICE=11;");
        expected.add("Book : ID=5, GENRE=Belletristic, TITLE=TheMasterAndMargarita, AUTHOR=Bulgakov,  RELEASE_YEAR=1967, NUMBER_OF_PAGES=256,  INITIAL_PRICE=8;");
        expected.add("");
        expected.add("Album : ID=6, TITLE=ArtAlbum, DESIGNER=Sezzan; RELEASE_YEAR=1941, NUMBER_OF_PAGES=28 , INITIAL_PRICE=16, GENRE=Art;");
        expected.add("Album : ID=7, TITLE=SculptureAlbum, DESIGNER=Grom; RELEASE_YEAR=2011, NUMBER_OF_PAGES=34 , INITIAL_PRICE=21, GENRE=Art;");
        expected.add("Album : ID=8, TITLE=HeroAlbum, DESIGNER=Lord; RELEASE_YEAR=1966, NUMBER_OF_PAGES=44 , INITIAL_PRICE=6, GENRE=Memorial;");
        expected.add("Album : ID=9, TITLE=WarAlbum, DESIGNER=Fort; RELEASE_YEAR=1949, NUMBER_OF_PAGES=64 , INITIAL_PRICE=10, GENRE=Memorial;");
        expected.add("");
        expected.add("Newspaper : ID=10, GENRE=political, TITLE=Times, RELEASE_YEAR=2007, RELEASE_MONTH=4, NUMBER_OF_PAGES=22 , INITIAL_PRICE=8, EDITOR=Danko;");
        expected.add("Newspaper : ID=11, GENRE=entertaining, TITLE=PositiveNews, RELEASE_YEAR=2018,  RELEASE_MONTH=3, NUMBER_OF_PAGES=38 , INITIAL_PRICE=6, EDITOR=Omar;");
        expected.add("Newspaper : ID=12, GENRE=entertaining, TITLE=SevenDays, RELEASE_YEAR=2005,  RELEASE_MONTH=10, NUMBER_OF_PAGES=18 , INITIAL_PRICE=5, EDITOR=Swet;");
        expected.add("Newspaper : ID=13, GENRE=entertaining, TITLE=ArgumentsAndFacts, RELEASE_YEAR=2019,  RELEASE_MONTH=5, NUMBER_OF_PAGES=16 , INITIAL_PRICE=3, EDITOR=Richard;");
        expected.add("");
        expected.add("Magazine : ID=14, GENRE=science,  TITLE=NationalGeographic, RELEASE_YEAR=1997, RELEASE_MONTH=3, NUMBER_OF_PAGES=68 , INITIAL_PRICE=6, EDITOR=David;");
        expected.add("Magazine : ID=15, GENRE=fashion, TITLE=Cosmopolitan, RELEASE_YEAR=2009, RELEASE_MONTH=7, NUMBER_OF_PAGES=46 , INITIAL_PRICE=7, EDITOR=Hanna;");
        expected.add("Magazine : ID=16, GENRE=business, TITLE=People, RELEASE_YEAR=2018, RELEASE_MONTH=8, NUMBER_OF_PAGES=42 , INITIAL_PRICE=4, EDITOR=Narcis;");
        expected.add("Magazine : ID=17, GENRE=science, TITLE=GEO, RELEASE_YEAR=2017, RELEASE_MONTH=4, NUMBER_OF_PAGES=32 , INITIAL_PRICE=5, EDITOR=Ivanov;");

        List<String> actual = FileReader.readEditionList();
        assertEquals(expected, actual);
    }

}