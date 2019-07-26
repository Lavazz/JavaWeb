package by.trjava.task01.service.impl;

import by.trjava.task01.dao.DAOFactory;
import by.trjava.task01.dao.FileApplianceDAO;
import by.trjava.task01.entity.Appliance;
import by.trjava.task01.entity.criteria.Criteria;
import by.trjava.task01.service.ApplianceService;
import by.trjava.task01.service.validation.Validator;

import java.util.List;

/**
 * This class get  Instance in DAOFactory and calling method find
 * with parameter criteria if criteria is valid
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */
public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) throws IllegalValueExseption {

        if (!Validator.criteriaValidator(criteria)) {
            throw new IllegalValueExseption;
        }

        DAOFactory factory = DAOFactory.getInstance();
        FileApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> appliance = applianceDAO.find(criteria);

        return appliance;
    }

}
