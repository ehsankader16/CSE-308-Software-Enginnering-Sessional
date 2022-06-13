package problem1.builder;

import problem1.Product;

public class Optimal extends SystemBuilder{

    @Override
    public void addDisplayUnits(int displayUnitCount) {
        for(int i = 0; i < displayUnitCount; i++) {
            product.addComponents(displaySystemFactory.getDisplaySystem("LED"));
            product.addComponents(controlUnitFactory.getControlUnit("Arduino Mega"));
        }
    }
}
