package ex2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter first integer");
		int firstInt = in.nextInt();
		System.out.println("Please enter second integer");
		int secInt = in.nextInt();
		
		if(firstInt*secInt<=100) {
			System.out.println("The product of two integer is less than 100");
		}
	}

}
