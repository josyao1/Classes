package Chapter_8;

import java.util.ArrayList;
import java.util.List;

public class Purse {
	
	ArrayList<String> coins;
	private String[] coinNames = {"PENNY", "QUARTER", "NICKEL", "DIME"};
	int penCount = 0;
	int nicCount = 0;
	int dimCount = 0;
	int quaCount = 0;
	
	private boolean isValid(String coinName) {
		for(int i = 0; i < coinNames.length; i++) {
			if (coinName.equalsIgnoreCase(coinNames[i])) {
				return true;
			}
		}
		return false; }
	
	public Purse() {
		
	}
	
	public Purse(ArrayList<String> coin) {
		
		coins = coin;
	}

	public void addCoin(String coinName) {
		if (isValid(coinName)) {
			coins.add(coinName);
		} else {
			System.out.println("Invalid coin: " + coinName);
		}
	}
	
	public String toString() {
		return coins.toString();
	}
	
	public void reverse(ArrayList<String> values) {
		ArrayList<String> reversed = new ArrayList<String>();
        for (int i = 0; i < values.size(); i++)
        {
            reversed.add(i, values.get(values.size() - 1 - i));
        }
        coins = reversed;

	}
	
	public void transfer(Purse other) {
		
		other.coins.addAll(coins);
		coins = other.coins;
		
	}
	
	public boolean sameContent(Purse other) {
		if (coins.size() != other.coins.size()) {
			return false;
		}
		for(int i = 0; i < coins.size(); i++) {
			if (!coins.get(i).equals(other.coins.get(i))) {
				return false;
			}
		}
		return true;
		
	}
	
	public boolean sameCoins(Purse other) {
		
		for(int i = 0; i < other.coins.size(); i++) {
			if(other.coins.get(i) == "PENNY")
				penCount --;
			if(other.coins.get(i) == "NICKEL")
				nicCount --;
			if(other.coins.get(i) == "QUARTER")
				quaCount --;
			if(other.coins.get(i) == "DIME")
				dimCount --;
		}
		
		if(dimCount == 0 && penCount == 0 && nicCount == 0 && quaCount == 0)
			return true;
		return false;
	}
	
	public void countCoins(ArrayList<String> purse) {
		
		for(int i = 0; i < purse.size(); i++) {
			if(purse.get(i) == "PENNY")
				penCount ++;
			if(purse.get(i) == "NICKEL")
				nicCount ++;
			if(purse.get(i) == "QUARTER")
				quaCount ++;
			if(purse.get(i) == "DIME")
				dimCount ++;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		ArrayList<String> coins = new ArrayList<String>();
		coins.add("DIME");
		coins.add("QUARTER");
		coins.add("NICKEL");
		coins.add("QUARTER");
		ArrayList<String> coins2 = new ArrayList<String>();
		coins2.add("DIME");
		coins2.add("QUARTER");
		coins2.add("NICKEL");
		coins2.add("PENNY");
		Purse test = new Purse(coins);
		Purse dup = new Purse(coins2);
		test.addCoin("PENNY");
		System.out.println(test.toString());
		test.reverse(coins);
		System.out.println(test.toString());
		test.transfer(dup);
		System.out.println(test.toString());
		
		Purse new1 = new Purse(coins);
		Purse new2 = new Purse(coins);
		new1.countCoins(new1.coins);
		System.out.println(new1.sameCoins(new2));

		
		



	}

}
