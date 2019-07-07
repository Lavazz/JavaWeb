package by.trjava.task01.model.entity;

/**
 * This class contains override method equals and contains constructor
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @since JDK1.0
 */
public class Refrigerator {
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    /**
     * Sole constructor.
     *
     * @param properties of refrigerator
     */
    public Refrigerator(double[] properties) {
        powerConsumption = properties[0];
        weight = properties[1];
        freezerCapacity = properties[2];
        overallCapacity = properties[3];
        height = properties[4];
        width = properties[5];
    }

    @Override
    public boolean equals(Object applianceDesired) {
        if (this == applianceDesired) return true;
        if (!(applianceDesired instanceof Refrigerator)) return false;
        Refrigerator that = (Refrigerator) applianceDesired;
        return Double.compare(that.powerConsumption, powerConsumption) == 0 &&
                Double.compare(that.weight, weight) == 0 &&
                Double.compare(that.freezerCapacity, freezerCapacity) == 0 &&
                Double.compare(that.overallCapacity, overallCapacity) == 0 &&
                Double.compare(that.height, height) == 0 &&
                Double.compare(that.width, width) == 0;
    }

}
