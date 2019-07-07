package by.trjava.task01.model;

import by.trjava.task01.model.entity.Laptop;
import by.trjava.task01.model.entity.Oven;
import by.trjava.task01.model.entity.Refrigerator;

/**
 * This class find suitable appliance
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @since JDK1.0
 */
public class ApplianceSelection {


    String result = "Suitable appliance not found, please check your input value";

    /**
     * Find suitable appliance and show the location
     *
     * @param applianceDesired
     * @return result showing the location
     */
    public String selectAppliance(Object applianceDesired) {

        if (applianceDesired instanceof Oven) {
            if (ApplianceCreator.oven0.equals(applianceDesired)) {
                result = "The required oven is located in section number 0";
            } else if (ApplianceCreator.oven1.equals(applianceDesired)) {
                result = "The required oven is located in section number 1";
            } else if (ApplianceCreator.oven2.equals(applianceDesired)) {
                result = "The required oven is located in section number 2";
            }
        } else if (applianceDesired instanceof Laptop) {
            if (ApplianceCreator.laptop4.equals(applianceDesired)) {
                result = "The required laptop is located in section number 4";
            } else if (ApplianceCreator.laptop5.equals(applianceDesired)) {
                result = "The required laptop is located in section number 5";
            } else if (ApplianceCreator.laptop6.equals(applianceDesired)) {
                result = "The required laptop is located in section number 6";
            }
        } else if (applianceDesired instanceof Refrigerator) {
            if (ApplianceCreator.refrigerator8.equals(applianceDesired)) {
                result = "The required refrigerator is located in section number 8";
            } else if (ApplianceCreator.refrigerator9.equals(applianceDesired)) {
                result = "The required refrigerator is located in section number 9";
            } else if (ApplianceCreator.refrigerator10.equals(applianceDesired)) {
                result = "The required refrigerator is located in section number 10";
            }
        }
        return result;
    }
}
