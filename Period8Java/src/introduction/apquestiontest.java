package introduction;

public class apquestiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mystery(147));
	}
	
	private static int mystery(int x) {
		if (x > 6) {
			return mystery(x / 4);
		}
		return x;
	}


}
