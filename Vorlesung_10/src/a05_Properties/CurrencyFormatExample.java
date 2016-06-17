package a05_Properties;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class CurrencyFormatExample {

	public static void main(String[] args) {
		BigDecimal amount = BigDecimal.valueOf(9.99);
		System.out.println(MessageFormat.format("Euro: {0,number,currency}.", amount));
	}
}
