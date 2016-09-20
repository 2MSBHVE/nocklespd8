package introduction;

public class DrawRandomCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(drawCard());
	}
	
	public static String drawCard(){
		String[] cards = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suits = {"Clubs","Hearts","Spades","Diamonds"};
		return "The " + cards[(int)((cards.length) * Math.random())] + " of " + suits[(int)((suits.length) * Math.random())] + ".";
	}
}
