package by.trjava.task02.dao;

import by.trjava.task02.exception.WrongKeyDAOException;
import by.trjava.task02.exception.WrongValueDAOException;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

/**
 * This class contains  method that parses information about editions from {@code String} to {@code Map}
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @since JDK 1.0
 */
public class Parser {

    private static final Logger LOGGER = Logger.getLogger(Parser.class);

    /**
     * This method parses information about editions and check if its valid
     *
     * @param line - String from array with information about editions
     * @return characteristics in form HashMap<String, Object> if key and value are valid
     * @throws WrongKeyDAOException   if Key is empty
     * @throws WrongValueDAOException if value is not String or number
     * @see ValidatorDAO
     */
    public static Map<String, Object> parseString(String line) throws WrongKeyDAOException, WrongValueDAOException {

        final String REGULAR_EXPRESSION = "(\\w+)=((([0-9]*[.])?[0-9]+)|([A-Za-z]*))";
        final int FIRST_INDICATOR = 1;
        final int SECOND_INDICATOR = 2;

        Map<String, Object> map = new HashMap<>();
        Object value = null;
        String key = "";
        Pattern pattern = Pattern.compile(REGULAR_EXPRESSION);
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            key = matcher.group(FIRST_INDICATOR);
            value = matcher.group(SECOND_INDICATOR);
            if (!ValidatorDAO.validateKey(key)) {
                LOGGER.debug("Key in file is empty");
                throw new WrongKeyDAOException("Wrong key in DAO");
            }
            if (!ValidatorDAO.validateValue(value)) {
                LOGGER.debug("Value in file is not valid");
                throw new WrongValueDAOException("Wrong key in DAO");
            }
            map.put(key, value);
        }
        return map;
    }

    /**
     * This method parses information about editions and get Type
     *
     * @param line - String from array with information about editions
     * @return type of edition
     */
    public static String findEditionType(String line) {
        final int INDEX_OF_TYPE = 0;
        return line.substring(INDEX_OF_TYPE, line.indexOf(' '));
    }
}
