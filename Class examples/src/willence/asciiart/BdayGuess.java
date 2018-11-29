package willence.asciiart;

import java.util.Scanner;

public class BdayGuess {

	public static void main(String[] args) {
		//set up scanner
		Scanner input = new Scanner(System.in);
		
		//Binary numbers
		final int num128 = 128;
		final int num64 = 64;
		final int num32 = 32;
		final int num16 = 16;
		final int num8 = 8;
		final int num4 = 4;
		final int num2 = 2;
		final int num1 = 1;
		
		//sets of numbers
		String set1 = "";
		String set2 = "";
		String set3 = "";
		String set4 = "";
		String set5 = "";
		
		//input number
		int inputnum;
		inputnum = 0;
		
		//Conversion placeholder
		int whatsleft;
		
		
		
		for(int i=0 ;i<31;i++) {
			String biannum = "";
			inputnum = inputnum + 1;
			
			
			//Initialize what's left
			whatsleft = inputnum;
			
			//creating binary number in string format
			if (inputnum >= num128) {
				whatsleft = inputnum - num128;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsleft >= num64) {
				whatsleft = whatsleft - num64;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsleft >= num32) {
				whatsleft = whatsleft - num32;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsleft >= num16) {
				whatsleft =whatsleft - num16;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsleft >= num8) {
				whatsleft =whatsleft - num8;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsleft >= num4) {
				whatsleft = whatsleft - num4;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsleft >= num2) {
				whatsleft = whatsleft - num2;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsleft >= num1) {
				whatsleft = whatsleft - num1;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			
			//display
			System.out.println("the binary number for "+inputnum+ " is "+biannum);
			
			// check indexing of binary number
			char xnum7 = biannum.charAt(7);
			char xnum6 = biannum.charAt(6);
			char xnum5 = biannum.charAt(5);
			char xnum4 = biannum.charAt(4);
			char xnum3 = biannum.charAt(3);
			
			//assign to sets
			if (xnum7 == '1') {
				set1=set1+inputnum;
			}
			if (xnum6 == '1') {
				set2=set2+inputnum;
			}
			if (xnum5 == '1') {
				set3=set3+inputnum;
			}
			if (xnum4 == '1') {
				set4=set4+inputnum;
			}
			if (xnum3 == '1') {
				set5=set5+inputnum;
			}
			//display
			System.out.println("set1 is: "+set1);
			System.out.println("set2 is: "+set2);
			System.out.println("set3 is: "+set3);
			System.out.println("set4 is: "+set4);
			System.out.println("set5 is: "+set5);
			
			
		}
		

	}

}
