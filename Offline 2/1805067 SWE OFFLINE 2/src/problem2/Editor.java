package problem2;
import problem2.environmentpackage.CEnvironment;
import problem2.environmentpackage.CPPEnvironment;
import problem2.environmentpackage.EnvironmentFactory;
import problem2.environmentpackage.PythonEnvironment;

public class Editor {
    private static Editor instance;

    private Editor() {

    }

    public static Editor getInstance() {
        if(instance == null) {
            instance = new Editor();
        }
        return instance;
    }

    public EnvironmentFactory getEnvironment(String fileName) {
        if (fileName.endsWith(".c")) {
            return new CEnvironment();
        } else if (fileName.endsWith(".cpp")) {
            return new CPPEnvironment();
        } else if (fileName.endsWith(".py")) {
            return new PythonEnvironment();
        } else {
            System.out.println("No environment found for this type of file.");
        }
        return null;
    }

}
