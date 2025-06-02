package driver.driverManager;

import driver.browserManager.BrowserManager;
import driver.browserManager.ChromeManager;
import driver.browserManager.FirefoxManager;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;

public class DriverManager {

    private static WebDriver driver;
    private static String browser = "chrome"; // padrão

    public static BrowserManager getBrowserManager(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
                return new ChromeManager();
            case "firefox":
                return new FirefoxManager();
            default:
                throw new IllegalArgumentException("no matching browser");
        }
    }

    /**
     * Retorna o nome do browser pelo cenário (caso use @chrome ou @firefox na feature)
     */
    public static String getBrowserByScenario(Scenario scenario) {
        Iterator<String> tags = scenario.getSourceTagNames().iterator();
        String tagBrowser = "";
        while (tags.hasNext()) {
            String tagName = tags.next();
            if (tagName.startsWith("@chrome")) {
                tagBrowser = "chrome";
                break;
            }
            if (tagName.startsWith("@firefox")) {
                tagBrowser = "firefox";
                break;
            }
        }
        return tagBrowser.isEmpty() ? "chrome" : tagBrowser; // padrão chrome
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            // Garante que sempre será criado apenas uma vez por execução
            driver = getBrowserManager(browser).getDriver();
        }
        return driver;
    }

    public static void setBrowser(String browserName) {
        browser = browserName;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}