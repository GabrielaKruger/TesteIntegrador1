/**
 * 
 */
package util;

import java.time.format.DateTimeFormatter;

/**
 * @author thatiane.galvan
 *
 */
public final class Formato {

	private Formato() {}
	public static DateTimeFormatter diaMesAno = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static DateTimeFormatter mesAno = DateTimeFormatter.ofPattern("MM/yyyy");
    public static DateTimeFormatter ano = DateTimeFormatter.ofPattern("yyyy");
}
