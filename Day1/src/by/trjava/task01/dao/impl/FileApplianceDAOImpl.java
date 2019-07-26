package by.trjava.task01.dao.impl;

import by.trjava.task01.dao.FileApplianceDAO;
import by.trjava.task01.dao.PropertyReader;
import by.trjava.task01.entity.*;
import by.trjava.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * This class contains method for create list with search appliances
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */
public class FileApplianceDAOImpl implements FileApplianceDAO {

    //Singleton
    private static FileApplianceDAOImpl instance = new FileApplianceDAOImpl();

    public static FileApplianceDAOImpl getInstance() {
        return instance;
    }

    private FileApplianceDAOImpl() {
    }

    //Number of line in ArrayList with characteristics of appliances
    static final int LINE_OVEN_FIRST = 0;
    static final int LINE_OVEN_SECOND = 1;
    static final int LINE_OVEN_THIRD = 2;

    static final int LINE_LAPTOP_FIRST = 4;
    static final int LINE_LAPTOP_SECOND = 5;
    static final int LINE_LAPTOP_THIRD = 6;

    static final int LINE_REFRIGERATOR_FIRST = 8;
    static final int LINE_REFRIGERATOR_SECOND = 9;
    static final int LINE_REFRIGERATOR_THIRD = 10;

    static final int LINE_VACUUM_CLEANER_FIRST = 12;
    static final int LINE_VACUUM_CLEANER_SECOND = 13;
    static final int LINE_VACUUM_CLEANER_THIRD = 14;

    static final int LINE_TABLET_PC_FIRST = 16;
    static final int LINE_TABLET_PC_SECOND = 17;
    static final int LINE_TABLET_PC_THIRD = 18;

    static final int LINE_SPEAKERS_FIRST = 20;
    static final int LINE_SPEAKERS_SECOND = 21;
    static final int LINE_SPEAKERS_THIRD = 22;

    static final String EXPRESSION_SEARCH_OS ="OS=(\\w+).*";
    static final String EXPRESSION_SEARCH_FILTER_TYPE="FILTER_TYPE=(\\w+).*";
    static final String EXPRESSION_SEARCH_BAG_TYPE ="BAG_TYPE=(\\w+\\S?\\d+).*";
    static final String EXPRESSION_SEARCH_WAND_TYPE="WAND_TYPE=(\\w+\\S\\w+\\S\\w+).*";
    static final String EXPRESSION_SEARCH_COLOR="COLOR=(\\w+).*";
    static final String EXPRESSION_SEARCH_FREQUENCY_RANGE="FREQUENCY_RANGE=(\\w+\\S\\w+).*";

    //Declaration and initialization List<Appliance>
    List<Appliance> listAppliances = new ArrayList<>();


