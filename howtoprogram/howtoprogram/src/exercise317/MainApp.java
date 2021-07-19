package exercise317;


public class MainApp {

	public static void main(String[] args) {
		HeathProfile heathProfile = new HeathProfile("John", "Adam", 20, 3, 1988, 130, 50);
		printheathProfile(heathProfile);
	}

	private static void printheathProfile(HeathProfile heathProfile) {
		System.out.println("\t\t" + heathProfile.getLastName() + " " + heathProfile.getFirstName());
		System.out.println("======================================");
		System.out.println("\t\tAge: " + heathProfile.getAge());
		System.out
				.println("\tBirthday: " + heathProfile.getDay() + "/" + heathProfile.getMonth() + "/" + heathProfile.getYear());
		System.out.println("======================================");
		System.out.println("Maximum heart rate: " + heathProfile.getMaximumHeartRate());
		int[] range = heathProfile.getTargetHeartRateRange();
		System.out.println("Target heart rate: [" + range[0] + "," + range[1] + "]");
		System.out.println("======================================");
		System.out.println("BMI: "+ Math.floor(heathProfile.getBMI()*1000)/1000);
	}
}
