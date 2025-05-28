package steps;

import io.cucumber.java.pt.E;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginStep {
    WebDriver driver;
    LoginPage loginPage;

    public LoginStep() throws Exception {
        loginPage = new LoginPage(driver);
    }

//    @E("acessa o programa {string}")
//    public void acessarPrograma(String programa) {
//        loginPage.loginNewMaxysNovo(programa);
//    }

}

