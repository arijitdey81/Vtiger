package Practice;

public class PalindromeGivenStringArray {

	public static void main(String[] args) {
		
		String a[]= {"radar","pop","arijit","mobile","wow"};
		for(int i=0;i<a.length;i++)
		{
			String s=a[i];
			String rev="";
			
			for(int j=s.length()-1;j>=0;j--)
			{
				rev=rev+s.charAt(j);
			}
			if(s.equals(rev))
			{
				System.out.println(s+"-->Palindrom String");
			}
			else
			{
				System.out.println(s+"-->Not Palindrome");
			}
			
		}
		

	}

}
