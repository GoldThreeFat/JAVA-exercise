package ex1;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);){
		System.out.println("please enter an integer");
		int a=in.nextInt();
		System.out.println("please enter another integer");
		int b = in.nextInt();
		
		int sum = a+b;
		System.out.println("the sum is: " + sum);
		System.out.println("the product is: "+ a*b);
		}
	}

}
