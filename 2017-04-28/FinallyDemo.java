class Finally {
	public static void genException(int what) {
		int t;
		int nums[] = new int[2];

		System.out.println("Receiving " + what);
		try {
			switch (what) {
				case 0:
					t = 10/what; //generate a div-by-zero error
					break;
				case 1:
					nums[5] = 7; //generate a index out of bounds error
					break;
				default:
					return;
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero!");
			return;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of bounds!");
		}
		finally {
			System.out.println("Leaving try/catch blocks.");
		}
	}
}

class FinallyDemo {
	public static void main(String[] args) {
		for (int i=0; i<3; i++) {
			Finally.genException(i);
			System.out.println();
		}
	}
}