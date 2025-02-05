package pages.Navegador.ANV;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ANV054_Page extends BasePage {
    WebDriver driver;

    public ANV054_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    String inputEmpresaXpath = "//*[@id='controle-cdEmpresa']/div/input";
    String inputProgramaXpath = "//*[@id='controle-nmPrograma']/div/input";

    String btnConsultar = "//*[@id='controle-btnConsultar']/div/button/div";

    int primeiraLinhaEmBranco;

    public void informarOCampoEmpresaFeatureANV054(String empresa) {
        esperarElementoClicavelByXpath(inputEmpresaXpath);
        clicarElementoByXpathNVezes(inputEmpresaXpath, 2);
        preencherElementoByXpath(inputEmpresaXpath, empresa);

    }

    public void informarOProgramaFeatureANV054(String programa) {
        esperarMilissegundos(2000);
        esperarElementoClicavelByXpath(inputProgramaXpath);
        clicarElementoByXpathNVezes(inputProgramaXpath, 2);
        esperarMilissegundos(2000);
        preencherElementoByXpath(inputProgramaXpath, programa);
    }

    public void clicarBotaoConsultarFeatureANV054() {
        esperarMilissegundos(1000);
        esperarElementoClicavelByXpath(btnConsultar);
        clicarElementoByXpathNVezes(btnConsultar, 2);
    }

    public void selecionarGridFeatureANV054() {
        primeiraLinhaEmBranco = encontrarPrimeiraLinhaEmBrancoNoGrid(driver);

        String linhaGridAutorizador = "//*[@id='programaempr-cdEmpresa-" + primeiraLinhaEmBranco + "']/div/input";

        clicarElementoByXpathNVezes(linhaGridAutorizador, 1);
    }
}
