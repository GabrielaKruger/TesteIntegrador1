package driver.browserManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeManager implements BrowserManager {
    @Override
    public WebDriver getDriver() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--enable-managed-downloads");
        options.addArguments("--lang=pt-BR");
        options.addArguments("enable-automation");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-extensions");
        options.addArguments("--dns-prefetch-disab");
        options.addArguments("--force-device-scale-factor=0.9"); //para alterar o zoom da pagina chrome
        //options.addArguments("--incognito"); //Executar em guia anonima

        if (System.getenv("JENKINS_URL") != null) {
            WebDriver driver = null;
            try {
                driver = new RemoteWebDriver(new URL("http://192.168.180.60:4444/wd/hub"), options);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return driver;
        } else {
            return new ChromeDriver(options);
        }
    }
}
