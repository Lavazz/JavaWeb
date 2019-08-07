package by.trjava.task02.entity.type;

public final class EditionType {
    public static enum Book {
        ID, TITLE, NUMBER_OF_PAGES, RELEASE_YEAR, INITIAL_PRICE, AUTHOR, GENRE;
    }

    public static enum Album {
        ID, TITLE, NUMBER_OF_PAGES, RELEASE_YEAR, INITIAL_PRICE, DESIGNER, GENRE;
    }

    public static enum Newspaper {
        ID, TITLE, NUMBER_OF_PAGES, RELEASE_YEAR, INITIAL_PRICE,  EDITOR, RELEASE_MONTH, GENRE;
    }

    public static enum Magazine {
        ID, TITLE, NUMBER_OF_PAGES, RELEASE_YEAR, INITIAL_PRICE, EDITOR,  GENRE, RELEASE_MONTH;
          }


    EditionType() {
    }

  }