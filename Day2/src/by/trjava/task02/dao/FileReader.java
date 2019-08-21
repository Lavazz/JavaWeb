package by.trjava.task02.dao;

import by.trjava.task02.dao.exception.WrongFileException;
import by.trjava.task02.dao.exception.WrongPathException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class contains  method that read information from {@code File} about editions
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK 8.0
 */
public class FileReader {

    private static final String PATH = "./resources/library_db.txt";

    /**
     * Reads information from {@code File}
     *
     * @return characteristic of editions as a {@code String array}
     * @throws WrongPathException if {@code File} is not find
     * @throws WrongFileException if an input-output exception occurs
     */
    //Files has a lines method that reads data from a file
    public static List<String> readEditionList() throws WrongPathException, WrongFileException {
        Path path = Paths.get(PATH);
        try (Stream<String> lineStream = Files.newBufferedReader(path).lines()) {
            // and add information to the collection
            return lineStream.collect(Collectors.toList());
        } catch (NullPointerException npe) {
           throw new WrongPathException("File is not found", npe);
        } catch (IOException ioe) {
           throw new WrongFileException("File is wrong", ioe);
        }
    }

}

