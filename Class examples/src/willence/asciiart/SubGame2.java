package willence.asciiart;
/*
 * Will Ence
 * 11/27/18
 * timed subtraction game
 */

import java.util.Scanner;

public class SubGame2 {

	public static void main(String[] args) {
		final int NUMBER_OF_QUESTIONS=5;
		int correctCount = 0;
		int count = 0;
		String output = " ";
		long startTime = System.currentTimeMillis();
		
		Scanner input = new Scanner(System.in);
		
		while (count < NUMBER_OF_QUESTIONS) {
			// 1. Generate two random single-digit numbers
			int number1 = (int)(Math.random() * 100);
			int number2 = (int)(Math.random() * 100);
			// 2. If number1 < number2, swap number1 with number2
			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			// 3. Prompt the student to answer "What is number1 - number2?"
			System.out.println("What is " + number1 + "-" + number2 + "?");
			int answer = input.nextInt();
			// 4. Grade the answer and display the result
			if (number1 - number2 == answer) {
				System.out.println("You are correct!");
				correctCount ++;
			}
			else {
				System.out.println("Your answer is wrong.\n" + number1 + " - " 
						+ number2 + " should be " + (number1 - number2));
			}
			// Increase the question count
			count++;
			output += "\n" + number1 + "-" + number2 + "=" + answer +
					((number1 - number2 ==answer) ? " correct" : " wrong");
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime- startTime;
		System.out.println("Correct count is " + correctCount + "\nTest time " + 
				testTime / 1000 + " seconds\n" + output);
		
		
		
	}

}
