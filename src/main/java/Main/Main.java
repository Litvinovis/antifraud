package Main;

import parser.Converter;

public class Main {
    public static void main(@org.jetbrains.annotations.NotNull String arg) throws Exception {
        Converter converter = new Converter();
        converter.MessageParser(arg);
    }
}
