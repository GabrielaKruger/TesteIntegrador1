package util.faker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

	public class GeradorChaveAcesso {

		    private static final String FORMATO_ANO_MES = "yyMM";

		    /**
		     * Gera uma chave de acesso para uma nota fiscal eletrônica, seguindo as regras definidas pelo governo brasileiro.
		     *
		     * @param cnpjEmissor CNPJ do emitente da nota fiscal
		     * @param modeloDocumento Modelo da nota fiscal (ex.: 55 para NF-e)
		     * @param serieDocumento Série da nota fiscal
		     * @param numeroDocumento Número da nota fiscal
		     * @param dataEmissao Data de emissão da nota fiscal
		     * @param codigoNumerico Código numérico aleatório de 8 dígitos (opcional)
		     * @return Chave de acesso gerada
		     */
		    public static String gerarChaveAcesso(String cnpjEmissor, int modeloDocumento, int serieDocumento, long numeroDocumento,
		                                          Calendar dataEmissao, Integer codigoNumerico) {
		        StringBuilder chaveAcessoBuilder = new StringBuilder();

		        // UF do emitente
		        String ufEmitente = "SP"; // Exemplo
		        chaveAcessoBuilder.append(ufEmitente);

		        // Ano e mês de emissão
		        SimpleDateFormat formatadorAnoMes = new SimpleDateFormat(FORMATO_ANO_MES);
		        String anoMesEmissao = formatadorAnoMes.format(dataEmissao.getTime());
		        chaveAcessoBuilder.append(anoMesEmissao);

		        // CNPJ do emitente
		        String cnpjEmitente = cnpjEmissor.replaceAll("[^0-9]", "");
		        chaveAcessoBuilder.append(cnpjEmitente);

		        // Modelo do documento fiscal
		        chaveAcessoBuilder.append(String.format("%02d", modeloDocumento));

		        // Série da nota fiscal
		        chaveAcessoBuilder.append(String.format("%03d", serieDocumento));

		        // Número da nota fiscal
		        chaveAcessoBuilder.append(String.format("%09d", numeroDocumento));

		        // Código numérico aleatório (opcional)
		        if (codigoNumerico == null) {
		            codigoNumerico = new Random().nextInt(99999999);
		        }
		        chaveAcessoBuilder.append(String.format("%08d", codigoNumerico));

		        // Dígito verificador
		        String chaveSemDV = chaveAcessoBuilder.toString();
		        String digitoVerificador = calcularDigitoVerificador(chaveSemDV);
		        chaveAcessoBuilder.append(digitoVerificador);

		        return chaveAcessoBuilder.toString();
		    }

		    /**
		     * Calcula o dígito verificador da chave de acesso, usando o algoritmo do módulo 11.
		     *
		     * @param chaveSemDV Chave de acesso sem o dígito verificador
		     * @return Dígito verificador calculado
		     */
		    private static String calcularDigitoVerificador(String chaveSemDV) {
		        int soma = 0;
		        int peso = 2;
		        for (int i = chaveSemDV.length() - 1; i >= 0; i--) {
		            int digito = Integer.parseInt(chaveSemDV.substring(i, i + 1));
		            soma += peso * digito;
		            peso++;
		            if (peso == 10) {
		                peso = 2;
		            }
		        }
		        int resto = soma % 11;
		        int dv = 11 - resto;
		        if (dv == 10 || dv == 11) {
		            dv = 0;
		        }
		        return String.valueOf(dv);
		    }
		}
