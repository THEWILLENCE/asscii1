package willence.asciiart;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int data, sum;
		sum = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("What is 42 = x + 30?");
			data = input.nextInt();
			sum += data;
		} while (data != 12);
		System.out.println("The sum is " + sum);
	}

}
