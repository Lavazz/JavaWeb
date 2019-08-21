package by.trjava.task02.dao;

import by.trjava.task02.dao.exception.*;
import by.trjava.task02.dao.factory.DAOFactory;
import by.trjava.task02.dao.repository.Repository;
import by.trjava.task02.dao.repository.impl.RepositoryImpl;
import by.trjava.task02.dao.validation.ValidatorDAO;
import by.trjava.task02.entity.Edition;

import java.util.List;
import java.util.Map;

public class Creator {
    private static Creator instance = new Creator();

    public static Creator getInstance() {
        return instance;
    }

    private Creator() {
    }

    public void create() throws IncorrectTypeException, WrongPathException, WrongFileException, WrongKeyDAOException, WrongValueDAOException, NotNumberException {

        List<String> lines = FileReader.readEditionList();

        for (String line : lines) {
            if (line.equals("")) {
                continue;
            }
            Map<String, Object> editionMap = Parser.parseString(line);
            String editionType = Parser.findEditionType(line);
            if (!ValidatorDAO.checkType(editionType)) {
                throw new IncorrectTypeException("Incorrect edition Type");
            }
            DAOFactory factory = DAOFactory.getInstance();
            FileEditionDAO editionDAO = factory.getEditionDAO();
            Edition edition = editionDAO.create(editionType);

            Initializer initializer = Initializer.getInstance();
            if (edition != null) {
                initializer.initialize(edition, editionType, editionMap);
            }

            Repository repository = RepositoryImpl.getInstance();
            repository.add(edition);
        }
    }
}


