package introduction;

public class OOPExample {

	public static void main(String[] args) {
		Student jillian = new Senior("Jillian");
		Student josh = new Sophomore("Josh");
		Student jordan = new Freshman("Jordan");
		Student frank = new Student("Frank");
		
		jordan.talk();
		josh.talk();
		frank.talk();
		jillian.talk();
		
		((Junior)jordan).boastScore();
		
//		jillian.name = "BaloneyPants";
//		jillian.talk();
		
	}

}
