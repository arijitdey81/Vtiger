package Practice;

import java.util.Scanner;

public class ReverseStringWithUsing3rdVariable {

	public static void main(String[] args) {
		System.out.println("Enter the String you want to reverse:- ");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
