package ex2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please enter an integer");
		int input = in.nextInt();
		
		if(input%2==1) {
			System.out.println(input+" is odd");
		}
		else {
			System.out.println(input+" is even");
		}
	}

}
