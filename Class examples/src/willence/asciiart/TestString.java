package willence.asciiart;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		
		String message = "Welcome to Java";
		String message2 = "java is fun";
		System.out.println(message.length());
		System.out.println("Welcome to Java".length());
		
		
		
		
		int x=message.compareTo(message2);
		System.out.println(x);
		boolean y = message.contains("wel");
		System.out.println(y);
	}

}
