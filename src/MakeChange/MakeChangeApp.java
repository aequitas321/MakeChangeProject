package MakeChange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the price of the item? ");
		double cost = kb.nextDouble();
		System.out.println("Amount of money recieved? ");
		double tender = kb.nextDouble();
		System.out.println(changeCalc(cost, tender));

	}

	public static String changeCalc(double cost, double tender){
		double changeDue = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int dollar = 0;
		int quater = 0;
		int dime = 0;
		int nickle = 0;
		int penny = 0;
		if(tender < cost){
			System.out.println("Please provide correct amount.");
		}else if(tender == cost){
			System.out.println("Thank you for your purchase.");
		}else if(tender > cost) {
			 changeDue = tender - cost;
			while(changeDue >= 20 ){
				twenty++;
				changeDue -= 20;
			}
			while(changeDue >= 10){
				ten++;
				changeDue -= 10;
			}
			while(changeDue >= 5){
				five++;
				changeDue -= 5;
			}
			while(changeDue >= 1){
				dollar++;
				changeDue -= 1;
			}
			while(changeDue >= .25){
				quater++;
				changeDue -= .25;
			}
			while(changeDue >= .10){
				dime++;
				changeDue -= .10;
			}
			while(changeDue >= .05){
				nickle++;
				changeDue -= .05;
			}
			while(changeDue >= .01){
				penny++;
				changeDue -= .01;
			}
		}
		return "Your change is " + twenty + " twenties, " + ten + " tens, " + five + " fives, " + dollar + " ones, " +
				quater + " quaters, " + dime + " dimes, " + nickle + " nickles " + penny + " pennies.";

	}
}
