class GalToLit {
	public static void main(String args[]) {
		double gallons = 15;
		System.out.println(gallons + " gallons is " + galToLit(gallons) + " liters.");
	}

	public static double galToLit(double gallons) {
		return gallons * 3.78541;
	}
}