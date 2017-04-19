class MyClass {
	private int alpha;
	public int beta;
	int gamma;

	void setAlpha(int x) {
		alpha = x;
	}

	int getAlpha() {
		return alpha;
	}
}

class AccessDemo {
	public static void main(String args[]) {
		MyClass ob = new MyClass();

		System.out.println("ob.alpha: " + ob.getAlpha());
		ob.setAlpha(20);
		System.out.println("ob.alpha: " + ob.getAlpha());

		ob.beta = 40;
		ob.gamma = 80;

		System.out.println("ob.beta: " + ob.beta);
		System.out.println("ob.gamma: " + ob.gamma);

	}
}