class Aa {
	int i;

	Aa(int b) {
		i = b;
	}
}

class Bb extends Aa {
	int j;

	Bb(int a, int b) {
		super(a);
		j = b;
	}

	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("j in subclass: " + j);
	}
}

class Cc extends Bb {
	int x;

	Cc(int a, int b, int c) {
		super(a,b);
		x = c;
	}

}

class UseSuper {
	public static void main(String[] args) {
		Bb subOb = new Bb(1,2);
		subOb.show();
		System.out.println(subOb.i);
	}
}