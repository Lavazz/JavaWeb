//package by.trjava.task02.dao;
//
//import by.trjava.task02.exception.WrongKeyDAOException;
//import by.trjava.task02.exception.WrongValueDAOException;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.*;
//
//public class FileReaderTest {
//
//
//       @Test
//    public void parseString() throws WrongKeyDAOException, WrongValueDAOException {
//     String line=" Book : ID=1, GENRE=Belletristic, TITLE=HarryPotter, AUTHOR=Rowling";
//     Map<String, Object> expected=new HashMap<>();
//           expected.put("ID", 1);
//           expected.put("GENRE", "Belletristic");
//           expected.put("TITLE", "HarryPotter");
//           expected.put("AUTHOR", "Rowling");
//           Assert.assertEquals(FileReader.parseString(line), expected);
//    }
//
//    @Test
//    public void findName() {
//
//    }
//}