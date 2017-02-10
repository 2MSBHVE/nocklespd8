package introduction;

import java.util.ArrayList;

public class arraystringtest {

	public arraystringtest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> x = new ArrayList<String>();
		x = spliceString("There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.");
		for (int i = 0; i < x.size(); i+= 10) {
			for (int j = 0; j < 10; j++) {	
				System.out.print(x.get(i+j));
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

	public static ArrayList<String> spliceString(String s) {
		int last = 0;
		ArrayList<String> out = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 32) {
				out.add(s.substring(last, i));
				last = i+1;
			}
		}
		return out;
	}
	
}
