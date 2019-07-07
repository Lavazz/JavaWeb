package by.trjava.task01.model;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class reads properties from file
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @since JDK1.0
 */
public class PropertyReader {

    /**
     * Reads information about appliances
     *
     * @param path where stored information about appliances
     * @return characteristic of appliance as a string array
     */
    public static String[] parseFile(String path) {
        int i = 0;
        String[] characteristicOfAppliance = new String[11];

        Scanner scanner;
        try {
            FileReader fr = new FileReader(path);
            scanner = new Scanner(fr);

            while (scanner.hasNextLine()) {
                characteristicOfAppliance[i] = scanner.nextLine();
                i++;
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Check the file!");
        }

        return characteristicOfAppliance;
    }

    /**
     * Reads information about appliances
     *
     * @param path where stored information about appliances
     * @param lineNumber number appliance in array
     * @return digit characteristic of appliance
     */
    public static double[] digitalCharacteristic(String path, int lineNumber) {
        String[] characteristicOfAppliance = parseFile(path);
        double[] arrayOfCharacteristics = new double[6];
        int i = 0;

        Pattern p = Pattern.compile("([0-9]*[.])?[0-9]+");
        Matcher m = p.matcher(characteristicOfAppliance[lineNumber]);
        while (m.find()) {
           try {
               arrayOfCharacteristics[i] = Double.parseDouble(m.group());
           }catch (NumberFormatException e){
               System.out.println("Number is not find");
           }
            i++;
        }

        return arrayOfCharacteristics;
    }

    /**
     * Reads information about appliances
     *
     * @param path where stored information about appliances
     * @param lineNumber number appliance in array
     * @return string characteristic of appliance
     */
    public static String stringCharacteristic(String path, int lineNumber) {
        String[] characteristicOfOs = parseFile(path);
        Pattern pattern = Pattern.compile("OS=(\\w+).*");
        Matcher m = pattern.matcher(characteristicOfOs[lineNumber]);
        m.find();
         return m.group(1);
    }
}
