package by.trjava.task01.controller;

import by.trjava.task01.model.ApplianceSelection;
import by.trjava.task01.model.entity.*;
import by.trjava.task01.view.View;

public class ApplianceRunning {
    public static void main(String[] args) {


        Oven ovenDesired = new Oven(new double[]{1500.0, 12.0, 33.0, 60.0, 45.0, 68.0});
        Laptop laptopDesired = new Laptop(new double[]{1.5, 8000, 1000, 2.2, 19}, "Linux");
        Refrigerator refrigeratorDesired =new Refrigerator(new double[]{200.0, 30.0, 15.0, 300.0, 180.0, 80.0});


        ApplianceSelection ap1 = new ApplianceSelection();
        View.print(ap1.selectAppliance(ovenDesired));

        ApplianceSelection ap2 = new ApplianceSelection();
        View.print( ap2.selectAppliance(laptopDesired));

        ApplianceSelection ap3 = new ApplianceSelection();
        View.print(ap3.selectAppliance(refrigeratorDesired));

    }
}
