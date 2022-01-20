package Practice;

import java.util.LinkedHashSet;

public class StringSummation {

	public static void main(String[] args) {
		int sum=0;
		String s="12312345456";
	//char[] s1 = s.toCharArray();
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for(Character ch:set)
	{
	int	a=ch-48;
	sum=sum+a;
	}
System.out.println(sum);
	}
	

}
