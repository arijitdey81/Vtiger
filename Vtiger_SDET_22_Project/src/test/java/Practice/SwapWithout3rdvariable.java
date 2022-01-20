package Practice;

import java.util.Scanner;

public class SwapWithout3rdvariable {

	public static void main(String[] args) {
		System.out.println("Enter the two no:");
		Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				int b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
