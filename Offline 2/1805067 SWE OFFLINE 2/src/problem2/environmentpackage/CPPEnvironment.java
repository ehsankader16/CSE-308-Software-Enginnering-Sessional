package problem2.environmentpackage;

import problem2.parserpackage.Parser;
import problem2.parserpackage.CPPParser;
import problem2.fontpackage.Font;
import problem2.fontpackage.Monaco;

public class CPPEnvironment implements EnvironmentFactory {
    public Parser getParser() { return new CPPParser(); }
    public Font getFont() { return new Monaco(); }
}
