package MakeChange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		menu();

	}

	public static void changeCalc(double cost, double tender) {
		double changeDue = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int dollar = 0;
		int quarter = 0;
		int dime = 0;
		int nickle = 0;
		int penny = 0;
		if (tender == cost) {
			System.out.println("Thank you for your purchase.");
		} else if (tender > cost) {
			changeDue = tender - cost;
			String change = String.format("%.2f", changeDue);
			System.out.println("Your change is: " + change);

			while (changeDue >= 20) {
				twenty++;
				changeDue -= 20;
			}
			if (twenty > 0) {
				System.out.print(twenty + " twenty(s) ");
			}
			while (changeDue >= 10) {
				ten++;
				changeDue -= 10;
			}
			if (ten > 0) {
				System.out.print(ten + " ten(s) ");
			}
			while (changeDue >= 5) {
				five++;
				changeDue -= 5;
			}
			if (five > 0) {
				System.out.print(five + " five(s) ");
			}
			while (changeDue >= 1) {
				dollar++;
				changeDue -= 1;
			}
			if (dollar > 0) {
				System.out.print(dollar + " dollar(s) ");
			}
			while (changeDue >= .25) {
				quarter++;
				changeDue -= .25;
			}
			if (quarter > 0) {
				System.out.print(quarter + " quarter(s) ");
			}
			while (changeDue >= .10) {
				dime++;
				changeDue -= .10;
			}
			if (dime > 0) {
				System.out.print(dime + " dime(s) ");
			}
			while (changeDue >= .049) {
				nickle++;
				changeDue -= .05;
			}
			if (nickle > 0) {
				System.out.print(nickle + " nickle(s) ");
			}
			while (changeDue >= .009) {
				penny++;
				changeDue -= .01;
			}
			if (penny > 0) {
				System.out.print(penny + " pennie(s) ");
			}

		} else {
			System.out.println("Please provide correct amount.");
		}


	}

	public static void menu() {
		System.out.println("What would you like to do?");
		System.out.println("1. Run cash register.");
		System.out.println("0. Exit the program.");
		Scanner kb = new Scanner(System.in);
		int action = kb.nextInt();

		while (action != 0) {

			if (action == 1) {

				System.out.println("What is the price of the item? ");
				double cost = kb.nextDouble();
				System.out.println("Amount of money received? ");
				double tender = kb.nextDouble();
				changeCalc(cost, tender);

				System.out.println("\n\n" + "What would you like to do?");
				System.out.println("1. Run cash register.");
				System.out.println("0. Exit the program.");
				action = kb.nextInt();
			}
			else{
				System.out.println("Please select a valid option.");
				System.out.println("\nl\nl" + "What would you like to do?");
				System.out.println("1. Run cash register.");
				System.out.println("0. Exit the program.");
				action = kb.nextInt();
			}
		}
		System.out.println("Thank you for shopping with us today.");
	}
}
