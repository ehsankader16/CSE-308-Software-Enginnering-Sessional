package problem1.builder;

import problem1.Product;

public class Deluxe extends SystemBuilder {
    @Override
    public void addDisplayUnits(int displayUnitCount) {
        for(int i = 0; i < displayUnitCount; i++) {
            product.addComponents(displaySystemFactory.getDisplaySystem("LCD"));
            product.addComponents(controlUnitFactory.getControlUnit("Raspberry PI"));
        }
    }
}
