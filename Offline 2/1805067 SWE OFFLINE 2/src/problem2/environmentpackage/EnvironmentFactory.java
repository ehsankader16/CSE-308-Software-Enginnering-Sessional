package problem2.environmentpackage;

import problem2.fontpackage.Font;
import problem2.parserpackage.Parser;

public interface EnvironmentFactory {
    public Parser getParser();
    public Font getFont();
}
