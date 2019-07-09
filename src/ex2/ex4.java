package ex2;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an age");
		int input = in.nextInt();
		
		if(input<0) {
			
		}
		else if (input<18) {
			System.out.println("The user is too young");
		}
		else if (input>=18&&input<=50) {
			System.out.println("The user may proceed");
		}
		else if(input>50) {
			System.out.println("The user is too old");
		}
	}

}
