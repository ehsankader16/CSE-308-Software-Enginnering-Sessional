package problem1;

import problem1.components.Component;
import problem1.components.appstore.Application;
import problem1.components.commsystem.CommSystem;
import problem1.components.controlunit.ControlUnit;
import problem1.components.displaysystem.DisplaySystem;

import java.util.ArrayList;
import java.util.LinkedList;

public class Product {
    private ArrayList<Component>parts;

    public Product() {
        parts = new ArrayList<Component>();
    }

    public void addComponents(Component component) {
        parts.add(component);
    }

    public void displayInfo() {
        double totalCost = 0;
        System.out.println("Details of the product: ");
        for (Component part : parts) {
            part.displayInfo();
            totalCost += part.getPrice();
            if(part instanceof CommSystem){
                totalCost += ((CommSystem) part).getYearlyCost();
            }
            System.out.println();
        }
        System.out.println("Total cost of the Queue Management System with yearly maintenance: Tk. "+ totalCost);
    }

//        System.out.println();
//        displaySystem.displayInfo();
//        System.out.println();
//        controlUnit.displayInfo();
//        System.out.println();
//        System.out.println("Number of Display Unit in the system: " + displayUnitCount);
//        totalCost = displayUnitCount*(displaySystem.getPrice()+controlUnit.getPrice());
//        System.out.println("Total Cost of Display Units: " + totalCost);
//        System.out.println();
//        application.displayInfo();
//        System.out.println();
//        totalCost += application.getPrice();
//        commSystem.displayInfo();
//        System.out.println();
//        totalCost += (commSystem.getPrice()+commSystem.getYearlyCost());

}
