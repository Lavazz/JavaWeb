package by.trjava.task02.entity.type;

public enum Type {
    BOOK("Book"),
    ALBUM("Album"),
    NEWSPAPER("Newspaper"),
    MAGAZINE("Magazine");

    private String value;

    private Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    }

