package willence.asciiart;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*int count = 101;
		while (count < 100) {
			System.out.println(count + " I will not be late to class");
			count++;
			
		}
		
		System.out.println("Your lone hero is surrounded by a massive army of trolls.");
		System.out.println("Their decaying bodies stretch out, melting into the horizon.");
		System.out.println("Your hero unsheathes his sword for the last fight of his life. \n");
		
		int health = 10;
		int trolls = 0;
		int damage = 3;
		
		while ( health >0) {
			trolls ++;
			health = health-damage;
			System.out.println("Your hero swings and defeats an evil troll but takes\n" + 
			damage + " damage points");
		}
		System.out.println("Your hero fought valiantly and defeated "+ trolls + " trolls");
		System.out.println("But alas, your hero is no more");
		
		int sum =0, i =1;
		while ( i<10) {
			sum = sum +i;
			i++;
		}
		System.out.println("sum is " + sum);
		*/
		int loop = 0;
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		//System.out.println("What is "+ number1 + " + " + number2 + "?");
		//int answer = input.nextInt();
		while (loop !=10) {
			System.out.println("What is "+ number1 + " + " + number2 + "?");
			int answer = input.nextInt();
			loop ++;
		}
		System.out.println("You got it!");
	}
	

}
