
public class SpeedConverter {
	
	public static void main(String[] args) {
//		System.out.println(toMilesPerHour(1.5));
//		toMilesPerHour(10.25);
//		toMilesPerHour(-5.6);
//		toMilesPerHour(22.42);
//		toMilesPerHour(75.114);
		
		printConversion(10.5);
		
	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			return -1;
		} else {
			return Math.round(kilometersPerHour / 1.609);
		}
	}
	
	public static void printConversion(double killometersPerHour) {
		if ( killometersPerHour < 0) { 
			System.out.println("Invalid Value");
		} else {
			System.out.println(killometersPerHour + " km/h = " + toMilesPerHour(killometersPerHour) + " mi/h");
		}
	}
	
	
}
