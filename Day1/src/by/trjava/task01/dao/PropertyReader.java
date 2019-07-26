package by.trjava.task01.dao;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class contains  methods that read information from File about appliances
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */
public class PropertyReader {

    private static final String PATH = "./resources/appliances_db.txt";

    /**
     * Reads information about appliances
     *
     * @return characteristic of appliance as a string array
     */
    public static ArrayList<String> readFile() {
        ArrayList<String> characteristicOfAppliance = new ArrayList<>();

        Scanner scanner;
        try (FileReader fr = new FileReader(PATH);) {
            scanner = new Scanner(fr);

            while (scanner.hasNextLine()) {
                characteristicOfAppliance.add(scanner.nextLine());
            }

        } catch (NullPointerException | IOException e) {
            System.out.println("Check the file!");
        }
        return characteristicOfAppliance;
    }

    /**
     * Reads information about appliances
     *
     * @param lineNumber number appliance in array
     * @return digit characteristic of appliance
     */

    public static ArrayList<Double> readDigitalCharacteristic(int lineNumber) {
        ArrayList<Double> doubleCharacteristic=new ArrayList<>();
        ArrayList<String> characteristicOfAppliance = readFile();

        Pattern p = Pattern.compile("([0-9]*[.])?[0-9]+");

        Matcher m = p.matcher(characteristicOfAppliance.get(lineNumber));
        while (m.find()) {
            try {
                doubleCharacteristic.add(Double.parseDouble(m.group()));
            } catch (NumberFormatException e) {
                System.out.println("Number is not find");
            }
        }
        return doubleCharacteristic;
    }

    /**
     * Reads information about appliances
     *
     * @param lineNumber number appliance in array
     * @return string characteristic of appliance
     */
        public static ArrayList<String> readStringCharacteristic(int lineNumber, String ... expression) {
            ArrayList<String> characteristicOfOs = readFile();
            ArrayList<String> stringCharacteristic = new ArrayList<>();
            for (int i = 0; i < expression.length; i++) {
                Pattern pattern = Pattern.compile(expression[i]);
                Matcher m = pattern.matcher(characteristicOfOs.get(lineNumber));
                m.find();
                stringCharacteristic.add(m.group(1));
            }
        return stringCharacteristic;
    }
}


