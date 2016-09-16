package introduction;

public class Senior extends Student {

	private boolean enoughCredits = (Math.random() < 0.5);

	public Senior(String name) {
		super(name);
	}
	
	public void talk(){
		super.talk();
		System.out.print(" and I am a senior!\n");
		System.out.println("Enough credits: " + enoughCredits);
	}

}
