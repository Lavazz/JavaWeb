package by.trjava.task01.entity;

import java.util.ArrayList;

/**
 * This class contains contains constructor and override method equals, hashCode, toString
 *
 * @author Kaloshych Katsiaryna
 * @version 2.0
 * @since JDK1.0
 */
public class Laptop extends Appliance {
    private double BATTERY_CAPACITY;
    private String OS;
    private double MEMORY_ROM;
    private double SYSTEM_MEMORY;
    private double CPU;
    private double DISPLAY_INCHS;


    public Laptop(ArrayList<Double> properties, ArrayList<String> os) {
        BATTERY_CAPACITY = properties.get(0);
        MEMORY_ROM = properties.get(1);
        SYSTEM_MEMORY = properties.get(2);
        CPU =properties.get(3);
        DISPLAY_INCHS = properties.get(4);
        OS = os.get(0);
    }

    public Laptop() {
    }


    public double getBatteryCapacity() {
        return BATTERY_CAPACITY;
    }

    public void setBatteryCapacity(double BATTERY_CAPACITY) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
    }

    public String getOs() {
        return OS;
    }

    public void setOs(String OS) {
        this.OS = OS;
    }

    public double getMemoryRom() {
        return MEMORY_ROM;
    }

    public void setMemoryRom(double MEMORY_ROM) {
        this.MEMORY_ROM = MEMORY_ROM;
    }

    public double getSystemMemory() {
        return SYSTEM_MEMORY;
    }

    public void setSystemMemory(double SYSTEM_MEMORY) {
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
    }

    public double getCpu() {
        return CPU;
    }

    public void setCpu(double CPU) {
        this.CPU = CPU;
    }

    public double getDisplayInchs() {
        return DISPLAY_INCHS;
    }

    public void setDisplayInchs(double DISPLAY_INCHS) {
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

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

        Laptop other = (Laptop) obj;
        if (BATTERY_CAPACITY != other.BATTERY_CAPACITY) {
            return false;
        }
        if (MEMORY_ROM != other.MEMORY_ROM) {
            return false;
        }
        if (SYSTEM_MEMORY != other.SYSTEM_MEMORY) {
            return false;
        }
        if (CPU != other.CPU) {
            return false;
        }
        if (DISPLAY_INCHS != other.DISPLAY_INCHS) {
            return false;
        }
        if (OS == null) {
            if (other.OS != null) {
                return false;
            }
        } else if (!OS.equals(other.OS)) {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        return (int) (31 * BATTERY_CAPACITY + ((OS == null) ? 0 : OS.hashCode()) + MEMORY_ROM + SYSTEM_MEMORY + CPU + DISPLAY_INCHS);
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", OS='" + OS + '\'' +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", SYSTEM_MEMORY=" + SYSTEM_MEMORY +
                ", CPU=" + CPU +
                ", DISPLAY_INCHS=" + DISPLAY_INCHS;
    }
}