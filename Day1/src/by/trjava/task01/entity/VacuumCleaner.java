package by.trjava.task01.entity;

import java.util.ArrayList;

/**
 * This class contains contains constructor and override method equals, hashCode, toString
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */
public class VacuumCleaner extends Appliance {
    private double POWER_CONSUMPTION;
    private double MOTOR_SPEED_REGULATION;
    private double CLEANING_WIDTH;
    private String WAND_TYPE;
    private String BAG_TYPE;
    private String FILTER_TYPE;

    public VacuumCleaner(ArrayList<Double> propertiesNumber, ArrayList<String> propertiesString) {
        this.POWER_CONSUMPTION = propertiesNumber.get(0);
        this.MOTOR_SPEED_REGULATION = propertiesNumber.get(2);
        this.CLEANING_WIDTH = propertiesNumber.get(3);
        this.FILTER_TYPE = propertiesString.get(0);
        this.BAG_TYPE = propertiesString.get(1);
        this.WAND_TYPE = propertiesString.get(2);

    }

    public double getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public void setPOWER_CONSUMPTION(double POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public double getMOTOR_SPEED_REGULATION() {
        return MOTOR_SPEED_REGULATION;
    }

    public void setMOTOR_SPEED_REGULATION(double MOTOR_SPEED_REGULATION) {
        this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
    }

    public double getCLEANING_WIDTH() {
        return CLEANING_WIDTH;
    }

    public void setCLEANING_WIDTH(double CLEANING_WIDTH) {
        this.CLEANING_WIDTH = CLEANING_WIDTH;
    }

    public String getWAND_TYPE() {
        return WAND_TYPE;
    }

    public void setWAND_TYPE(String WAND_TYPE) {
        this.WAND_TYPE = WAND_TYPE;
    }

    public String getBAG_TYPE() {
        return BAG_TYPE;
    }

    public void setBAG_TYPE(String BAG_TYPE) {
        this.BAG_TYPE = BAG_TYPE;
    }

    public String getFILTER_TYPE() {
        return FILTER_TYPE;
    }

    public void setFILTER_TYPE(String FILTER_TYPE) {
        this.FILTER_TYPE = FILTER_TYPE;
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

        VacuumCleaner other = (VacuumCleaner) obj;
        if (POWER_CONSUMPTION != other.POWER_CONSUMPTION) {
            return false;
        }

        if (MOTOR_SPEED_REGULATION != other.MOTOR_SPEED_REGULATION) {
            return false;
        }
        if (CLEANING_WIDTH != other.CLEANING_WIDTH) {
            return false;
        }
        if (WAND_TYPE == null) {
            if (other.WAND_TYPE != null) {
                return false;
            } else if (WAND_TYPE.equals(other.WAND_TYPE)) {
                return false;
            }

            if (BAG_TYPE ==null) {
                if (other.BAG_TYPE != null) {
                    return false;
                } else if (!BAG_TYPE.equals(other.BAG_TYPE)) {
                    return false;
                }
            }
            if (FILTER_TYPE == null) {
                if (other.FILTER_TYPE != null) ;
            } else if (FILTER_TYPE.equals(other.FILTER_TYPE)) {
                return false;
            }
        }
        return true;

    }

    @Override
    public int hashCode() {
        return (int) (31 * POWER_CONSUMPTION + MOTOR_SPEED_REGULATION + CLEANING_WIDTH
                + (WAND_TYPE == null ? 0 : WAND_TYPE.hashCode()) + ( BAG_TYPE ==null? 0:  BAG_TYPE.hashCode())
                +(FILTER_TYPE == null ? 0 : FILTER_TYPE.hashCode()));
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", BAG_TYPE=" + BAG_TYPE +
                ", MOTOR_SPEED_REGULATION=" + MOTOR_SPEED_REGULATION +
                ", CLEANING_WIDTH=" + CLEANING_WIDTH +
                ", WAND_TYPE='" + WAND_TYPE + '\'' +
                ", FILTER_TYPE='" + FILTER_TYPE+ '\'';
    }
}
