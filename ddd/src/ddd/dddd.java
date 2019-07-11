package ddd;

import java.util.Random;
import java.util.Scanner;

public class dddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Rolling the dice...");
		
		Random ran = new Random();
		int a = 0;
		for(int i = 0;i < 2;i++) {
			int rana = ran.nextInt(6);
			System.out.println(1+ rana);
			a += 1+rana;
		}
		System.out.println("Total value:" + a);
		
		System.out.println("What is your name? ");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello," + scan.nextLine() + "!");
	}

}
