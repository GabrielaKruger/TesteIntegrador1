package util.faker;

import net.datafaker.Faker;
import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

import java.util.concurrent.TimeUnit;

public class NFNumber extends AbstractProvider<BaseProviders> {
	private final int[] stateCode = { 11, 12, 13, 14, 15, 16, 17, 21, 22, 23, 24, 25, 26, 27, 28, 29, 31, 32, 33, 35,
			41, 42, 43, 50, 51, 52, 53 };

	public NFNumber(Faker faker) {
		super(faker);
	}

	public String valid() {
		return valid(true);
	}

	public String valid(boolean nfe) {
		return valid(nfe, faker.cnpj().valid(false));
	}

	public String valid(boolean nfe, String cnpj) {
		StringBuilder key = new StringBuilder(44);
		key.append(randomStateCode()); // codigo estado
		key.append(faker.date().past(6 * 31, TimeUnit.DAYS, "yyMM")); // ano-mes
		key.append(cnpj); // cnpj

		if (nfe)
			key.append("55"); // modelo nfe
		else
			key.append("65"); // modelo nfce

		key.append("001"); // serie da nota
		key.append(faker.numerify("#########")); // numero nf
		key.append("1"); // tipo emissão
		key.append(faker.numerify("########")); // codigo numérico
		key.append(calculateChecksum(key)); // calculo digito verificador
		return key.toString();
	}

	public String invalid() {
		String cUf = faker.numerify("##");
		String anoMes = faker.numerify("####");
		String cnpj = faker.cnpj().invalid(false);
		String modelo = faker.numerify("##");
		String serie = faker.numerify("###");
		String nNF = faker.numerify("#########");
		String tpEmis = faker.numerify("#");
		String cNf = faker.numerify("########");
		String cDV = faker.numerify("#");
		return cUf + anoMes + cnpj + modelo + serie + nNF + tpEmis + cNf + cDV;
	}

	private int calculateChecksum(StringBuilder key) {
		int[] mult = { 2, 3, 4, 5, 6, 7, 8, 9 };

		int sum = 0;
		int j = 0;

		for (int i = key.length() - 1; i >= 0; i--) {
			int n = Character.getNumericValue(key.charAt(i));
			sum += n * mult[j % mult.length];
			j++;
		}
		int ckSum = 11 - (sum % 11);

		return (ckSum > 9) ? 0 : ckSum;
	}
	
	private int randomStateCode() {
		return stateCode[faker.number().numberBetween(0, stateCode.length)];
	}

}
