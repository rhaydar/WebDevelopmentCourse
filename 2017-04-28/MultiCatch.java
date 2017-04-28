class MultiCatch {
	public static void main(String[] args) {
		int a = 88, b = 0;
		int result;

		char chars[] = {'A', 'B', 'C'};

		for (int i=0; i<2; i++) {
			try {
				if (i==0) {
					result = a/b; //generate ArithmeticException
				}
				else {
					chars[5] = 'E'; //generate ArrayIndexOutOfBoundsException
				}
			}
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception caught: " + e.toString());
			}
			System.out.println("After multi-catch.");
		}
	}
}