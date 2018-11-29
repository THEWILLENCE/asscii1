package willence.asciiart;

import java.util.Scanner;

public class StringStuff {

	public static void main(String[] args) {
		
		char char1 = '\u0031';
		char char2 = '\u0032';
		char char3 = '\u0034';
		char char4 = '\u0036';
		char char5 = '\u0038';
		char char6 = '\u0039';
		char char7 = '\u0037';
		char char8 = '\u0031';
		char char9 = '\u0035';
		char char10 = '\u0030';
		
		System.out.println(char1 + "" + char2 + "" + "" + char3 + "" + char4+ "" + char5 + "" + char6 + "" + 
				"" + char7 + "" + char8+ "" + char9 + "" + char10);
		 
		
		char A = '\u0041';
		char C = '\u0043';
		char E = '\u0045';
		char H = '\u0048';
		char I = '\u0049';
		char M = '\u004D';
		char O = '\u004F';
		char S = '\u0053';
		char T = '\u0054';
		char U = '\u0055';
		
		System.out.println(I+ " " +H+A+T+E+ " " +T+H+I+S+ " " +S+O+ " " +M+U+C+H);
		
		char ch = 'a';
		/*
		if (ch >=  '\u0041' && ch >= '\u005A'); {
			System.out.println(ch +" is an uppercase letter");
			
		}
		else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch +" is a lowercase letter");
		}
		else {
			System.out.println("unknown");
		}
		*/
		Scanner input = new Scanner(System.in);
		char x = input.next().charAt(0);
		System.out.println("isDigit('a') is " + Character.isDigit('a'));
		System.out.println("isLetter('a') is " + Character.isLetter('a'));
		
		
		
		
	}

}
