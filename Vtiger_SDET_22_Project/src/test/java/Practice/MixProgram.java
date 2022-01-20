package Practice;

import java.util.LinkedHashSet;

import org.apache.batik.parser.LengthArrayProducer;

public class MixProgram {

	public static void main(String[] args) {
		String s="ApPlEL";
		int count=1; 
		String s1=s.toLowerCase();
		
		
		char[] ch=s1.toCharArray();
		
	for(int i=0;i<ch.length-1;i++)  //index 0 to string length-1 index
	{
		if(s1.charAt(i)!=s1.charAt(i+1))
		{
			System.out.println(count+"-->"+s1.charAt(i));
			count=1;
		}
		else {
			count++;
			if(s1.charAt(i)!=s1.charAt(i+1))
			{
				System.out.println(count+"-->"+s1.charAt(i));
			}
			
		}
			
	}
	
	System.out.print("-->");
    String str="";
	for(int i=0;i<ch.length-1;i++) 
	{
		if(s1.charAt(i)!=s1.charAt(i+1))
		{
			count=1;
		}
		else {
			count++;
		}
		if(count==1) 
		{
			str = str+s1.charAt(i);	
		}	
	}
	
	//reverse string
	System.out.print(str);
	System.out.print("-->");
	for(int i=str.length()-1;i>=0;i--) 
	{
		System.out.print(str.charAt(i));
	}

}
	
	

}
