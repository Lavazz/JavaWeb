package by.trjava.task01.model.entity;

/**
 * This class contains override method equals and contains constructor
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @since JDK1.0
 */
public class Oven {
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    /**
     * Sole constructor.
     *
     * @param properties of oven
     */
    public Oven(double[] properties) {
        powerConsumption = properties[0];
        weight = properties[1];
        capacity = properties[2];
        depth = properties[3];
        height = properties[4];
        width = properties[5];
    }

    @Override
    public boolean equals(Object applianceDesired) {
        if (this == applianceDesired) return true;
        if (!(applianceDesired instanceof Oven)) return false;
        Oven oven = (Oven) applianceDesired;
        return Double.compare(oven.powerConsumption, powerConsumption) == 0 &&
                Double.compare(oven.weight, weight) == 0 &&
                Double.compare(oven.capacity, capacity) == 0 &&
                Double.compare(oven.depth, depth) == 0 &&
                Double.compare(oven.height, height) == 0 &&
                Double.compare(oven.width, width) == 0;
    }

}
