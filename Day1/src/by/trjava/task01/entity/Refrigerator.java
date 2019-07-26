package by.trjava.task01.entity;

import java.util.ArrayList;

/**
 * This class contains contains constructor and override method equals, hashCode, toString
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */
public class Refrigerator extends Appliance {
    private double POWER_CONSUMPTION;
    private double WEIGHT;
    private double FREEZER_CAPACITY;
    private double OVERALL_CAPACITY;
    private double HEIGHT;
    private double WIDTH;

    public Refrigerator(ArrayList<Double> properties) {
        POWER_CONSUMPTION = properties.get(0);
        WEIGHT = properties.get(1);
        FREEZER_CAPACITY = properties.get(2);
        OVERALL_CAPACITY = properties.get(3);
        HEIGHT =properties.get(4);
        WIDTH = properties.get(5);
    }

    public Refrigerator() {
    }

    public double getPowerConsumption() {
        return POWER_CONSUMPTION;
    }

    public void setPowerConsumption(double POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public double getWeight() {
        return WEIGHT;
    }

    public void setWeight(double WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public double getFreezerCapacity() {
        return FREEZER_CAPACITY;
    }

    public void setFreezerCapacity(double FREEZER_CAPACITY) {
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
    }

    public double getOverallCapacity() {
        return OVERALL_CAPACITY;
    }

    public void setOverallCapacity(double OVERALL_CAPACITY) {
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
    }

    public double getHeight() {
        return HEIGHT;
    }

    public void setHeight(double HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public double getWidth() {
        return WIDTH;
    }

    public void setWidth(double WIDTH) {
        this.WIDTH = WIDTH;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Refrigerator other = (Refrigerator) obj;
        if (POWER_CONSUMPTION != other.POWER_CONSUMPTION) {
            return false;
        }
        if (WEIGHT != other.WEIGHT) {
            return false;
        }
        if (FREEZER_CAPACITY != other.FREEZER_CAPACITY) {
            return false;
        }
        if (OVERALL_CAPACITY != other.OVERALL_CAPACITY) {
            return false;
        }
        if (HEIGHT != other.HEIGHT) {
            return false;
        }
        if (WIDTH != other.WIDTH) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (31 * POWER_CONSUMPTION + WEIGHT + FREEZER_CAPACITY + OVERALL_CAPACITY + HEIGHT + WIDTH);
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", FREEZER_CAPACITY=" + FREEZER_CAPACITY +
                ", OVERALL_CAPACITY=" + OVERALL_CAPACITY +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH;
    }
}