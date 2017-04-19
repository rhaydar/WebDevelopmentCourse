// class Test {
	
// }

class CallByValue {
	public static void main(String[] args) {
		// Test ob = new Test();
		int a=15, b = 20;
		System.out.println("a and b before noChange(): " + a + " " + b);
		noChange(a,b);
		System.out.println("a and b after noChange(): " + a + " " + b);
	}

	public static void noChange(int i, int j) {
		i = i+j;
		j = -j;
	}
}