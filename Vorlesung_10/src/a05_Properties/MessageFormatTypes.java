package a05_Properties;

import java.text.MessageFormat;

public class MessageFormatTypes {
	public static void main(String ... args) {
		System.out.println(MessageFormat.format("Ganzzahl {0,number,integer}.", 3000000000l));
		System.out.println(MessageFormat.format("Kommazahl {0,number,#.#}.", Math.PI));
		System.out.println(MessageFormat.format("Kommazahl {0,number,#.##}.", Math.PI));
		System.out.println(MessageFormat.format("Kommazahl {0,number,#.###}.", Math.PI));
		System.out.println(MessageFormat.format("Kommazahl {0,number,#.####}.", Math.PI));
		System.out.println(MessageFormat.format("Euro: {0,number,currency}.", Math.PI));
		System.out.println(MessageFormat.format("Prozent: {0,number,percent}.", 0.5));
	}
}
