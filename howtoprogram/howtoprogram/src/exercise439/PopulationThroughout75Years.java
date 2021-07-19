package exercise439;

public class PopulationThroughout75Years {

	public static void main(String[] args) {
		double population = 7.794798739;
		double growthRate = 0.11;
		calculateWorldPopulation(population, growthRate);
	}

	public static void calculateWorldPopulation(double population, double growthRate) {
		System.out.println("*********************************************************");
		System.out.println("Year \t\t" + "Population\t\t" + "Numberial Increae");
		System.out.println("*********************************************************");
		int currentYear = 2020;
		double currentPopulation = Math.floor(population * 1000) / 1000;
		while (currentYear <= 2095) {
			if (currentYear == 2020) {
				System.out.println(currentYear + "\t\t" + currentPopulation + "\t\t\t" + 0);
				System.out.println("*********************************************************");
			} else {
				double newPopulation = Math.floor((currentPopulation + currentPopulation * growthRate)*1000)/1000;
				System.out.println(currentYear + "\t\t" + newPopulation + "\t\t\t" + Math.floor((newPopulation - currentPopulation)*1000)/1000);
				System.out.println("*********************************************************");
				currentPopulation = newPopulation;
			}
			currentYear++;
		}
	}
}
