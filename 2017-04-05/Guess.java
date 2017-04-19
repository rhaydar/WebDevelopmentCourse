class Guess {
	public static void main(String[] args) 
	throws java.io.IOException {
		System.out.println("Guess an uppercase letter");
		char ch;
		char ignore; 
		
		do {
			ch = (char) System.in.read();
			if (ch == 'K') {
				System.out.println("**Right**");
			}
			else {
				if (ch < 'K') {
					System.out.println("...Sorry, you're too low");
				}
				else {
					System.out.println("...Sorry, you're too high");
				}
			}

			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
		}
		while (ch != 'K');
		
	}
}