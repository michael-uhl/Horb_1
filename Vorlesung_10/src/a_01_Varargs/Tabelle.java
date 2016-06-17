package a_01_Varargs;

public class Tabelle {
	
	public static void main(String ... args) {
		System.out.printf("%1s  %-7s   %-7s   %-6s   %-6s%n", "n", "result1", "result2", "time1", "time2");
		System.out.printf("%1d  %7.2f   %7.1f   %4dms   %4dms%n", 5, 1000f, 20000f, 1000, 1250);
		System.out.printf("%1d  %7.2f   %7.1f   %4dms   %4dms%n", 6, 300f, 700f, 200, 950);		
	}

}