    /**
     * This method crates necessary objects
     *
     * @param criteria of desired appliance
     * @return List with necessary  Appliances
     * @see interface FileApplianceDAO
     */
    @Override
    public List<Appliance> find(Criteria criteria) {

        final ApplianceType TYPE = ApplianceType.valueOf(criteria.getGroupSearchName().toUpperCase());

        switch (TYPE) {
            case OVEN:
                listAppliances.add(new Oven(PropertyReader.readDigitalCharacteristic(LINE_OVEN_FIRST)));
                listAppliances.add(new Oven(PropertyReader.readDigitalCharacteristic(LINE_OVEN_SECOND)));
                listAppliances.add(new Oven(PropertyReader.readDigitalCharacteristic(LINE_OVEN_THIRD)));
                break;
            case LAPTOP:
                listAppliances.add(new Laptop(PropertyReader.readDigitalCharacteristic(LINE_LAPTOP_FIRST),
                        PropertyReader.readStringCharacteristic(LINE_LAPTOP_FIRST, EXPRESSION_SEARCH_OS)));
                listAppliances.add(new Laptop(PropertyReader.readDigitalCharacteristic(LINE_LAPTOP_SECOND),
                        PropertyReader.readStringCharacteristic(LINE_LAPTOP_SECOND, EXPRESSION_SEARCH_OS)));
                listAppliances.add(new Laptop(PropertyReader.readDigitalCharacteristic(LINE_LAPTOP_THIRD),
                        PropertyReader.readStringCharacteristic(LINE_LAPTOP_THIRD, EXPRESSION_SEARCH_OS)));
                break;
            case REFRIGERATOR:
                listAppliances.add(new Refrigerator(PropertyReader.readDigitalCharacteristic(LINE_REFRIGERATOR_FIRST)));
                listAppliances.add(new Refrigerator(PropertyReader.readDigitalCharacteristic(LINE_REFRIGERATOR_SECOND)));
                listAppliances.add(new Refrigerator(PropertyReader.readDigitalCharacteristic(LINE_REFRIGERATOR_THIRD)));
                break;
            case VACUUMCLEANER:
                listAppliances.add(new VacuumCleaner(PropertyReader.readDigitalCharacteristic(LINE_VACUUM_CLEANER_FIRST),
                        PropertyReader.readStringCharacteristic(LINE_VACUUM_CLEANER_FIRST, EXPRESSION_SEARCH_FILTER_TYPE,
                                EXPRESSION_SEARCH_BAG_TYPE, EXPRESSION_SEARCH_WAND_TYPE)));
                listAppliances.add(new VacuumCleaner(PropertyReader.readDigitalCharacteristic(LINE_VACUUM_CLEANER_SECOND),
                        PropertyReader.readStringCharacteristic(LINE_VACUUM_CLEANER_SECOND, EXPRESSION_SEARCH_FILTER_TYPE,
                                EXPRESSION_SEARCH_BAG_TYPE, EXPRESSION_SEARCH_WAND_TYPE)));
                listAppliances.add(new VacuumCleaner(PropertyReader.readDigitalCharacteristic(LINE_REFRIGERATOR_THIRD),
                        PropertyReader.readStringCharacteristic(LINE_VACUUM_CLEANER_THIRD, EXPRESSION_SEARCH_FILTER_TYPE,
                                EXPRESSION_SEARCH_BAG_TYPE, EXPRESSION_SEARCH_WAND_TYPE)));
                break;
            case TABLETPC:
                listAppliances.add(new TabletPC(PropertyReader.readDigitalCharacteristic(LINE_TABLET_PC_FIRST),
                        PropertyReader.readStringCharacteristic(LINE_TABLET_PC_FIRST, EXPRESSION_SEARCH_COLOR)));
                listAppliances.add(new TabletPC(PropertyReader.readDigitalCharacteristic(LINE_TABLET_PC_SECOND),
                        PropertyReader.readStringCharacteristic(LINE_TABLET_PC_SECOND, EXPRESSION_SEARCH_COLOR)));
                listAppliances.add(new TabletPC(PropertyReader.readDigitalCharacteristic(LINE_TABLET_PC_THIRD),
                        PropertyReader.readStringCharacteristic(LINE_TABLET_PC_THIRD, EXPRESSION_SEARCH_COLOR)));
                break;
            case SPEAKERS:
                listAppliances.add(new Speakers(PropertyReader.readDigitalCharacteristic(LINE_SPEAKERS_FIRST),
                        PropertyReader.readStringCharacteristic(LINE_SPEAKERS_FIRST, EXPRESSION_SEARCH_FREQUENCY_RANGE)));
                listAppliances.add(new Speakers(PropertyReader.readDigitalCharacteristic(LINE_SPEAKERS_SECOND),
                        PropertyReader.readStringCharacteristic(LINE_SPEAKERS_FIRST, EXPRESSION_SEARCH_FREQUENCY_RANGE)));
                listAppliances.add(new Speakers(PropertyReader.readDigitalCharacteristic(LINE_SPEAKERS_THIRD),
                        PropertyReader.readStringCharacteristic(LINE_SPEAKERS_FIRST, EXPRESSION_SEARCH_FREQUENCY_RANGE)));
                break;
        }

        return listAppliances;
    }
}


