package main;

import java.util.Scanner;

public class Converter {

	// Want to create user input

	private static Scanner sc = new Scanner(System.in);

	// Allow user to input choice
	// Create the variables needed to complete number conversions
	// give user ability to go back to previous menu
	// Continue the program until user decides to press quit

	public static void main(String[] args) {

		String tryAnother;
		int menuSelection = 0;
		int Quit = 4;
		int subOption;
		while (menuSelection != Quit) {

			System.out.println("Hello, please choose from the following by inputing one of the numbers 1-4:");
			System.out.println();
			System.out.println("1:Convert Volume Measurements");
			System.out.println("2:Convert Distance Measurments");
			System.out.println("3:Convert US Gallons To Imperial Gallons");
			System.out.println("4:Quit");
			System.out.println();
			System.out.println("Place your input here and click Enter: ");

			// Need user input
			menuSelection = sc.nextInt();

			// added a switch in to give user choices 1-4 from above
			switch (menuSelection) {
			case 1:// create a sub menu for volume

				do {
					System.out.println("What types of Conversions would you like to make?");
					System.out.println("1: Cups to teaspoons");
					System.out.println("2: Teaspoons to Cups");
					System.out.println("3: TeaSpoons to TableSpoons");
					System.out.println("4: Tablespoons to Ounces");
					System.out.println();
					System.out.println("5: Exit Program");

					subOption = sc.nextInt();
					switch (subOption) {
					case 1:
						System.out.println("How many cups do you wish to input");
						double cups = sc.nextDouble();
						double tsp = cups * 48;
						System.out.println("They're approx. " + tsp + " teaspoons in " + cups + " cups");
						break;
					case 2:
						System.out.println("How many teaspoons do you wish to input?");
						double tsp1 = sc.nextDouble();
						double cups1 = (tsp1 * 0.02083333);
						System.out.println("They're approx. " + cups1 + "cups in " + tsp1 + "  teaspoons");
						break;
					case 3:
						System.out.println("How many teaspoons do you wish to input?");
						double tsp2 = sc.nextInt();
						double tbs = tsp2 / 3;
						System.out.println("They're approx. " + tbs + " tablespoons in " + tsp2 + " teaspoons");
						break;
					case 4:
						System.out.println("How many tablespoons do you wish to input?");
						double tbs1 = sc.nextDouble();
						double oz = tbs1 / 2;
						System.out.println("They're approx. " + oz + " ounces in " + tbs1 + " tablespoons");
						break;
					case 5:
						System.out.println("Exiting Program");
						return;
					default:
						System.out.println("Invalid Entry, please input 1-4 for valid entry or 5 for main menu");
					}
					System.out.println("Would you like to try another volume conversion? (Y/N)");
					sc.nextLine();

					tryAnother = sc.nextLine();
					if (tryAnother.equals("N") || tryAnother.equals("n")) {
						break;
					}

				} while (subOption != 5);
				break;

			case 2:// create a sub menu for distance
				do {
					System.out.println("What types of Conversions would you like to do for Distance?");
					System.out.println("1:Miles to Kilometers");
					System.out.println("2:Kilometers to Miles");
					System.out.println("3:Feet to Yards");
					System.out.println("4:Feet to Meters");
					System.out.println();
					System.out.println("5:Exit Program");

					subOption = sc.nextInt();

					switch (subOption) {
					case 1:
						System.out.println("How many miles do you wish to input?");
						double mi = sc.nextDouble();
						double ki = mi * 1.609344;
						System.out.println("There are approx. " + ki + " Kilometers in " + mi + " miles");
						break;
					case 2:
						System.out.println("How many Kilometers do you wish to input?");
						double ki2 = sc.nextDouble();
						double mi2 = ki2 / 1.609344;
						System.out.println("They're approx. " + mi2 + " miles in " + ki2 + " Kilometers");
						break;
					case 3:
						System.out.println("How many feet do you wish to input");
						double ft = sc.nextDouble();
						double yrds = ft / 3;
						System.out.println("They're approx. " + yrds + " yards in " + ft + " feet");
						break;
					case 4:
						System.out.println("how many feet do you wish to input?");
						double ft2 = sc.nextDouble();
						double m = ft2 / 3.2808399;
						System.out.println("They're approx. " + m + " meters in " + ft2 + " feet");
						break;
					case 5:
						System.out.println("Exiting Program, system powering off!");
						return;
						
					default:
						System.out.println("Invalid Entry, please input 1-4 for valid entry or 5 to exit program");
					}
					System.out.println("Would you like to do another Distance Conversion? (Y/N)");
					sc.nextLine();

					tryAnother = sc.nextLine();
					if (tryAnother.equals("N") || tryAnother.equals("n")) {
						break;
					}
				} while (subOption != 5);
				break;
			case 3:
				System.out.println("How many US Gallons do you wish to convert?");
				double usg = sc.nextDouble();
				double img = usg * 0.83267;
				System.out.println("There are approx. " + img + " imperial gallons within " + usg + " US gallons");
				sc.nextLine();
				break;
			case 4:
				System.out.println("Thank you, system powering off!");
				return;
			default:
				System.out.println("Invalid Entry please choose from the previous options 1-4");
				break;
			}
			System.out.println("Would you like to choose another Conversion? (Y/N) ");
			
			tryAnother = sc.nextLine();

			if (tryAnother.equals("N") || tryAnother.equals("n")) {
				System.out.println("Thank you, system powering off!");
				return;
			}
		}

	}
}
