package introduction;

public class Sophomore extends Student {

	public Sophomore(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void talk(){
		super.talk();
		System.out.print(" and I am making fun of freshmen.\n");
	}

}
