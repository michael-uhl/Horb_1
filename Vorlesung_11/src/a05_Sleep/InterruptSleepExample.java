package a05_Sleep;

public class InterruptSleepExample {

	public static void main(String... strings) {
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("Es gibt ein Leben vor dem Tod.  ");

				while (!isInterrupted()) {
					System.out
							.println("Und er läuft und er läuft und er läuft");

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						interrupt();
						System.out.println("Unterbrechung in sleep()");
					}
				}

				System.out.println("Das Ende");
			}
		};
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();
	}
}
