package Chapter_8;

import java.util.ArrayList;

public class R8_4 {

	public static void main(String[] args) {
		String[] letters = new String[] {"h","q","r","g","k","l","m","n","a","x"};
		ArrayList<String> letterss = new ArrayList<String>();
		for(int i = 0; i < letters.length; i++) {
			letterss.add(letters[i]);
		}
		
		for(int i = letterss.size()-1; i >= 0; i--) {
			System.out.println(letterss.get(i));
		}
		


	}
}

