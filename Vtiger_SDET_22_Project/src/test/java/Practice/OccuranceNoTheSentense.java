package Practice;

import java.util.LinkedHashSet;

public class OccuranceNoTheSentense {

	public static void main(String[] args) {
		
		String s="Welcome to JavaSelenium";
		String[] str=s.split(" ");
		
		LinkedHashSet<String> linkedSet=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++) {
			linkedSet.add(str[i]);
		}
		
		for(String word:linkedSet) {
			int count=0;
			for(int i=0;i<str.length;i++)	
			{
				if(word.equals(str[i]))
				{
				count++;
				}
			}
			System.out.println(word+" "+count);
			
		}
		

	}

}
