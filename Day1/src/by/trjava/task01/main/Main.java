package by.trjava.task01.main;

import by.trjava.task01.dao.PropertyReader;
import by.trjava.task01.entity.Speakers;
import by.trjava.task01.entity.TabletPC;
import by.trjava.task01.entity.VacuumCleaner;
import by.trjava.task01.entity.criteria.Criteria;
import by.trjava.task01.entity.criteria.Criteria;
import by.trjava.task01.entity.criteria.SearchCriteria;
import by.trjava.task01.entity.criteria.SearchCriteria.*;
import by.trjava.task01.entity.criteria.SearchCriteria.Oven;
import by.trjava.task01.service.ApplianceService;
import by.trjava.task01.service.ServiceFactory;
//import by.trjava.task01.service.ServiceFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
//        criteriaOven.add(Oven.POWER_CONSUMPTION.toString(), 1500);

        Criteria criteriaTablet = new Criteria(VacuumCleaner.class.getSimpleName());
        criteriaTablet.add(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(), 14);

//        Criteria criteriaS = new Criteria(Speakers.class.getSimpleName());
//        criteriaS.add(SearchCriteria.Speakers.CORD_LENGTH.toString(), 4);

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();
        List applianceList = service.find(criteriaTablet);

        for (Object ap : applianceList) {
            System.out.println(ap.toString());
        }

//       PropertyReader pr=new PropertyReader();
//          ArrayList<Double> s=    pr.readDigitalCharacteristic(14);
//        for (Double p : s) {
//           System.out.println(p.toString());
//      }
    }

}
