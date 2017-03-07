package introduction;

import java.util.ArrayList;
import java.util.Iterator;

public class ListRunner {

	static ArrayList<Item> shoppingList;
	
	public static void main(String[] args) {
		String[] justDescriptions = getDescriptions();
		initList(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
	}

	private static void printPurchasedItems() {
		// TODO Auto-generated method stub
		for (int i = 0; i < shoppingList.size(); i++) {
			Item m = shoppingList.get(i);
			if (m.isPurchased()) {
				System.out.println(m.getDescription());
				shoppingList.remove(m);
				i--;
				
			}
		}
	}

	private static void doSomeShopping() {
		shoppingList.get(0).setPurchased(true);
		shoppingList.get(3).setPurchased(true);
	}

	private static void initList(String[] justDescriptions) {
		shoppingList = new ArrayList<Item>();
		for (String s : justDescriptions) {
			shoppingList.add(new Item(s));
		}
	}

	private static String[] getDescriptions() {
		return new String[]{"Coffee", "VidGames", "PotChips", "A Life"};
	}

}
