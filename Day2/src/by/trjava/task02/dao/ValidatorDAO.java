package by.trjava.task02.dao;

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
        if (((String) key).isEmpty()) {
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
        boolean result = true;
        if (!((value instanceof String) || (value instanceof Integer) || (value instanceof Double))) {
            result = false;
        }
        if (value instanceof String) {
            if (((String) value).isEmpty()) {
                result = false;
            }
        }
        return result;
    }

}
