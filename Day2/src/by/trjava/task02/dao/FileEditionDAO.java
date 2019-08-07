package by.trjava.task02.dao;

import by.trjava.task02.entity.Edition;
import by.trjava.task02.exception.NotNumberException;
import by.trjava.task02.exception.WrongKeyDAOException;
import by.trjava.task02.exception.WrongValueDAOException;

import java.util.List;
import java.util.Map;

public interface FileEditionDAO {

Edition create(String editionType, Map<String, Object> editionMap) throws NumberFormatException, NotNumberException;
}
