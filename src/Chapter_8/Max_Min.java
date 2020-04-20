package Chapter_8;

import java.util.ArrayList;

public class Max_Min {

	public static void main(String[] args) {
		ArrayList<Integer> accounts = new ArrayList<Integer>();
        accounts.add(5);
        accounts.add(7);
        accounts.add(45);
        accounts.add(3);
        accounts.add(10);
        accounts.add(9);
        accounts.add(5);
        accounts.add(7);
        int largest = 0;
        int smallest = 98765;
        for(int i = 0; i < accounts.size(); i ++) {
        	if(accounts.get(i) > largest)
        		largest = accounts.get(i);
        	if(accounts.get(i) < smallest)
        		smallest = accounts.get(i);
        }
        System.out.print("Largest: " + largest);
        System.out.print("Smallest: " + smallest);


	}

}
