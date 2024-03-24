import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static final String CONFIG_FILE_PATH = "config.properties";

    public static String getUsername() {
        return getProperty("username");
    }

    public static String getPassword() {
        return getProperty("password");
    }

    private static String getProperty(String propertyName) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(CONFIG_FILE_PATH));
            return properties.getProperty(propertyName);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
