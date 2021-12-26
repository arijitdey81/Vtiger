package Practice;

public class Prime {

	public static void main(String[] args) {
		int n=11;
		int count=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
				
		}
		
		if(count!=0) 
		{
			System.out.println(n+"-->Not a prime number");
		}
		else
		{
			System.out.println(n+"-->Prime number");
		}

	}

}
