package Practice;

public class OccuranceStringNotUsingCollection {

	public static void main(String[] args) {
		int count=0;
	    String s1 = "ApPlEL";
	    String s = s1.toLowerCase();
	    for(char i='a';i<='z';i++)
	    {
	        for(int j=0;j<s.length();j++)
	        {
	            if(s.charAt(j)==i){
	            count++;
	            }
	        }
	        if(count!=0){
	        System.out.println(i+"="+count);
	        count=0;
	        }
	    }
	}

}
