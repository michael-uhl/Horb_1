
public class TauschBeispiel {
	public static void main(String[] args) {
		MyInteger x = new MyInteger(5);
		MyInteger y = new MyInteger(2);
		
		tausche1(x,y);
		System.out.println(x + "," + y);
		
		tausche2(x,y);
		System.out.println(x + "," + y);		
	}
	
	public static void tausche1(MyInteger a, MyInteger b) {
		MyInteger t = new MyInteger(a.intValue());
		a = new MyInteger(b.intValue());
		b = new MyInteger(t.intValue());
	}
	
	public static void tausche2( MyInteger a,  MyInteger b) {
		int t = a.intValue();
		a.setValue(b.intValue());
		b.setValue(t);
	}
	
	private static final class MyInteger {
		private int value;

		public MyInteger(int value) {
			super();
			this.value = value;
		}

		public int intValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
		public String toString() {
			return "" + value;
		}
		
	}
}
