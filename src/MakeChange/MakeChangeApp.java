package MakeChange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the price of the item? ");
		double cost = kb.nextDouble();
		System.out.println("Amount of money recieved? ");
		double tender = kb.nextDouble();
		System.out.println(15 % 9);
		changeCalc(cost, tender);

	}

	public static double changeCalc(double cost, double tender){
		if(tender < cost){
			System.out.println("Please provide correct amount.");
		}else if(tender == cost){
			System.out.println("Thank you for your purchase.");
		}else if(tender > cost) {
			double changeDue = tender - cost;
			return changeDue;
		}
		return cost;

	}
}
