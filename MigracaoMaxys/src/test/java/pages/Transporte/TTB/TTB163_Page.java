package pages.Transporte.TTB;

import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utils.DataUtils;

public class TTB163_Page extends BasePage {
    WebDriver driver;

    public TTB163_Page(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    //Strings Solicitante/Autorizador
    String inputEmpresaXpath = "//*[@id='solicitantecontrfrete-cdEmpresa-";
    String inputUserXpath = "//*[@id='solicitantecontrfrete-cdUsuario-";
    String inputTipoXpath = "//*[@id='solicitantecontrfrete-stSolicitante-";
    String inputCodDaAlcadaXpath = "//*[@id='solicitantecontrfrete-cdAlcada-";
    String inputDataVencXpath = "//*[@id='solicitantecontrfrete-dtVencimento-";


    //Globais
    int primeiraLinhaEmBranco;
    String inputXpathFim = "']/div/input";
    String inputXpatFimDatas = "']/div/div/input";


    public void preencherEmpresaFeatureTTB163(String empresa) {
        //esperarMilissegundos(10000); //espera necessária
        verificarOuSetarPrimeiraLinhaEmBranco();

        String linhaGridEmpresaXpath = inputEmpresaXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridEmpresaXpath,2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridEmpresaXpath, empresa);
        pressionaTabActions();
    }


    public void preencherUsuárioFeatureTTB163(String user) {
        verificarOuSetarPrimeiraLinhaEmBranco();

        String linhaGridUserXpath = inputUserXpath+ primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridUserXpath,2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridUserXpath, user);
    }

    public void preencherTipoSolicFeatueTTB163(String tipoSolicitante) {
        verificarOuSetarPrimeiraLinhaEmBranco();

        // Ajustar para pegar do intervalo
        //int codigoSimulatedInt = faker.random().nextInt(1, 16);
        //String codigoSimulateAlcada = Integer.toString(codigoSimulatedInt);

        String linhaGridTipoSolicXpath = inputTipoXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridTipoSolicXpath,2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridTipoSolicXpath, tipoSolicitante);
    }

    public void preencherCódDaAlçadaFeatureTTB163() {
        verificarOuSetarPrimeiraLinhaEmBranco();

        int codigoSimulatedInt = faker.random().nextInt(1, 10);
        String codigoSimulateAlcada = Integer.toString(codigoSimulatedInt);

        String linhaGridCodAlcadaXpath = inputCodDaAlcadaXpath + primeiraLinhaEmBranco + inputXpathFim;

        clicarElementoByXpathNVezes(linhaGridCodAlcadaXpath,2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridCodAlcadaXpath, codigoSimulateAlcada);
    }

    public void prencherDataDeVencimentoFeatureTTB163() {
        verificarOuSetarPrimeiraLinhaEmBranco();

        String linhaGridDataVencXpath = inputDataVencXpath + primeiraLinhaEmBranco + inputXpatFimDatas;

        clicarElementoByXpathNVezes(linhaGridDataVencXpath,2);
        esperarMilissegundos(500); // espera necessária
        preencherElementoByXpath(linhaGridDataVencXpath, DataUtils.DataAtual());
    }

}
