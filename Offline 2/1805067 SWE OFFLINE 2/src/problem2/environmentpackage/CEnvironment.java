package problem2.environmentpackage;

import problem2.parserpackage.Parser;
import problem2.parserpackage.CParser;
import problem2.fontpackage.CourierNew;
import problem2.fontpackage.Font;

public class CEnvironment implements EnvironmentFactory {
    public Parser getParser() { return new CParser(); }

    public Font getFont() { return new CourierNew(); }
}
