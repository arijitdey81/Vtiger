package Practice;

public class PalindromGivenArray {
	public static void main(String[] args) {
		int a[]= {282,121,968,764,358,456,323};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int sum=0;
			while(n>0)
			{
				int remainder=n%10;
				sum=sum*10+remainder;
				n=n/10;
				
			}
			if(sum==a[i])
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
