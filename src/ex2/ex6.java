package ex2;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a code");
		String input = in.next();
		
		char zero = input.charAt(0);
		char first = input.charAt(1);
		char sec = input.charAt(2);
		char third = input.charAt(3);
		char fourth = input.charAt(4);
		
		if(input.length()==5) {
			
			if(Character.isDigit(zero)&&Character.isDigit(first)) {
				
				if(Character.isLetter(sec)) {
					
					if(Character.isDigit(third)&&Character.isDigit(fourth)) {
						System.out.println(input+" has the correct format");
					}
					else {
						System.out.println("the fourth and fifth should be a digit");
					}
				}
				else {
					System.out.println("the third character should be alphabetic characters");
				}
			}
			else {
				System.out.println("the first two character should be a digit");
			}
		}
		else {
			System.out.println("the length is wrong");
		}
	}

}
