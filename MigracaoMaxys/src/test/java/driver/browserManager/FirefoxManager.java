package driver.browserManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxManager implements BrowserManager {
    @Override
    public WebDriver getDriver() {

        FirefoxOptions options = new FirefoxOptions();
        //descomentar para rodar localmente ---- daqui
        options.addArguments("--lang=pt-BR");
        options.addArguments("-width=1280");
        options.addArguments("-height=720");
//        options.addArguments("-headless");
        return new FirefoxDriver(options);
        //descomentar para rodar localmente ---- até aqui

//        //COMENTAR para rodar selenium grid ---- daqui
//        WebDriver driver = null;
//        try {
//            driver = new RemoteWebDriver(new URL("http://192.168.180.60:4444/wd/hub"), options);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        return driver;
        // até aqui --------------------------------
    }
}
