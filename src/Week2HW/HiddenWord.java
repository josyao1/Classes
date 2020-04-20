package Week2HW;

public class HiddenWord {

	private String correctWord;
	
	public HiddenWord(String word) {
		correctWord = word;
	}
	String getHint(String guess) {
		String hint = "";
		
		for(int i = guess.length(); i < 0; i ++){
			String letter = guess.substring(i, i + 1);
			if(correctWord.substring(i,i+1).equals(letter)) {
				hint = hint + letter;
			} else if (correctWord.indexOf(letter) != -1) {
				hint = hint + "+";	
			} else 
				hint = hint + "*";
		
		
	}
		return hint;
}

}
