package by.trjava.task01.model.entity;

import java.util.Objects;

/**
 * This class contains override method equals and contains constructor
 *
 * @author Kaloshych Katsiaryna
 * @version 1.0
 * @since JDK1.0
 */
public class Laptop {
    private double batteryCapacity;
    private String os;
    private double memoryRom;
    private double systemMemory;
    private double cpu;
    private double displayInchs;


    /**
     * Sole constructor.
     *
     * @param properties of laptop
     * @param os
     */
    public Laptop(double[] properties, String os) {
        batteryCapacity = properties[0];
        memoryRom = properties[1];
        systemMemory = properties[2];
        cpu = properties[3];
        displayInchs = properties[4];
        this.os = os;
    }

    @Override
    public boolean equals(Object applianceDesired) {
        if (this == applianceDesired) return true;
        if (!(applianceDesired instanceof Laptop)) return false;
        Laptop laptop = (Laptop) applianceDesired;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 &&
                Double.compare(laptop.memoryRom, memoryRom) == 0 &&
                Double.compare(laptop.systemMemory, systemMemory) == 0 &&
                Double.compare(laptop.cpu, cpu) == 0 &&
                Double.compare(laptop.displayInchs, displayInchs) == 0 &&
                Objects.equals(os, laptop.os);
    }


}
