package ex4;

import java.util.Scanner;

public class ex1 {
	
	public static boolean isEven(int value) {
		if(value%2 == 1)
			return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		System.out.println("Please enter an integer");
		input=scanner.nextInt();
		if(isEven(input)) {
			System.out.println(input + " is even");
		}
		else {
			System.out.println(input+ " is odd");
		}
	}
}
