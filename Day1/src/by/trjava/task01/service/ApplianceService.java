package by.trjava.task01.service;

import by.trjava.task01.entity.Appliance;
import by.trjava.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {
    List<Appliance> find(Criteria criteria) throws  IllegalValueExseption;
}
