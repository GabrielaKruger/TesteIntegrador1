package driver.driverManager;

import driver.browserManager.BrowserManager;
import driver.browserManager.ChromeManager;
import driver.browserManager.FirefoxManager;
import io.cucumber.java.Scenario;

import java.util.Iterator;

public class DriverManager {

    public static BrowserManager getBrowserManager(String browser) {

        switch (browser.toLowerCase()) {
            case "chrome":
                return new ChromeManager();
            case "firefox":
                return new FirefoxManager();
            default:
                throw new IllegalArgumentException("no matching browser");
        }

    }

    /**
     * Retorna o nome do arquivo json de massa de teste tendo como entrada o scenario
     *
     * @param scenario
     * @return
     */
    public static String getBrowserByScenario(Scenario scenario) {
        Iterator<String> tags = scenario.getSourceTagNames().iterator();
        String browser = "";
        while (tags.hasNext()) {
            String tagName = tags.next();
            if (tagName.startsWith("@chrome")) {
                browser = "chrome";
                break;
            }
            if (tagName.startsWith("@firefox")) {
                browser = "firefox";
                break;
            }
        }
        return browser;
    }
}
