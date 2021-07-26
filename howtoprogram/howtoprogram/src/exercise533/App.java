package exercise533;

public class App {

	public static void main(String[] args) {
		double amoutUsers = 1.0;
		double rateGrowth = 0.04;
		int month15 = 0;
		int month20 = 0;
		System.out.println("User of FB growth to 1.5 billion users in " + month15 + " month");
		System.out.println("User of FB growth to 2.0 billion users in " + month20 + " month");
		
		
		while(amoutUsers <= 2.0) {
			amoutUsers = amoutUsers + amoutUsers * rateGrowth;
			System.out.println(amoutUsers);
			if(amoutUsers <= 1.5) {
				month15++;				
			}
			month20++;
		}
		
		
		System.out.println("User of FB growth to 1.5 billion users in " + month15 + " month");
		System.out.println("User of FB growth to 2.0 billion users in " + month20 + " month");
	}

}
