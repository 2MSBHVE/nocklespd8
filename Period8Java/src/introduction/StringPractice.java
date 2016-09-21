package introduction;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//		while(true){
//			println(input.next());
//		}
//		
//		System.out.println();
		
		
//		String text1 = new String("Hello World!");
//		String text2 = "Hello World!"; //same as above
//		
//		if(text1.equals(text2)){ //.equals(---) is very important
//			print("true");
//		}
		
		Scanner wordScan = new Scanner(System.in);
		String word1 = wordScan.next();
		String word2 = wordScan.next();
		
		System.out.println(word1.compareTo(word2) < 0);
		
		
		
				
	}
	
	public static void println(String s){
		System.out.println(s);
	}
	public static void print(String s){
		System.out.print(s);
	}

}
