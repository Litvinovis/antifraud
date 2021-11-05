import Main.Main;

import java.nio.file.Files;
import java.nio.file.Path;

public class MainTest {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        Path fileName = Path.of("src/test/resources/message.json");
        String path = Files.readString(fileName);
        main.main(path);
    }
}
