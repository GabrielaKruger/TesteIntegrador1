//package pages.Faturamento.REC;
//
//import org.openqa.selenium.WebDriver;
//import pages.BasePage;
//
//public class REC001_Page extends BasePage {
//    WebDriver driver;
//
//    //Declaração de variáveis
//    String primeiraLinhaEmBranco;
//    String codigoSimulated;
//    String linhaDescricaoElement;
//    String descricaoFaker = "Teste automacao -";
//    String idColunaCadastrada = "msTipocertificado-cdTipocertificado";
//
//    public REC001_Page(WebDriver driver) {
//        super(driver);
//        this.driver = driver;
//    }
//
//    // Meteodo para preencher código
//    public void preencherCodigoRepetidoFeatureREC001(String repetido) {
//        primeiraLinhaEmBranco = testEncontraPrimeiraPosicaoEmBrancoLinhaGrid("//*[@id='msTipocertificado-cdTipocertificado-", "']/div/input");
//        String linhaCodigoElement = "//*[@id='msTipocertificado-cdTipocertificado-" + primeiraLinhaEmBranco + "']/div/input";
//
//        if (repetido.equalsIgnoreCase("sim")) {
//            // Buscar todos os códigos já cadastrados e selecionar um deles
//            codigoSimulated = obterCodigoExistente(idColunaCadastrada);
//        } else {
//            do {
//                codigoSimulated = faker.numerify("###");
//            } while (isCodigoCadastrado(codigoSimulated, idColunaCadastrada));
//        }
//
//        clicarElementoByXpathNVezes(linhaCodigoElement, 2);
//        esperarMilissegundos(1000);
//        preencherElementoByXpath(linhaCodigoElement, codigoSimulated);
//    }
//
//    // Metodo para preencher Descricao
//    public void preencherDescriçãoFeatureREC001() {
//        if (primeiraLinhaEmBranco == null) {
//            primeiraLinhaEmBranco = testEncontraPrimeiraPosicaoEmBrancoLinhaGrid("//*[@id='msTipocertificado-dsTipocertificado-", "']/div/input");
//        }
//        linhaDescricaoElement = "//*[@id='msTipocertificado-dsTipocertificado-" + primeiraLinhaEmBranco + "']/div/input";
//        descricaoFaker = "Teste automacao - " + faker.numerify("###");
//        clicarElementoByXpath(linhaDescricaoElement);
//        esperarMilissegundos(5000);
//        preencherElementoByXpath(linhaDescricaoElement, descricaoFaker);
//    }
//
//    // Metodo para selecionar codigo cadastrado
//    public void selecionarCódigoCadastradoFeatureREC001() {
//        String varNrRecebto = codigoSimulated;
//        String xPathColunaTabelaInicio = "//*[@id='msTipocertificado-cdTipocertificado-";
//        String xPathColunaTabelaFim = "']/div/input";
//        boolean encontrouRegistro = testConsultaRegistroGrid(varNrRecebto, xPathColunaTabelaInicio, xPathColunaTabelaFim);
//        if (encontrouRegistro) {
//            System.out.println("Registro encontrado");
//
//        }
//    }
//}
//
//
//
//
//
//
//
//
