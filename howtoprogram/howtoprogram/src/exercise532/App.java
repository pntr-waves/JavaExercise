package exercise532;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int length = asset.values().length;
		int index = 0;
		int totalExpense = 0;
		
		while(index < length) {
			System.out.println("Enter expense");
			System.out.println("Expense of " + asset.values()[index].getTitle());
			System.out.print("=> ($) ");
			totalExpense += scanner.nextInt();
			index++;
		}
		
		System.out.println("Tax income => " + totalExpense*0.3);
		
	}

}
