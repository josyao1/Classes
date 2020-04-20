package Week7HW;

import java.util.ArrayList;

public class ArrayListPractice
{
    /**
     * Removes all occurrences of wordToRemove from words
     * @param words the word to remove
     * @param wordToRemove the list from which to remove word
     */
    public static void removeWord(ArrayList<String> words, String wordToRemove)
    {
        for(int i = 0; i < words.size(); i++) {
        	if(words.get(i).equals(wordToRemove)) {
        		words.remove(i);
        		i--;
        	}
        }
    }
    
    /**
     * Duplicates each element in list that matches elem. Each duplicate
     * element is adjacent to the original element. 
     * @param list the list from which to duplicate elements
     * @param elem the element to duplicate
     */
    public static void duplicateMatching(ArrayList<Integer> list, Integer elem)
    {
        
//		Method 1
    	for(int i = list.size()-1; i >= 0; i--) {
        	if(list.get(i).equals(elem)) {
        		list.add(i,elem);
        		
        	
        	}
        	System.out.println(list);

        		
        }
//        
//        }
//    
    
//		Method 2
    	for(int i = 0; i < list.size(); i++) {
    		if(list.get(i).equals(elem)) {
    			list.add(i,elem);
    			i++;
    		}
    	}
    
    }
    /**
     * Removes all adjacent duplicate elements from list.
     * 
     * For example, if list was:
     * [5, 7, 7, 5, 3, 7, 7, 7, 8, 7, 7, 7, 7]
     * 
     * list would become:
     * [5, 7, 5, 3, 7, 8, 7]
     * 
     * @param list the list from which to remove elements
     */
    public static void removeAdjacentDuplicates(ArrayList<Integer> list)
    {
       for(int i = 0; i < list.size() - 1; i++) {
    	   if(list.get(i).equals(list.get(i + 1))) {
    		   list.remove(i);
    		   i--;
    	   }
       }
    }
}












