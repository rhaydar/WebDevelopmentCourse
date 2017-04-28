class ExcTest {
	static void genException() {
		int nums[] = new int[4];

		System.out.println("Before exception is generated.");

		nums[6] = 8;
		System.out.println("hello");
	}
}

class UseThrowableMethods {
	public static void main(String[] args) {
		try {
			ExcTest.genException();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("Standard message is: ");
			System.out.println(e);
			System.out.println("\nStack trace: ");
			e.printStackTrace();
		}

		System.out.println("After try-catch blocks.");
	}
}