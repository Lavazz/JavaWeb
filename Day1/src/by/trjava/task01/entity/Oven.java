package by.trjava.task01.entity;

import java.util.ArrayList;

/**
 * This class contains contains constructor and override method equals, hashCode, toString
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */
public class Oven extends Appliance {
    private double POWER_CONSUMPTION;
    private double WEIGHT;
    private double CAPACITY;
    private double DEPTH;
    private double HEIGHT;
    private double WIDTH;


    public Oven(ArrayList<Double> properties) {
        POWER_CONSUMPTION = properties.get(0);
        WEIGHT = properties.get(1);
        CAPACITY = properties.get(2);
        DEPTH = properties.get(3);
        HEIGHT = properties.get(4);
        WIDTH = properties.get(5);
    }

    public Oven() {
    }

    public double getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public void setPOWER_CONSUMPTION(double POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public double getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(double WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public double getCAPACITY() {
        return CAPACITY;
    }

    public void setCAPACITY(double CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    public double getDEPTH() {
        return DEPTH;
    }

    public void setDEPTH(double DEPTH) {
        this.DEPTH = DEPTH;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(double HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public double getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(double WIDTH) {
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
        Oven other = (Oven) obj;
        if (POWER_CONSUMPTION != other.POWER_CONSUMPTION) {
            return false;
        }
        if (WEIGHT != other.WEIGHT) {
            return false;
        }
        if (CAPACITY != other.CAPACITY) {
            return false;
        }
        if (DEPTH != other.DEPTH) {
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
        return (int) (31 * POWER_CONSUMPTION + WEIGHT + CAPACITY + DEPTH + HEIGHT + WIDTH);
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", CAPACITY=" + CAPACITY +
                ", DEPTH=" + DEPTH +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH ;
    }
}
