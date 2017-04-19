class Block {
	int width, length, height;
	int volume;

	Block(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
		volume = w*l*h;
	}

	// check if passed object has same dimensions as this object
	public boolean sameBlock(Block object) {
		if ((object.width == this.width) 
			&& (object.length == this.length)
			&& (object.height == this.height)) {
			return true;
		}
		else {
			return false;
		}
	}

	// check if passed object's volume is same as this object
	public boolean sameVolume(Block object) {
		if (object.volume == volume) {
			return true;
		}
		else {
			return false;
		}
	}
}

class PassOb {
	public static void main(String[] args) {
		Block ob1 = new Block(10,2,5);
		Block ob2 = new Block(10,2,5);
		Block ob3 = new Block(4,5,5);

		// System.out.println("ob1 same dimension as ob2? " 
		// 			+ ob1.sameBlock(ob2));
		// System.out.println("ob1 same dimension as ob3? " 
		// 			+ ob1.sameBlock(ob3));
		// System.out.println("ob2 same dimension as ob3? " 
		// 			+ ob2.sameBlock(ob3));

		System.out.println("ob1 has same volume as ob2? "
					+ ob1.sameVolume(ob2));
		System.out.println("ob1 has same volume as ob3? "
					+ ob1.sameVolume(ob3));
	}
}