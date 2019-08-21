package by.trjava.task02.dao.validation;

import by.trjava.task02.entity.type.EditionType;
import by.trjava.task02.entity.type.Type;

/**
 * This class check if can editions contains this format of information
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @since JDK 1.0
 */
public class ValidatorDAO {
    /**
     * This method check if key is String and is not empty
     *
     * @param key is String field metrics of editions
     * @return boolean {@code true} if key contains string, {@code false} if key is empty
     */
    public static boolean validateKey(String key) {
        boolean result = true;
        if (key.isEmpty()) {
            result = false;
        } else if (!((key.equals(EditionType.Book.ID.toString())) || (key.equals(EditionType.Book.AUTHOR.toString()))
                || (key.equals(EditionType.Book.GENRE.toString())) || (key.equals(EditionType.Book.TITLE.toString()))
                || (key.equals(EditionType.Book.RELEASE_YEAR.toString())) || (key.equals(EditionType.Book.NUMBER_OF_PAGES.toString()))
                || (key.equals(EditionType.Book.INITIAL_PRICE.toString())) || (key.equals(EditionType.Album.DESIGNER.toString()))
                || (key.equals(EditionType.Newspaper.EDITOR.toString())) || (key.equals(EditionType.Magazine.RELEASE_MONTH.toString())))) {
            result = false;
        }
        return result;
    }

    /**
     * This method check if value is {@code String}, {@code Integer} or {@code Double}
     *
     * @param value is String field metrics of editions
     * @return boolean {@code true} if value contains {@code String}, {@code Integer} or {@code Double}
     * {@code false} if other
     */
    public static boolean validateValue(Object value) {

        final int VALUE_MIN = 0;
        final int VALUE_MAX = 2500;
        final String REG_NUMBER = "[+-]?([0-9]*[.])?[0-9]+";
        boolean result = true;

        if (((String) value).matches(REG_NUMBER)) {
            double doubleValue = Double.parseDouble((String) value);
            if (doubleValue < VALUE_MIN || doubleValue > VALUE_MAX) {
                return false;
            }
        }
        if (((String) value).isEmpty()) {
            result = false;
        }
        return result;
    }

    public static boolean checkType(String editionType){
        if(!(editionType.equals(Type.BOOK.getValue())||editionType.equals(Type.ALBUM.getValue())
                ||editionType.equals(Type.NEWSPAPER.getValue())||editionType.equals(Type.MAGAZINE.getValue()))){
            return false;
        }
        return true;
    }

}


