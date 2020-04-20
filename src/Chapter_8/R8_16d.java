package Chapter_8;

import java.util.ArrayList;

public class R8_16d {

	public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("the");
        words.add("happy");
        words.add("cat");
        for(int i = words.size()-1;i >= 0; i--) {
        	words.remove(i);
        }
        System.out.println(words);
	}

}
