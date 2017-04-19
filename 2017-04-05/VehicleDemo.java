class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;

	Vehicle(int pass, int fc, int m) {
		passengers = pass;
		fuelcap = fc;
		mpg = m;
	}
	
	int range() {
		return fuelcap*mpg;
	}
}

class VehicleDemo {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);

		// // set the fields of the minivan Vehicle object
		// minivan.passengers = 7;
		// minivan.fuelcap = 16;
		// minivan.mpg = 21;
		

		// // set the fields of the sportscar Vehicle object
		// sportscar.passengers = 2;
		// sportscar.fuelcap = 14;
		// sportscar.mpg = 12;

		// range1 = minivan.fuelcap*minivan.mpg;
		// range2 = sportscar.fuelcap*sportscar.mpg;

		System.out.println("Minivan can carry " + minivan.passengers
						   + " with a range of " + minivan.range());
		System.out.println("Sportcar can carry " + sportscar.passengers
						   + " with a range of " + sportscar.range());

	}
}