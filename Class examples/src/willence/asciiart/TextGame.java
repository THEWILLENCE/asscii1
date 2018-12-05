package willence.asciiart;
/*
 * Will Ence
 * 11/18
 */
import java.util.Scanner;

public class TextGame {

	public static void main(String[] args) {
		//import scanner
		Scanner input = new Scanner(System.in);
		//sentry variable and while loop
		int x =1;
		while (x==1) {
		//title screen
		System.out.println("#     # ####### #        #####  ####### #     # ####### \r\n" + 
				"#  #  # #       #       #     # #     # ##   ## #       \r\n" + 
				"#  #  # #       #       #       #     # # # # # #       \r\n" + 
				"#  #  # #####   #       #       #     # #  #  # #####   \r\n" + 
				"#  #  # #       #       #       #     # #     # #       \r\n" + 
				"#  #  # #       #       #     # #     # #     # #       \r\n" + 
				" ## ##  ####### #######  #####  ####### #     # ####### ");
		//press start
		System.out.println("Please press 'enter' to start");
		System.out.println("Enter a '1', '2' or '3' for your choices");
		//"start" variable
		String start = input.nextLine();
		//"answer" variable
		int answer = 0;
		//first choice
		System.out.println(" ___");
		System.out.println("(  O>");
		System.out.println("///\\");
		System.out.println("\\v_/_\n");
		System.out.println("Salutaions! I am Penguin!");
		System.out.println("What species are you?");
		System.out.println("Are you (1) human (2) penguin (3) demon");
		answer = input.nextInt();
		//first choice 1 consequence
		if (answer == 1) {
			answer = 0;
			System.out.println("Great! Let's get started!");
			//second choice
			System.out.println("What is your favorite food?");
			System.out.println("(1) pizza (2) cheeseburger (3) souls");
			answer=input.nextInt();
			//second choice 1 consequence
			if (answer == 1) {
				System.out.println(" ___");
				System.out.println("(  ^>");
				System.out.println("///\\");
				System.out.println("\\v_/_\n");
				System.out.println("Really? Me too!");
				System.out.println("I can tell we are going to be great friends!");
				answer = 0;
				//third choice
				System.out.println("Now which way would you like to go?");
				System.out.println("(1) forward (2) left (3) right");
				answer = input.nextInt();
				if (answer == 1) {
					//fourth choice
					System.out.println("*your bang your knee on a wodden sign*");
					System.out.println("(1) read it (2) do not read it (3) lick it");
					answer = 0;
					answer = input.nextInt();
					if (answer == 1) {
						System.out.println("*the sign said this:\n");
						System.out.println("" + 
								"######  #######    #     # ####### #######    ######  #######    #    ######  \r\n" + 
								"#     # #     #    ##    # #     #    #       #     # #         # #   #     # \r\n" + 
								"#     # #     #    # #   # #     #    #       #     # #        #   #  #     # \r\n" + 
								"#     # #     #    #  #  # #     #    #       ######  #####   #     # #     # \r\n" + 
								"#     # #     #    #   # # #     #    #       #   #   #       ####### #     # \r\n" + 
								"#     # #     #    #    ## #     #    #       #    #  #       #     # #     # \r\n" + 
								"######  #######    #     # #######    #       #     # ####### #     # ######  \r\n" + 
								"                                                                              \r\n" + 
								"####### #     # ###  #####      #####  ###  #####  #     # \r\n" + 
								"   #    #     #  #  #     #    #     #  #  #     # ##    # \r\n" + 
								"   #    #     #  #  #          #        #  #       # #   # \r\n" + 
								"   #    #######  #   #####      #####   #  #  #### #  #  # \r\n" + 
								"   #    #     #  #        #          #  #  #     # #   # # \r\n" + 
								"   #    #     #  #  #     #    #     #  #  #     # #    ## \r\n" + 
								"   #    #     # ###  #####      #####  ###  #####  #     # ");
						System.out.println(" ___");
						System.out.println("(  O>");
						System.out.println("///\\");
						System.out.println("\\v_/_\n");
						System.out.println("What an odd sign...");
						System.out.println("Wait, there is something else on it");
						System.out.println("*you have to strain your eyes to see it, "
								+ "but in very fine print it says: 'just kidding :-)>'");
						System.out.println("*suddenly the ground beneath you opens up where\r\n"
								+ " you are impaled by several sharp, wooden sticks and die*");
						System.out.println("GAME OVER");
						x = 0;
					}
					else if (answer == 2) {
						System.out.println("*suddenly the ground beneath you opens up where\r\n"
								+ " you are impaled by several sharp, wooden sticks and die*");
						System.out.println("GAME OVER");
						x = 0;
					}
					else if (answer == 3) {
						System.out.println(" ___");
						System.out.println("(  ->");
						System.out.println("///\\");
						System.out.println("\\v_/_\n");
						System.out.println("Ew, really? Gross...");
						System.out.println("*suddenly the ground beneath you opens up where\r\n"
								+ " you are impaled by several sharp, wooden sticks and die*");
						System.out.println("GAME OVER");
						x = 0;
					}
				}
				else if (answer == 2) {
					System.out.println("*you see a cyclist zoom pass you*\r\n");
					//fifth choice
					System.out.println("--------  __@");
					System.out.println("-----  _'\\<,_");
					System.out.println("----  (*)/  (*)");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~\n");
					System.out.println("(1) yell at him (2) wave (3) run after him");
					answer = 0;
					answer = input.nextInt();
					if (answer == 1) {
						System.out.println("*the cyclist quickly turned around and ran you over"
								+ "and then you died*");
						System.out.println("GAME OVER");
						x = 0;
					}
					else if (answer == 2) {
						answer = 0;
						System.out.println("*the cyclist waved back*");
						System.out.println(" ___");
						System.out.println("(  ^>");
						System.out.println("///\\");
						System.out.println("\\v_/_\n");
						System.out.println("What a nice cyclist!");
						//sixth choice
						System.out.println("*in front of you is a large, white orb*");
						System.out.println("Do you (1) pick up orb (2) lick it (3) make Penguin "
								+ "pick it up");
						answer = input.nextInt();
						if (answer == 1) {
							answer = 0;
							System.out.println("*the orb glows a brilliant yellow*");
							System.out.println(" ___");
							System.out.println("(  o>");
							System.out.println("///\\");
							System.out.println("\\v_/_\n");
							System.out.println("What's going on?");
							//seventh choice
							System.out.println("*the ground rumbles under your feet*");
							System.out.println("(1)put orb back (2)drop kick orb (3) do nothing");
							answer = input.nextInt();
							System.out.println("*light surrounds you on all sides and you hear a "
									+ "beautiful voice:*");
							System.out.println("Greetings human. I am Hollow, Queen of Light. Thank you for freeing "
									+ "me from my eternal prison.");
							System.out.println("*you see white tendrils wrapping you up*");
							System.out.println("*the tendrils start to burn your skin*");
							System.out.println("I will now impose my will on this pitiful realm");
							System.out.println("*you lived out the rest of your pitiful life"
									+ " as a pawn of Queen Holow*");
							System.out.println("GAME OVER");
							x = 0;
						}
						else if (answer == 2) {
							System.out.println("*the orb bured so hot, it disintegrated you"
									+ " and Penguin*");
							System.out.println("GAME OVER");
							x = 0;
						}
						else if (answer == 3) {
							System.out.println(" ___");
							System.out.println("(  ->");
							System.out.println("///\\");
							System.out.println("\\v_/_\n");
							System.out.println("Why me?");
							System.out.println("*as Penguin atempted to pick up the orb,"
									+ " he accidentily dropped it because he didn't have hands"
									+ " and it exploded. You and Penguin died*");
							System.out.println("GAME OVER");
							x = 0;
						}
					}
					else if (answer == 3) {
						System.out.println("*as you ran for the cyclist, he speed up so fast"
								+ " that he traveled through time; it sent a horrible blastn\n through"
								+ " the air and you died*");
						System.out.println("GAME OVER");
						x = 0;
					}
				}
				else if (answer == 3) {
					System.out.println("*you realize that there is a cliff there; but you "
							+ "realized to soon so you fell off and died*");
					System.out.println("GAME OVER");
					x = 0;
				}
				//second choice 2 consequence
			}
			else if (answer == 2) {
				System.out.println(" ___");
				System.out.println("(  ->");
				System.out.println("///\\");
				System.out.println("\\v_/_\n");
				System.out.println("Ew, really? Gross...");
				System.out.println("I don't think I will be able to eat with you if you like"
						+ " that...");
				System.out.println("*Penguin was disgusted by your choice in food so he left."
						+ " So... uh...*");
				System.out.println("GAME OVER?");
				x = 0;
			}
			//second choice 3 consequence
			else if (answer == 3) {
				System.out.println(" ___");
				System.out.println("(  o>");
				System.out.println("///\\");
				System.out.println("\\v_/_\n");
				//second (kind of) choice
				System.out.println("...uh...are you...uh...ok?");
				System.out.println("(1) yes (2) no (3) I WILL EAT YOUR SOUL");
				int demon = input.nextInt();
				
				if (demon == 1) {
					System.out.println(" ___");
					System.out.println("(  ^>");
					System.out.println("///\\");
					System.out.println("\\v_/_\n");
					System.out.println("Oh! Ok!");
					System.out.println("I thought you were a demon for a second there!");
					System.out.println("Jk, I'm not THAT stupid. I know you're a demon.");
					System.out.println("*you hear strange voices calling all around you*");
					System.out.println(" ___");
					System.out.println("(  0>");
					System.out.println("///\\");
					System.out.println("\\v_/_\n");
					System.out.println("YOU DO NOT BELONG IN THIS REALM");
					System.out.println("    #");
					System.out.println("    #");
					System.out.println("    #");
					System.out.println("#########");
					System.out.println("    #");
					System.out.println("    #");
					System.out.println("    #");
					System.out.println("    #");
					System.out.println("BEGONE FOUL BEAST");
					System.out.println("*you were banished to the underworld and burned for all eternity*");
					System.out.println("GAME OVER");
					x = 0;
				}
				else if (demon == 2) {
					System.out.println(" ___");
					System.out.println("(  ->");
					System.out.println("///\\");
					System.out.println("\\v_/_\n");
					System.out.println("Me neither my friend...me neither...");
					System.out.println("*you and the penguin both btoke down to tears and died"
							+ " of sadness");
					System.out.println("GAME OVER");
					x=0;
				}
				else if (answer == 3) {
					System.out.println("*you hear strange voices calling all around you*");
					System.out.println(" ___");
					System.out.println("(  0>");
					System.out.println("///\\");
					System.out.println("\\v_/_\n");
					System.out.println("YOU DO NOT BELONG IN THIS REALM");
					System.out.println("    #");
					System.out.println("    #");
					System.out.println("    #");
					System.out.println("#########");
					System.out.println("    #");
					System.out.println("    #");
					System.out.println("    #");
					System.out.println("    #");
					System.out.println("BEGONE FOUL BEAST");
					System.out.println("*you were banished to the underworld and burned for all eternity*");
					System.out.println("GAME OVER");
					x = 0;
				}
				
			}
			//first choice 2 consequence
		}
		else if (answer == 2) {
			System.out.println("Wait a moment...");
			System.out.println("My mother or was it father? Anyway they were a penguin too!");
			System.out.println("Are you...?");
			System.out.println("MY MOTHER/FATHER???\n");
			System.out.println("*you and your son...Penguin...lived happily ever after?*");
			System.out.println("GAME OVER");
			x = 0;
		}
		//first choice 3 consequence
		else if (answer == 3) {
			System.out.println("*you hear strange voices calling all around you*");
			System.out.println(" ___");
			System.out.println("(  0>");
			System.out.println("///\\");
			System.out.println("\\v_/_\n");
			System.out.println("YOU DO NOT BELONG IN THIS REALM");
			System.out.println("    #");
			System.out.println("    #");
			System.out.println("    #");
			System.out.println("#########");
			System.out.println("    #");
			System.out.println("    #");
			System.out.println("    #");
			System.out.println("    #");
			System.out.println("BEGONE FOUL BEAST");
			System.out.println("*you were banished to the underworld and burned for all eternity*");
			System.out.println("GAME OVER");
			x = 0;
		}
		}
	}

}
