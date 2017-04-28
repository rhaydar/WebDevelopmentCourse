// Custom exception class
class NonIntResultException extends Exception {
	int n, d;

	NonIntResultException(int x, int y) {
		n = x;
		d = y;
	}

	public String toString() {
		return "Result of " + n + "/" + d + " is non-integer";
	}
}

class CustomExceptDemo {
	public static void main(String[] args) {
		int nums[] = {4,8,15,32,64,127,256,512};
		int dens[] = {2,0,4,4,0,8};

		for (int i=0; i<nums.length; i++) {
			try {
				if (nums[i] % dens[i] != 0) {
					throw new NonIntResultException(nums[i], dens[i]);
				}
				System.out.println(nums[i] + "/" + dens[i] + " is " + nums[i]/dens[i]);
			}
			catch (ArithmeticException e) {
				System.out.println("Can't divide by zero!");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of bounds!");
			}
			catch (NonIntResultException e) {
				System.out.println(e.toString());
			}
		}
	}
}