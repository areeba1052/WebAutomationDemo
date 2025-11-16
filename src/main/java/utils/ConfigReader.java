package utils;


import io.github.cdimascio.dotenv.Dotenv;

public class ConfigReader {
    private static final Dotenv dotenv = Dotenv.configure().directory("./src/main/resources").load();

    public static String get(String key) {
        return dotenv.get(key);
    }
}
