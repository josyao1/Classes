package Magpie;

import java.util.ArrayList;
import java.util.List;

public class ModifiedMagpie
{
    // returns a list of positions of keyword in str
    // returns empty list if no such positions
    public static List<Integer> findKeyword(String str, String keyword)
    {
    	List<Integer> keywordLocation = new ArrayList<Integer>();
    	
//    	for(int i = 0; i <= str.length() - keyword.length(); i++) {
//    		if(str.substring(i, i + keyword.length()).equals(keyword)) {
//    			keywordLocation.add(i);
//    		}
//    	}
		int thingsChopped = 0;
    	while(str.indexOf(keyword) != -1) {
 
    		int location = str.indexOf(keyword);
    		keywordLocation.add(location + thingsChopped);
    		str = str.substring(location + keyword.length());
    		thingsChopped += location + keyword.length();

    	}
    	
    	return keywordLocation;
    }

    // returns a list of positions of isolated occurrences of keyword in str
    // returns empty list if no such positions
    public static List<Integer> findIsolatedKeyword(String str, String keyword)
    {
    	List<Integer> isolatedLocation = new ArrayList<Integer>();
        str = " " + str + " ";
        List<Integer> keywordloc = findKeyword(str,keyword);
        for(int i = 0; i < keywordloc.size(); i++) {
        	
        	int before = keywordloc.get(i)-1;
        	int after = keywordloc.get(i)+keyword.length();
        	
            if(!inAlphabet(str.substring(before,before+1)) &&
                !inAlphabet(str.substring(after, after+1))){
            	
        		isolatedLocation.add(keywordloc.get(i)-1);
        	}

        }
        return isolatedLocation;	
    }
    
    public static boolean inAlphabet(String c) {    	
    	return (c.compareTo("z") <= 0 && c.compareTo("a") >= 0);
    }
    
    public static boolean isSpace(String s) {
    	if(s.equals(" ")) {
    		return true;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
    }

}
