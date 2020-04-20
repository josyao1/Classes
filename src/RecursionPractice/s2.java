package RecursionPractice;

import java.util.ArrayList;

public class s2 {


	public static void main(String[] args)
	{
		String s = "cat";
		System.out.println(getSubstrings(s));
	}

	public static ArrayList<String> getSubstrings(String x)
	{
		ArrayList<String>  substrings= new ArrayList<String>();
		if(x.length() == 0) {
			substrings.add("");
			return substrings;
		}
		
		substrings = getSubstrings(x.substring(1));
		
		
		for(int i = x.length(); i > 0; i--) {
			substrings.add(x.substring(0,i));
		}
		
		return substrings;
		
	
	}

}

