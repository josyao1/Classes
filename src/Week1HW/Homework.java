package Week1HW;
import java.awt.Color;
import java.awt.Rectangle;


public class Homework {
	
	///P2.9
	public String replacer(String str) {
		char ch;
		String newWord = "";
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == 'i') {
				newWord = newWord + "!";
			} else if (ch == 's') {
				newWord = newWord + "$";	
			} else {
				newWord = newWord + ch;
			}
			
			
		}
		return newWord;
		
	}
		
	
	public static void main(String[] args){
		
		Rectangle box = new Rectangle(5, 10, 15, 20);
		///P2.2
		double width = box.getWidth();
		double length = box.getHeight();
		System.out.println(width+length+width+length);
		
		///P2.3
		System.out.println(box);
		box.translate(15, 0);
		System.out.println(box);
		box.translate(-15, 20);
		System.out.println(box);
		box.translate(15, 0);
		System.out.println(box);
		///P2.4
		Rectangle box2 = new Rectangle(15,5,15,20);
		System.out.println(box);
		System.out.println(box2);
		Rectangle box3 = box.intersection(box2);
		System.out.println(box3);
		///P2.5
		Color colors = new Color(50,100,150);
		colors = colors.brighter();
		System.out.println(colors);
		///P2.9
		Homework test = new Homework();
		System.out.println(test.replacer("Mississipi"));
		
		
}
}