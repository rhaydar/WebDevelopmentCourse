/* Create classes called Reverse and ReverseDemo
Reverse:
	1) reverseR(): Write a recursive method that reverses a string
	2) reverseI(): Write iterative (loop) method that reverses a string

ReverseDemo:
	main method:
		Test out both of the methods of Reverse and make sure you get 
		the same output.
*/


// String s = "hello";
// s.charAt(0); // 'c'
// s.charAt(s.length()-1); // 'o'

// s.substring(0,2); // "he"


class Reverse {
	public String reverseR(String str) {
		return reverseR2(str, str.length());
	}

	private String reverseR2(String str, int n) {
		String result = str.substring(n-1, n);
		if (n == 1) {
			return str.substring(0,1);
		}
		result += reverseR2(str, n-1);
		return result;
	}

	public String reverseI(String str) {
		char c[] = new char[str.length()];
		// char temp;
		// for (int i=0, j=str.length()-1; i<j; i++, j--) {
		// 	temp = c[i];
		// 	c[i] = c[j];
		// 	c[j] = temp;
		// }
		int j = 0;
		for (int i=str.length()-1; i >= 0; i--) {
			c[j] = str.charAt(i);
			j++;
		}

		return new String(c);
	}
}

class ReverseDemo {
	public static void main(String[] args) {
		Reverse ob = new Reverse();
		String s = "boa";
		// System.out.println(ob.reverseR(s));
		System.out.println(s.substring(1));
	}
}
