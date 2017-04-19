class MyClass {
	int x;

	MyClass(int i) {
		x = i;
	}
}

class ConsDemo {
	public static void main(String[] args) {
		MyClass t1 = new MyClass(12);
		MyClass t2 = new MyClass(24);

		System.out.println(t1.x + " " + t2.x);
		t2.x = 20;
		System.out.println(t1.x + " " + t2.x);
	}
}