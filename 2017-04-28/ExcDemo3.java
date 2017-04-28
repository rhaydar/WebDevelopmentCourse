class ExcDemo3 {
	public static void main(String[] args) {
		int numerators[] = {7,42,69,99,5,12,21,10};
		int denominators[] = {7,2,0,4,0,0};

		for (int i=0; i<numerators.length; i++) {	
			try {
				System.out.println(numerators[i]/denominators[i]);
			}
			catch(ArithmeticException e) {
				System.out.println("Division by zero!");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Index out-of-bounds!");
			}
		}

		System.out.println("After for-loop.");
	}
}