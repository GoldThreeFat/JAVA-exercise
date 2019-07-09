package ex2;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter three integers");
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int input3 = in.nextInt();
		
		if(input1+input2==input3) {
			System.out.println(input1+" and "+input2+" are a number bond of "+input3);
		}
		else {
			System.out.println("The first 2 integers are not equal to the third integer ");
		}
	}

}
