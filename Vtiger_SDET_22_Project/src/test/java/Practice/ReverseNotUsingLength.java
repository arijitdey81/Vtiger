package Practice;

import java.util.Scanner;

public class ReverseNotUsingLength {

	public static void main(String[] args) {
		System.out.println("Enter the String:-");
		Scanner sc=new Scanner(System.in);
		String strInput = sc.nextLine();
		
		StringBuilder input=new StringBuilder();
		
		input.append(strInput);
		
		input.reverse();
		
		System.out.println(input);
		
		

	}

}
