package by.trjava.task01.dao;

import by.trjava.task01.entity.Appliance;
import by.trjava.task01.entity.criteria.Criteria;

import java.util.List;

public interface FileApplianceDAO {

    List<Appliance> find(Criteria criteria);
}
