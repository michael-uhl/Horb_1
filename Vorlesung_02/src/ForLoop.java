public class ForLoop {
	public static void main(String[] args) {
		String text = "hallo";

		for (int i = 0; text.length() > 0; i++) {
			System.out.println("'" + text + "'");
			text = text.substring(1);
		}
		
		/*
		  rv af flf kja af
		  ajfk dfad fadslkfj adslf
		  fjladfal adlfj alfj adlf
		  fjafj ad 
		 */
		
		int n = 5; // n ist 5
		for (int i = 0; i < n; i++) {
			System.out.println("i=" + i);
		}
	}
	

		public static void vertausche(String[] args) {
			int a = 7;
			int b = 2;

			int h = 0;
			
			h = a;
			a = b;
			b = h;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
}
