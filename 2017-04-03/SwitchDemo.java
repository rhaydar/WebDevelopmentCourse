class SwitchDemo {
	public static void main(String[] args) {
		int i;
		for (i=0; i<10; i++) {
			switch(i) {
				case 0: 
					System.out.println("zero");
				case 1:
					System.out.println("one");
					break;
				case 2:
					System.out.println("two");
				case 3:
					System.out.println("three");
					break;
				case 4:
					System.out.println("four");
				default:
					System.out.println("greater than four");
					break;
			}
		}
	}
}