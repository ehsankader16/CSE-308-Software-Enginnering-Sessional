package problem2;

import problem2.environmentpackage.EnvironmentFactory;

public class Problem2Main {
    public static void main(String[] args) {
        String fileName = "example.py";
        Editor editor = Editor.getInstance();
        EnvironmentFactory environmentFactory = editor.getEnvironment(fileName);
        System.out.println(fileName + " file is open");
        environmentFactory.getParser().showParser();
        environmentFactory.getFont().showFont();
    }
}
