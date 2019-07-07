package by.trjava.task01.model;

import by.trjava.task01.model.entity.Laptop;
import by.trjava.task01.model.entity.Oven;
import by.trjava.task01.model.entity.Refrigerator;

/**
 * This class creates objects
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @since JDK1.0
 */
public class ApplianceCreator {
    static String path = "appliances_db.txt";

    static Oven oven0 = new Oven(PropertyReader.digitalCharacteristic(path, 0));
    static Oven oven1 = new Oven(PropertyReader.digitalCharacteristic(path, 1));
    static Oven oven2 = new Oven(PropertyReader.digitalCharacteristic(path, 2));

    static Laptop laptop4 = new Laptop(PropertyReader.digitalCharacteristic(path, 4),
            PropertyReader.stringCharacteristic(path, 4));

    static Laptop laptop5 = new Laptop(PropertyReader.digitalCharacteristic(path, 5),
            PropertyReader.stringCharacteristic(path, 5));

    static Laptop laptop6 = new Laptop(PropertyReader.digitalCharacteristic(path, 6),
            PropertyReader.stringCharacteristic(path, 6));

    static Refrigerator refrigerator8 = new Refrigerator(PropertyReader.digitalCharacteristic(path, 8));
    static Refrigerator refrigerator9 = new Refrigerator(PropertyReader.digitalCharacteristic(path, 9));
    static Refrigerator refrigerator10 = new Refrigerator(PropertyReader.digitalCharacteristic(path, 10));
}
