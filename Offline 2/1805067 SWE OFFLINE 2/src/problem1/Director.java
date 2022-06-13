package problem1;

import problem1.builder.SystemBuilder;

public class Director {
    private SystemBuilder systemBuilder;

    public void construct(SystemBuilder builder, String commSystem, int displayUnitCount) {
        systemBuilder = builder;
        builder.addApplication();
        builder.addCommSystem(commSystem);
        builder.addDisplayUnits(displayUnitCount);
    }
}
