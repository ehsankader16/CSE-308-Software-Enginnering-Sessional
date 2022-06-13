package problem2.environmentpackage;

import problem2.parserpackage.Parser;
import problem2.parserpackage.PythonParser;
import problem2.fontpackage.Consolas;
import problem2.fontpackage.Font;

public class PythonEnvironment implements EnvironmentFactory {
    public Parser getParser() {
        return new PythonParser();
    }
    public Font getFont() {
        return new Consolas();
    }
}
