package by.trjava.task01.entity;

import java.util.ArrayList;

/**
 * This class contains contains constructor and override method equals, hashCode, toString
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */
public class Speakers extends Appliance {
    private double POWER_CONSUMPTION;
    private double NUMBER_OF_SPEAKERS;
    private double CORD_LENGTH;
    private String FREQUENCY_RANGE;

    public Speakers(ArrayList<Double> propertiesNumber, ArrayList<String> propertiesString) {
        this.POWER_CONSUMPTION = propertiesNumber.get(0);
        this.NUMBER_OF_SPEAKERS = propertiesNumber.get(1);
        this.CORD_LENGTH = propertiesNumber.get(4);
        this.FREQUENCY_RANGE = propertiesString.get(0);
    }

    public double getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public void setPOWER_CONSUMPTION(double POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public double getNUMBER_OF_SPEAKERS() {
        return NUMBER_OF_SPEAKERS;
    }

    public void setNUMBER_OF_SPEAKERS(double NUMBER_OF_SPEAKERS) {
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
    }

    public String getFREQUENCY_RANGE() {
        return FREQUENCY_RANGE;
    }

    public void setFREQUENCY_RANGE(String FREQUENCY_RANGE) {
        this.FREQUENCY_RANGE = FREQUENCY_RANGE;
    }

    public double getCORD_LENGTH() {
        return CORD_LENGTH;
    }

    public void setCORD_LENGTH(double CORD_LENGTH) {
        this.CORD_LENGTH = CORD_LENGTH;
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
        Speakers other = (Speakers) obj;
        if (POWER_CONSUMPTION != other.POWER_CONSUMPTION) {
            return false;
        }
        if (NUMBER_OF_SPEAKERS != other.NUMBER_OF_SPEAKERS) {
            return false;
        }
        if (FREQUENCY_RANGE == null) {
            if (other.FREQUENCY_RANGE != null) {
                return false;
            } else if (!FREQUENCY_RANGE.equals(other.FREQUENCY_RANGE)) {
                return false;
            }
        }
        if (CORD_LENGTH != CORD_LENGTH) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (31 * POWER_CONSUMPTION + NUMBER_OF_SPEAKERS
                + (FREQUENCY_RANGE == null ? 0 : FREQUENCY_RANGE.hashCode()) + CORD_LENGTH);
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", NUMBER_OF_SPEAKERS=" + NUMBER_OF_SPEAKERS +
                ", FREQUENCY_RANGE=" + FREQUENCY_RANGE + '\''+
                ", CORD_LENGTH=" + CORD_LENGTH ;
    }
}
