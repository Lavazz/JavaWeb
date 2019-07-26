package by.trjava.task01.entity;

import java.util.ArrayList;

/**
 * This class contains contains constructor and override method equals, hashCode, toString
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */
public class TabletPC extends Appliance {
    private double BATTERY_CAPACITY;
    private double DISPLAY_INCHES;
    private double MEMORY_ROM;
    private double FLASH_MEMORY_CAPACITY;
    private String COLOR;

    public TabletPC(ArrayList<Double> propertiesNumber, ArrayList<String> color) {
        this.BATTERY_CAPACITY = propertiesNumber.get(0);
        this.DISPLAY_INCHES = propertiesNumber.get(1);
        this.MEMORY_ROM = propertiesNumber.get(2);
        this.FLASH_MEMORY_CAPACITY = propertiesNumber.get(3);
        COLOR = color.get(0);
    }

    public double getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public void setBATTERY_CAPACITY(double BATTERY_CAPACITY) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
    }

    public double getDISPLAY_INCHES() {
        return DISPLAY_INCHES;
    }

    public void setDISPLAY_INCHES(double DISPLAY_INCHES) {
        this.DISPLAY_INCHES = DISPLAY_INCHES;
    }

    public double getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public void setMEMORY_ROM(double MEMORY_ROM) {
        this.MEMORY_ROM = MEMORY_ROM;
    }

    public double getFLASH_MEMORY_CAPACITY() {
        return FLASH_MEMORY_CAPACITY;
    }

    public void setFLASH_MEMORY_CAPACITY(double FLASH_MEMORY_CAPACITY) {
        this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
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

        TabletPC other = (TabletPC) obj;
        if (BATTERY_CAPACITY != other.BATTERY_CAPACITY) {
            return false;
        }
        if (DISPLAY_INCHES != other.DISPLAY_INCHES) {
            return false;
        }
        if (MEMORY_ROM != other.MEMORY_ROM) {
            return false;
        }
        if (FLASH_MEMORY_CAPACITY != FLASH_MEMORY_CAPACITY) {
            return false;
        }
        if (COLOR == null) {
            if (other.COLOR != null) {
                return false;
            } else if (!COLOR.equals(other.COLOR)) {
                return false;
            }

        }
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (31 * BATTERY_CAPACITY + DISPLAY_INCHES + MEMORY_ROM + FLASH_MEMORY_CAPACITY +
                (COLOR == null ? 0 : COLOR.hashCode()));
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", DISPLAY_INCHES=" + DISPLAY_INCHES +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", FLASH_MEMORY_CAPACITY=" + FLASH_MEMORY_CAPACITY +
                ", COLOR='" + COLOR + '\'';
    }
}
