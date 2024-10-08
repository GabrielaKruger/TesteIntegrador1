/**
 * 
 */
package util.faker;

import net.datafaker.Faker;
import net.datafaker.providers.base.IdNumber;

import java.util.Locale;
import java.util.Random;

/**
 * @author thatiane.galvan
 *
 */
public class MaxiconFaker extends Faker {

	private final CPFIdNumber idNumber;
	private final NFNumber nfNumber;

	public MaxiconFaker() {
		super(new Locale("pt", "BR"));
		this.idNumber = new CPFIdNumber(this);
		this.nfNumber = new NFNumber(this);
	}

	public MaxiconFaker(Random random) {
		super(new Locale("pt", "BR"), random);
		this.idNumber = new CPFIdNumber(this);
		this.nfNumber = new NFNumber(this);
	}
	
	@Override
	public IdNumber idNumber() {
		return idNumber;
	}
	
	public NFNumber nfeNfceKey() {
		return nfNumber;
	}
	
}
