package Chatbot8;

import java.util.Scanner;

public class FriedmanMain {
	
	static Scanner input;
	static String user;
	static String response;
	
	public static void main(String[] args) {
//		demonstrateStringMethods();
		createFields();
		promptName();
//		promptInput("Please type something.");
		promptInputForever((String)("Please type something, " + user + "."));
//		while(true){
//			println(input.next());
//		}
	}
	
	public static void promptName() {
		println("Enter your name.");
		user = input.nextLine();
		printwrap("Okay. For the rest of time, I will call you " + user + ". You may call me Computer. We should become friends.");
		
	}

	public static void promptInput(String prompt) {
		println(prompt);
		String userInput = input.nextLine();
		println("Congratulations! You typed: " + userInput);
	}

	private static void promptInputForever(String prompt) {
		while(true){
			promptInput(prompt);
		}
	}
	
	public static void createFields() {
		input = new Scanner(System.in);
		user = "";
	}

	public static void demonstrateStringMethods(){
		String text1 = new String("Hello World!");
		String text2 = "Hello World!"; //same as above
		
		if(text1.equals(text2)){ //.equals(---) is very important
			print("true");
		}
		
		System.out.println(text1.compareTo(text2) < 0);
	}
	
	public static void println(String s){
		System.out.println(s);
	}
	public static void print(String s){
		System.out.print(s);
	}
	
	public static void printwrap(String s){
		String printString = "";
		int cutoff = 35;
//		check for words to add
//		IWO s has length > 0
		while(s.length() > 0){
			String cut = "";
			String nextWord = "";
//			check to see if the next word will fit on the line AND there must still be words to add
			while(cut.length() + nextWord.length() < cutoff && s.length() > 0){
//				add the next word to the line
				cut += nextWord;
				
				s = s.substring(nextWord.length());
				
//				identify following word without the spaces
				int endOfWord = s.indexOf(" ");
				
//				if there are no more spaces, this is the last word, so add the whole thing
				if(endOfWord == -1){
					endOfWord = s.length() - 1;//-1 for index
				}
				
				
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += cut + "\n";
		}
		System.out.println(printString);
	}
	
	@SuppressWarnings("unused")
	private static String getCut(String s, int cutoff, int cut, int startIndex){
		int cutIndex = cut * cutoff;
		if(cutIndex > s.length()){
			cutIndex = s.length();
		}
		String currentCut = s.substring(startIndex,cutIndex);
		
		int indexOfLastSpace = currentCut.length();
		for(int i = currentCut.length()-1; i >= 0; i--){
			String letter = currentCut.substring(i, i+1);
//			System.out.println(letter);
			if(letter.equals(" ")){
				indexOfLastSpace = i;
				break;
			}
		}
		
//		shorten the cut to end on a space
		currentCut = currentCut.substring(0, indexOfLastSpace);
		return currentCut;
	}

}

