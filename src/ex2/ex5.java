package ex2;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the first integer");
		int input1 = in.nextInt();
		System.out.println("Please enter the second integer");
		int input2 = in.nextInt();
		System.out.println("Please enter the third integer");
		int input3 = in.nextInt();
		
		if(input1>input2&&input1>input3) {
			System.out.println(input1);
		}
		else if (input2>input1&&input2>input3) {
			System.out.println(input2);
		}
		else if (input3>input1&&input3>input2) {
			System.out.println(input3);
		}
		
	}

}
