class ThrowDemo {
	public static void main(String[] args) {
		
		try {
			System.out.println("Before throw.");
			throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println("Caught exception.");
		}

		System.out.println("After try-catch blocks.");
	}
}