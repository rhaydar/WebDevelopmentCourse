class Sound {
	static double speed = 1100;

	public static void main(String args[]) {
		double seconds = 10;
		System.out.println("The lightening strike was " 
							+ distance(seconds) 
							+ " feet away.");

		System.out.println("The mountain is " + echo(seconds) + " feet away.");
	}

	// distance = speed*time
	public static double distance(double time) {
		double dist = speed*time;
		double distInMi = dist/5280;
		return distInMi;
	}
	
	// distance = speed*time/2
	public static double echo(double time) {
		double dist = speed*time/2;
		return dist;
	}


}