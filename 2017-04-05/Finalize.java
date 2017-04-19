class FDemo {
	int x;

	FDemo(int i) {
		x = i;
	}

	// finalize method
	protected void finalize() {
		System.out.println(x);
	}

	// generator method, creates and loses reference of a new FDemo object
	void generator(int i) {
		FDemo o = new FDemo(i);
	}
}

class Finalize {
	public static void main(String[] args) {
		FDemo fobj = new FDemo(0);

		int count;
		for (count = 1; count <= 1_000_000; count++) {
			fobj.generator(count);
		}
	}
}