/**
 * 
 */
package util.faker;

import net.datafaker.Faker;
import net.datafaker.providers.base.IdNumber;

/**
 * @author thatiane.galvan
 *
 */
public class CPFIdNumber extends IdNumber {
	
	private final Faker faker;
	
	public CPFIdNumber(Faker faker) {
		super(faker);
		this.faker=faker;
	}

	@Override
	public String valid() {
		return generateFromCandidate(faker.numerify("#########"));
	}



	@Override
	public String invalid() {
		String invalidSsn = faker.numerify("###########");
		if(isSsnValid(invalidSsn))
			return invalid();
		return invalidSsn;	
	}


	@Override
	public String ssnValid() {
		return valid();
	}

	
	public boolean isSsnValid(String s) {
		s = s.replaceAll("[\\D]", "");    
		if(s.length() != 11)
			return false;
		String validSsn= generateFromCandidate(s.substring(0, 9));
		return s.equals(validSsn);
	}
	
	
	private String generateFromCandidate(String s) {
		StringBuilder candidate = new StringBuilder(s);
		candidate.append(calculateChecksum(candidate));
		candidate.append(calculateChecksum(candidate));
		return candidate.toString();
	}
	
	private int calculateChecksum(StringBuilder ssn)
	{
		int somatorio = 0;
        int j = ssn.length() + 1;
        
        for(int i = 0; i < ssn.length(); i++) {
        	int n = Character.getNumericValue(ssn.charAt(i));
            somatorio += n * j;
            j--;
        }
        int resto = somatorio % 11;
        return (resto < 2)? 0 : (11-resto);
		
	}
	
}
