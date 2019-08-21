package by.trjava.task02.dao;

import by.trjava.task02.entity.*;
import by.trjava.task02.entity.type.EditionType;

import java.util.Map;

public class Initializer {
    private final static Initializer instance = new Initializer();

    public static Initializer getInstance() {
        return instance;
    }

    private Initializer() {
    }

    public void initialize(Edition edition, String editionType, Map<String, Object> editionMap) {
        edition.setId(Integer.parseInt((String) editionMap.get(EditionType.Book.ID.toString())));
        edition.setTitle((String) editionMap.get(EditionType.Book.TITLE.toString()));
        edition.setNumberOfPages(Integer.parseInt((String) editionMap.get(EditionType.Book.NUMBER_OF_PAGES.toString())));
        edition.setReleaseYear(Integer.parseInt((String) editionMap.get(EditionType.Book.RELEASE_YEAR.toString())));
        edition.setInitialPrice(Double.parseDouble((String) editionMap.get(EditionType.Book.INITIAL_PRICE.toString())));
        edition.setGenre((String) editionMap.get(EditionType.Album.GENRE.toString()));
        if (editionType.toUpperCase().equals("BOOK")) {
            Book book = (Book) edition;
            book.setAuthor((String) editionMap.get(EditionType.Book.AUTHOR.toString()));
        } else if (editionType.toUpperCase().equals("ALBUM")) {
            Album album = (Album) edition;
            album.setDesigner((String) editionMap.get(EditionType.Album.DESIGNER.toString()));
        } else if (editionType.toUpperCase().equals("NEWSPAPER")) {
            Newspaper newspaper = (Newspaper) edition;
            newspaper.setEditor((String) editionMap.get(EditionType.Newspaper.EDITOR.toString()));
            newspaper.setReleaseMonth(Integer.parseInt((String) editionMap.get(EditionType.Newspaper.RELEASE_MONTH.toString())));
        } else if (editionType.toUpperCase().equals("MAGAZINE")) {
            Magazine magazine = (Magazine) edition;
            magazine.setEditor((String) editionMap.get(EditionType.Magazine.EDITOR.toString()));
            magazine.setReleaseMonth(Integer.parseInt((String) editionMap.get(EditionType.Magazine.RELEASE_MONTH.toString())));
        }

    }
}
