package problem1.builder;

public class Poor extends SystemBuilder {
    @Override
    public void addDisplayUnits(int displayUnitCount) {
        for(int i = 0; i < displayUnitCount; i++) {
            product.addComponents(displaySystemFactory.getDisplaySystem("LED"));
            product.addComponents(controlUnitFactory.getControlUnit("ATMega32"));
        }
    }
}
