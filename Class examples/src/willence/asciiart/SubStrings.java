package willence.asciiart;

import java.util.Scanner;

public class SubStrings {

	public static void main(String[] args) {

		String message = "Welcome to Java";
		
		System.out.println(message);
		System.out.println(message.indexOf("J"));
		System.out.println(message.indexOf("a",13));
		System.out.println(message.indexOf("to"));
		System.out.println(message.lastIndexOf("to"));
		
		String name = "";
		Scanner input = new Scanner(System.in);
		System.out.println("enter your first and last name");
		name = input.nextLine();
		int space = name.indexOf(" ");
		
		String firstName = name.substring(0,space); 
				
		String lastName = name.substring(space+1);
		System.out.println(firstName);
		System.out.println(lastName);
	}

}
