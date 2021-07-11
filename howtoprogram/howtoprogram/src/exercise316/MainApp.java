package exercise316;

public class MainApp {

	public static void main(String[] args) {
		HeartRate heartRate = new HeartRate("John", "Adam", 20, 3, 1988);

		printHeartRate(heartRate);
	}

	private static void printHeartRate(HeartRate heartRate) {
		System.out.println("\t\t" + heartRate.getLastName() + " " + heartRate.getFirstName());
		System.out.println("======================================");
		System.out.println("\t\tAge: " + heartRate.getAge());
		System.out
				.println("\tBirthday: " + heartRate.getDay() + "/" + heartRate.getMonth() + "/" + heartRate.getYear());
		System.out.println("======================================");
		System.out.println("Maximum heart rate: " + heartRate.getMaximumHeartRate());
		int[] range = heartRate.getTargetHeartRateRange();
		System.out.println("Target heart rate: [" + range[0] + "," + range[1] + "]");
	}

}
