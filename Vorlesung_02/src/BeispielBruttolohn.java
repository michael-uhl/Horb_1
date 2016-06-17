class BeispielBruttolohn {
	public static void main(String[] args) {
		long arbeitsstunden = 40;
		double stundenlohn = 10.0;

		double bruttolohn = new BeispielBruttolohn().berechneBruttolohn(arbeitsstunden,
				stundenlohn);
		System.out.println("Bruttolohn: " + bruttolohn);

	}

	double berechneBruttolohn(long arbeitsstunden, double stundenlohn) {
		double bruttolohn;
		bruttolohn = arbeitsstunden * stundenlohn;
		return bruttolohn;
	}
}