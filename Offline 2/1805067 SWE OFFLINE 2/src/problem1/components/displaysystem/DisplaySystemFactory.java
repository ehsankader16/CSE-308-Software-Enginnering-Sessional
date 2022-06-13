package problem1.components.displaysystem;

public class DisplaySystemFactory {
    public DisplaySystem getDisplaySystem(String displaySystemType) {
        if (displaySystemType.equalsIgnoreCase("LCD")) {
            return new LcdSystem();
        } else if (displaySystemType.equalsIgnoreCase("LED")) {
            return new LedSystem();
        }
        return null;
    }
}
