package by.trjava.task01.service.validation;

import by.trjava.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {
    //Oven
    static final double MAX_POWER_CONSUMPTION_OVEN = 2000;
    static final double MIN_POWER_CONSUMPTION_OVEN = 1000;

    static final double MAX_WEIGHT_OVEN = 10;
    static final double MIN_WEIGHT_OVEN = 12;

    static final double DEPTH_OVEN = 60;

    static final double MAX_HEIGHT_OVEN = 45.5;
    static final double MIN_HEIGHT_OVEN = 40;

    static final double MAX_CAPACITY = 33;
    static final double MIN_CAPACITY = 32;

    static final double MAX_WIDTH_OVEN = 70;
    static final double MIN_WIDTH_OVEN = 59.5;

    // Laptop
    static final double MAX_BATTERY_CAPACITY_LAPTOP = 3;
    static final double MIN_BATTERY_CAPACITY_LAPTOP = 1;

    static final String WINDOWS_OS_LAPTOP = "Windows";
    static final String LINUX_OS_LAPTOP = "Linux";

    static final double MAX_MEMORY_ROM_LAPTOP = 8000;
    static final double MIN_MEMORY_ROM_LAPTOP = 4000;

    static final double MAX_SYSTEM_MEMORY_LAPTOP = 1500;
    static final double MIN_SYSTEM_MEMORY_LAPTOP = 1000;

    static final double MAX_CPU_LAPTOP = 3.2;
    static final double MIN_CPU_LAPTOP = 1.2;

    static final double MAX_DISPLAY_INCHS_LAPTOP = 22;
    static final double MIN_DISPLAY_INCHS_LAPTOP = 18;

    // Refrigerator
    static final double MAX_POWER_CONSUMPTION_REFRIGERATOR = 200;
    static final double MIN_POWER_CONSUMPTION_REFRIGERATOR = 100;

    static final double MAX_WEIGHT_REFRIGERATOR = 35;
    static final double MIN_WEIGHT_REFRIGERATOR = 20;

    static final double MAX_FREEZER_CAPACITY_REFRIGERATOR = 20;
    static final double MIN_FREEZER_CAPACITY_REFRIGERATOR = 10;

    static final double MAX_OVERALL_CAPACITY_REFRIGERATOR = 350.5;
    static final double MIN_OVERALL_CAPACITY_REFRIGERATOR = 300;

    static final double MAX_HEIGHT_REFRIGERATOR = 250;
    static final double MIN_HEIGHT_REFRIGERATOR = 180;

    static final double MAX_WIDTH_REFRIGERATOR = 80;
    static final double MIN_WIDTH_REFRIGERATOR = 70;

    //VacuumCleaner
    static final double MAX_POWER_CONSUMPTION_VACUUM_CLEANER = 110;
    static final double MIN_POWER_CONSUMPTION_VACUUM_CLEANER = 90;

    static final String A_FILTER_TYPE_VACUUM_CLEANER = "A";
    static final String B_FILTER_TYPE_VACUUM_CLEANER = "B";
    static final String C_FILTER_TYPE_VACUUM_CLEANER = "C";

    static final String A2_BAG_TYPE_VACUUM_CLEANER = "A2";
    static final String AA_BAG_TYPE_VACUUM_CLEANER = "AA-89";
    static final String XX_BAG_TYPE_VACUUM_CLEANER = "XX00";

    static final String WAND_TYPE_VACUUM_CLEANER = "all-in-one";

    static final double MAX_MOTOR_SPEED_REGULATION_VACUUM_CLEANER = 2000;
    static final double MIN_MOTOR_SPEED_REGULATION_VACUUM_CLEANER = 1900;

    static final double MAX_POWER_CLEANING_WIDTH_VACUUM_CLEANER = 30;
    static final double MIN_POWER_CLEANING_WIDTH_VACUUM_CLEANER = 20;

    //TabletPC
    static final double MAX_BATTERY_CAPACITY_TABLET_PC = 5;
    static final double MIN_BATTERY_CAPACITY_TABLET_PC = 3;

    static final double MAX_DISPLAY_INCHES_TABLET_PC = 16;
    static final double MIN_DISPLAY_INCHES_TABLET_PC = 14;

    static final double MAX_MEMORY_ROM_TABLET_PC = 16000;
    static final double MIN_MEMORY_ROM_TABLET_PC = 8000;

    static final double MAX_FLASH_MEMORY_CAPACITY_TABLET_PC = 8;
    static final double MIN_FLASH_MEMORY_CAPACITY_TABLET_PC = 2;

    static final String BLUE_COLOR_TABLET_PC = "blue";
    static final String RED_COLOR_TABLET_PC = "red";
    static final String GREAN_COLOR_TABLET_PC = "green";

// Speakers
    static final double MAX_POWER_CONSUMPTION_SPEAKERS = 20;
    static final double MIN_POWER_CONSUMPTION_SPEAKERS = 15;

    static final double MAX_NUMBER_OF_SPEAKERS = 4;
    static final double MIN_NUMBER_OF_SPEAKERS = 2;

    static final double MAX_FREQUENCY_RANGE_SPEAKERS = 4;
    static final double MIN_FREQUENCY_RANGE_SPEAKERS = 2;

    static final double MAX_CORD_LENGTH_SPEAKERS = 4;
    static final double MIN_CORD_LENGTH_SPEAKERS = 2;


    public static boolean criteriaValidator(Criteria criteria) {
        boolean result = true;
        double d = 0.0;
        String s = "";
        Map<String, Object> checkedCriteria = criteria.getCriteriaMap();

        String key = null;
        Object value = 0;
        for (Map.Entry<String, Object> entry : checkedCriteria.entrySet()) {
            key = entry.getKey();
            value = entry.getValue();
        }

        if (!(key instanceof String)) {
            return false;
        }
        if (!(value instanceof String | value instanceof Integer | value instanceof Double)) {
            return false;
        }

        if (value instanceof Double) {
            d = (double) value;
        } else if (value instanceof Integer) {
            d = (int) value;
        }

        if (value instanceof String) {
            s = (String) value;
        }
        // check Oven

        if (key == "CAPACITY" & criteria.getGroupSearchName().equals("Oven")) {
            if (d > MAX_CAPACITY | d < MIN_CAPACITY) {
                result = false;
            }
        }
        if (key == "POWER_CONSUMPTION" & criteria.getGroupSearchName().equals("Oven")) {
            if (d > MAX_POWER_CONSUMPTION_OVEN | d < MIN_POWER_CONSUMPTION_OVEN) {
                result = false;
            }
        }
        if (key == "WEIGHT" & criteria.getGroupSearchName().equals("Oven")) {
            if (d > MAX_WEIGHT_OVEN | d < MIN_WEIGHT_OVEN) {
                result = false;
            }
        }
        if (key == "DEPTH" & criteria.getGroupSearchName().equals("Oven")) {
            if (d != DEPTH_OVEN) {
                result = false;
            }
        }

        if (key == "HEIGHT" & criteria.getGroupSearchName().equals("Oven")) {
            if (d > MAX_HEIGHT_OVEN | d < MIN_HEIGHT_OVEN) {
                result = false;
            }
        }
        if (key == "WIDTH" & criteria.getGroupSearchName().equals("Oven")) {
            if (d > MAX_WIDTH_OVEN | d < MIN_WIDTH_OVEN) {
                result = false;
            }
        }

        //   check Laptop
        if (key == "BATTERY_CAPACITY" & criteria.getGroupSearchName().equals("Laptop")) {
            if (d > MAX_BATTERY_CAPACITY_LAPTOP | d < MIN_BATTERY_CAPACITY_LAPTOP) {
                result = false;
            }
        }
        if (key == "OS" & criteria.getGroupSearchName().equals("Laptop")) {
            if (!(s.equals(WINDOWS_OS_LAPTOP) | s.equals(LINUX_OS_LAPTOP))) {
                result = false;
            }
        }
        if (key == "SYSTEM_MEMORY" & criteria.getGroupSearchName().equals("Laptop")) {
            if (d > MAX_SYSTEM_MEMORY_LAPTOP | d < MIN_SYSTEM_MEMORY_LAPTOP) {
                result = false;
            }
        }
        if (key == "MEMORY_ROM" & criteria.getGroupSearchName().equals("Laptop")) {
            if (d > MAX_MEMORY_ROM_LAPTOP | d < MIN_MEMORY_ROM_LAPTOP) {
                result = false;
            }
        }

        if (key == "CPU" & criteria.getGroupSearchName().equals("Laptop")) {
            if (d > MAX_CPU_LAPTOP | d < MIN_CPU_LAPTOP) {
                result = false;
            }
        }
        if (key == "DISPLAY_INCHS" & criteria.getGroupSearchName().equals("Laptop")) {
            if (d > MAX_DISPLAY_INCHS_LAPTOP | d < MIN_DISPLAY_INCHS_LAPTOP) {
                result = false;
            }
        }
        // check Refrigerator
        if (key == "POWER_CONSUMPTION" & criteria.getGroupSearchName().equals("Refrigerator")) {
            if (d > MAX_POWER_CONSUMPTION_REFRIGERATOR | d < MIN_POWER_CONSUMPTION_REFRIGERATOR) {
                result = false;
            }
        }

        if (key == "WEIGHT" & criteria.getGroupSearchName().equals("Refrigerator")) {
            if (d > MAX_WEIGHT_REFRIGERATOR | d < MIN_WEIGHT_REFRIGERATOR) {
                result = false;
            }
        }

        if (key == "FREEZER_CAPACITY" & criteria.getGroupSearchName().equals("Refrigerator")) {
            if (d > MAX_FREEZER_CAPACITY_REFRIGERATOR | d < MIN_FREEZER_CAPACITY_REFRIGERATOR) {
                result = false;
            }
        }
        if (key == "OVERALL_CAPACITY" & criteria.getGroupSearchName().equals("Refrigerator")) {
            if (d > MAX_OVERALL_CAPACITY_REFRIGERATOR | d < MIN_OVERALL_CAPACITY_REFRIGERATOR) {
                result = false;
            }
        }
        if (key == "HEIGHT" & criteria.getGroupSearchName().equals("Refrigerator")) {
            if (d > MAX_HEIGHT_REFRIGERATOR | d < MIN_HEIGHT_REFRIGERATOR) {
                result = false;
            }
        }
        if (key == "WIDTH" & criteria.getGroupSearchName().equals("Refrigerator")) {
            if (d > MAX_WIDTH_REFRIGERATOR | d < MIN_WIDTH_REFRIGERATOR) {
                result = false;
            }
        }

        // check VacuumCleaner
        if (key == "POWER_CONSUMPTION" & criteria.getGroupSearchName().equals("VacuumCleaner")) {
            if (d > MAX_POWER_CONSUMPTION_VACUUM_CLEANER | d < MIN_POWER_CONSUMPTION_VACUUM_CLEANER) {
                result = false;
            }
        }

        if (key == "FILTER_TYPE" & criteria.getGroupSearchName().equals("VacuumCleaner")) {
            if (!(s == A_FILTER_TYPE_VACUUM_CLEANER | s == B_FILTER_TYPE_VACUUM_CLEANER | s == C_FILTER_TYPE_VACUUM_CLEANER)) {
                result = false;
            }
        }

        if (key == "BAG_TYPE" & criteria.getGroupSearchName().equals("VacuumCleaner")) {
            if (!(s == A2_BAG_TYPE_VACUUM_CLEANER | s == AA_BAG_TYPE_VACUUM_CLEANER | s == XX_BAG_TYPE_VACUUM_CLEANER)) {
                result = false;
            }
        }

        if (key == "FILTER_TYPE" & criteria.getGroupSearchName().equals("VacuumCleaner")) {
            if (!(s == WAND_TYPE_VACUUM_CLEANER)) {
                result = false;
            }
        }

        if (key == "SPEED_REGULATION" & criteria.getGroupSearchName().equals("VacuumCleaner")) {
            if (d > MAX_MOTOR_SPEED_REGULATION_VACUUM_CLEANER | d < MIN_MOTOR_SPEED_REGULATION_VACUUM_CLEANER) {
                result = false;
            }
        }

        if (key == "POWER_CLEANING_WIDTH" & criteria.getGroupSearchName().equals("VacuumCleaner")) {
            if (d > MAX_POWER_CLEANING_WIDTH_VACUUM_CLEANER | d < MIN_POWER_CLEANING_WIDTH_VACUUM_CLEANER) {
                result = false;
            }
        }

// check TabletPC
        if (key == "BATTERY_CAPACITY" & criteria.getGroupSearchName().equals("TabletPC")) {
            if (d > MAX_BATTERY_CAPACITY_TABLET_PC | d < MIN_BATTERY_CAPACITY_TABLET_PC) {
                result = false;
            }
        }

        if (key == "DISPLAY_INCHES" & criteria.getGroupSearchName().equals("TabletPC")) {
            if (d > MAX_DISPLAY_INCHES_TABLET_PC | d < MIN_DISPLAY_INCHES_TABLET_PC) {
                result = false;
            }
        }

        if (key == "MEMORY_ROM" & criteria.getGroupSearchName().equals("TabletPC")) {
            if (d > MAX_MEMORY_ROM_TABLET_PC | d < MIN_MEMORY_ROM_TABLET_PC) {
                result = false;
            }
        }

        if (key == "FLASH_MEMORY_CAPACITY" & criteria.getGroupSearchName().equals("TabletPC")) {
            if (d > MAX_FLASH_MEMORY_CAPACITY_TABLET_PC | d < MIN_FLASH_MEMORY_CAPACITY_TABLET_PC) {
                result = false;
            }
        }

        if (key == "COLOR" & criteria.getGroupSearchName().equals("TabletPC")) {
            if (!(s == BLUE_COLOR_TABLET_PC | s == RED_COLOR_TABLET_PC | s == GREAN_COLOR_TABLET_PC)) {
                result = false;
            }
        }

        //check Speakers
        if (key == "POWER_CONSUMPTION" & criteria.getGroupSearchName().equals("Speakers")) {
            if (d > MAX_POWER_CONSUMPTION_SPEAKERS | d < MIN_POWER_CONSUMPTION_SPEAKERS) {
                result = false;
            }
        }

        if (key == "NUMBER_OF_SPEAKERS" & criteria.getGroupSearchName().equals("Speakers")) {
            if (d > MAX_NUMBER_OF_SPEAKERS | d < MIN_NUMBER_OF_SPEAKERS) {
                result = false;
            }
        }

        if (key == "FREQUENCY_RANGE" & criteria.getGroupSearchName().equals("Speakers")) {
            if (d > MAX_FREQUENCY_RANGE_SPEAKERS | d < MIN_FREQUENCY_RANGE_SPEAKERS) {
                result = false;
            }
        }

        if (key == "CORD_LENGTH" & criteria.getGroupSearchName().equals("Speakers")) {
            if (d > MAX_CORD_LENGTH_SPEAKERS | d < MIN_CORD_LENGTH_SPEAKERS) {
                result = false;
            }
        }

        return result;
    }
}

