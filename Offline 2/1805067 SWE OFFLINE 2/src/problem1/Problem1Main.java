package problem1;

import problem1.builder.Deluxe;
import problem1.builder.SystemBuilder;

public class Problem1Main {
    public static void main(String[] args) {
        Director director = new Director();
        SystemBuilder deluxeBuilder = new Deluxe();
        director.construct(deluxeBuilder,"WiFi", 3);
        Product product = deluxeBuilder.getProduct();
        product.displayInfo();
    }
}