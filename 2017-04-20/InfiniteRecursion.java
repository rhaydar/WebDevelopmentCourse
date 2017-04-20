class InfiniteRecursion {
	public static void main(String[] args) {
		recur(0);
	}

	public static void recur(int n) {
		// System.out.println(n);
		recur(n);
	}
}