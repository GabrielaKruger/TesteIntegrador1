package hooks;

import driver.driverManager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.CredenciaisLogin;
import utils.ExecutionUtils;
import utils.MassaTeste;
import utils.ScreenShotUtils;


public class hooks {

    public static ExecutionUtils executionUtils;
    public static WebDriver driver;
    static CredenciaisLogin credenciaisLogin;
    public static MassaTeste massaTeste;

    @BeforeAll
    public static void before_all() {
        System.out.println("I am in before all");
    }

//    @Before(value = "@chrome", order = 0)
    public void chromeSetUp(Scenario scenario) {
        String browser = "chrome";

        System.out.println(scenario.getId());
        driver = DriverManager.getBrowserManager(browser).getDriver();
        executionUtils = ExecutionUtils.getInstance(scenario);
        executionUtils.setMassaTeste(scenario);
        executionUtils.setDriver(scenario, driver);
        System.out.println("Hooks - name scenario" + scenario.getName());
        //Dimension resolution = new Dimension(1920,1080);
        //driver.manage().window().setSize(resolution);
        //driver.manage().window().setSize(new Dimension(450, 300));
        //driver.manage().window().fullscreen();
        //driver.manage().window().maximize();
    }

//    @Before(value = "@firefox", order = 0)
    public void firefoxSetUp(Scenario scenario) {
        String browser = "firefox";
        System.out.println(scenario.getId());
        driver = DriverManager.getBrowserManager(browser).getDriver();
        executionUtils = ExecutionUtils.getInstance(scenario);
        executionUtils.setMassaTeste(scenario);
        executionUtils.setDriver(scenario, driver);
        System.out.println("Hooks - name scenario" + scenario.getName());
        System.out.println("Hooks - Driver: " + executionUtils.getDriver(scenario).toString());
        //driver.manage().window().fullscreen();
        //  driver.manage().window().maximize();
    }


    @After(value = "@chrome")
    public void chromeTearDown(Scenario scenario) {
//        executionUtils.getDriver(scenario).quit();
    }

    @After(value = "@firefox")
    public void fireFoxtearDown(Scenario scenario) {
//        executionUtils.getDriver(scenario).quit();
    }

//    @AfterAll()
    public static void after_all() {
        executionUtils.quitDrivers();
    }


    @BeforeStep()
    public void actionBeforeEachStep() {
    }


//    @AfterStep(value = "@firefox")
    public void actionPostEachStepFire(Scenario scenario) {
        String status = scenario.getStatus().toString();
        if (status.equals("FAILED")) {
            ScreenShotUtils.screenshot(scenario.getName(), executionUtils.getDriver(scenario.getId()), scenario);
            System.out.println("Driver: " + driver.toString());

        } else {
            System.out.println("I am in After step - PASSED");

        }
    }

//    @AfterStep(value = "@chrome")
    public void actionPostEachStepChrome(Scenario scenario) {
        String status = scenario.getStatus().toString();
        if (status.equals("FAILED")) {
            ScreenShotUtils.screenshot(scenario.getName(), executionUtils.getDriver(scenario.getId()), scenario);
            executionUtils.exibirMassaTeste();
            executionUtils.exibirWebdrivers();
        } else {
            System.out.println("I am in After step - PASSED");
        }
    }

}
