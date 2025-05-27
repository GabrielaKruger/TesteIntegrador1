package utils;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ScreenShotUtils {

    public static void screenshot(String filename, WebDriver driver, Scenario scenario) {
        try {
            LocalDateTime localDate = LocalDateTime.now();
            String screenshotfilename = (filename + "-" + localDate).replace(" ", "-").replace(":", "-");

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timeMilliseconds = Long.toString(timestamp.getTime());

            // screenshot - Stefano
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", timeMilliseconds);

            // screenchot - Flavio
            File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotfile, new File(".//Screenshot//" + screenshotfilename + ".png"));
            System.out.println("Screenshot criado com sucesso. Path: "+screenshotfilename);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao tirar print");
        }
    }
}
