package exercise531;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int length = Questions.values().length;
		int index = 1;
		Scanner scanner = new Scanner(System.in);
		Questions questions = null;
		int result = 0;
		
		while (index <= 5) {
			int answer = 0;
			System.out.println("------------------------------");
			questions = selectQuestion(index);
			System.out.println(questions.getQuestionName());
			printAnswers(questions);
			System.out.print("=> ");
			answer = scanner.nextInt();
			if(checkResult(questions, answer)) {
				result++;
			}
			index++;
		}
		
		printResult(result);
	}
	
	public static void printResult(int result) {
		switch(result) {
		case 1: 
			System.out.println("Time to brush up on your knowledge of global warming");
			break;
		case 2: 
			System.out.println("Time to brush up on your knowledge of global warming");
			break;
		case 3: 
			System.out.println("Time to brush up on your knowledge of global warming");
			break;
		case 4: 
			System.out.println("Very good");
			break;
		case 5: 
			System.out.println("Exellent");
			break;
		}
		
	}
	
	public static boolean checkResult(Questions q, int answer) {
		return q.getCorrectAnwsers() == answer;
	}
	
	public static void printAnswers(Questions q) {
		int length = q.getAnwsers().length;
		int index = 0;
		while(index < length) {
			System.out.println(index + " _ " + q.getAnwsers()[index]);
			index ++;
		}
	}

	public static Questions selectQuestion(int index) {
		Questions question = null;
		switch (index) {
		case 1:
			question = Questions.Q1;
			break;
		case 2:
			question = Questions.Q2;
			break;
		case 3:
			question = Questions.Q3;
			break;
		case 4:
			question = Questions.Q4;
			break;
		case 5:
			question = Questions.Q5;
			break;
		}
		return question;
	}
}
