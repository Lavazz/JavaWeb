package by.trjava.task02.dao;

import by.trjava.task02.entity.Edition;
import by.trjava.task02.dao.exception.NotNumberException;

public interface FileEditionDAO {

Edition create(String editionType) throws NumberFormatException, NotNumberException;
}
