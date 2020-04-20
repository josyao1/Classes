package StringPractice;

public class replaceAll {
	
	
	public static String replaceAll1(String str, String toFind, String toReplace) {
		
		String newStr = str;
		
		while(newStr.indexOf(toFind) != -1) {
			int pos = newStr.indexOf(toFind);
			newStr = newStr.substring(0, pos) + toReplace + newStr.substring(pos + toFind.length());
		}
		
 
		
		return newStr;
		
	}
	
	public static String replaceAll2(String str, String toFind, String toReplace) {
		
		String newStr = str;
		int index = 0;
		System.out.println(newStr);

		while((newStr.substring(index)).indexOf(toFind)!= -1) {
			int pos = (newStr.substring(index)).indexOf(toFind) + index;
			newStr = newStr.substring(0, pos) + toReplace + newStr.substring(pos + toFind.length());
			index = pos + toReplace.length();
			System.out.println(newStr);
		}
		
		return newStr;
		
		
	}

	public static void main(String[] args) {
		replaceAll2("abcabcabcabc", "abc","abcde");
	}

}
