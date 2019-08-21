package by.trjava.task02.controller;

import by.trjava.task02.dao.exception.EditionNotFoundException;

public interface Library {
    void makeLibrary() throws EditionNotFoundException;
}
