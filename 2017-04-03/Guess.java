class Guess {
	public static void main(String args[]) 
	throws java.io.IOException {
		char ch;
		char letter = 'K';
		System.out.println("Guess a letter between A and Z: ");
		ch = (char) System.in.read();
		if (ch == letter) {
			System.out.println("Right!");
		}
		else {
			System.out.print("You're too ");
			if (ch > letter) {
				System.out.println("high!");
			}
			else {
				System.out.println("low!");
			}
		}
	}
}