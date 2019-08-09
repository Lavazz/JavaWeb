package by.trjava.task02.dao;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorDAOTest {

    @Test
    public void validateKeyTrue() {
        String key = "TITLE";
        ValidatorDAO validatorDAO = new ValidatorDAO();
        boolean resultKey = validatorDAO.validateKey(key);
        assertTrue(resultKey);
    }

    @Test
    public void validateKeyFalse() {
        String key = "";
        ValidatorDAO validatorDAO = new ValidatorDAO();
        boolean resultKey = validatorDAO.validateKey(key);
        assertFalse(resultKey);
    }

    @Test
    public void validateValueStringTrue() {
        Object value = "trafficRegulations";
        ValidatorDAO validatorDAO = new ValidatorDAO();
        boolean resultValue = validatorDAO.validateValue(value);
        assertTrue(resultValue);
    }

    @Test
    public void validateValueIntegerTrue() {
        Object value = "15";
        ValidatorDAO validatorDAO = new ValidatorDAO();
        boolean resultValue = validatorDAO.validateValue(value);
        assertTrue(resultValue);
    }

    @Test
    public void validateValueIntegerBigValue() {
        Object value = "20000";
        ValidatorDAO validatorDAO = new ValidatorDAO();
        boolean resultValue = validatorDAO.validateValue(value);
        assertFalse(resultValue);
    }

    @Test
    public void validateValueDoubleTrue() {
        Object value = "15.0";
        ValidatorDAO validatorDAO = new ValidatorDAO();
        boolean resultValue = validatorDAO.validateValue(value);
        assertTrue(resultValue);
    }
}