package Practice;


import java.util.LinkedHashSet;


public class OccuranceStringUsingCollection {

	public static void main(String[] args) {
		String str = "ApPlEL";
		str=str.toLowerCase();
		
		
		LinkedHashSet<Character> linkSet=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			linkSet.add(str.charAt(i));
		}
		
		for( Character ch:linkSet)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(ch==str.charAt(i))
				{
					count++;
				}
			}
			
			System.out.println(count+"-->"+ch);
		}
		
		System.out.print("-->");
		int count=1;
		String s="";
		char[] ch1=str.toCharArray();
		for(int i=0;i<ch1.length-1;i++) 
		{
			if(str.charAt(i)!=str.charAt(i+1))
			{
				count=1;
			}
			else {
				count++;
			}
			if(count==1) 
			{
				s = s+str.charAt(i);	
			}	
		}
		System.out.print(s);
		System.out.print("-->");
		for(int i=s.length()-1;i>=0;i--) 
		{
			System.out.print(s.charAt(i));
		}
		
		
	}
}
