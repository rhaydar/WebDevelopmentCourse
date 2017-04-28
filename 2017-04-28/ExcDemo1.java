class ExcDemo1 {
	public static void main(String[] args) {
		int nums[] = new int[4];

		try {
			System.out.println("Before exception is generated.\n");

			//generate an exception
			nums[6] = 8;

			System.out.println("hello");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out-of-bounds!");
		}

		System.out.println("After try-catch ladder.");
	}
}