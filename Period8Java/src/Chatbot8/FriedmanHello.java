package Chatbot8;

public class FriedmanHello implements Chatbot {
	
	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponses = {"yes, hello *sigh*", "Okay, hellllloooooooo"};
	private String[] angryResponses = {"Okay really stop saying hi.", "Wyd fam u said hello"};
	
	private int helloCount;
	
	public void talk(){
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();
			helloResponse = FriedmanMain.promptInput("");
//			to negate, use !
			if(isTriggered(helloResponse)){
				inHelloLoop = false;
				FriedmanMain.promptInputForever("");
			}
		}
	}
	
//	private void printResponseFrom(String[] responseArray) {
//		if(helloCount > 4){
//			int responseSelection = (int)*(Math.random()*responseArray.length);
//			FriedmanMain.printwrap(responseArray[responseSelection]);
//		}
//		else {
//			
//		}
//	}
	
	private void printResponse() {
		if(helloCount > 4){
			int responseSelection = (int)(Math.random()*angryResponses.length);
			FriedmanMain.printwrap(angryResponses[responseSelection]);
		}
		else {
			int responseSelection = (int)(Math.random()*calmResponses.length);
			FriedmanMain.printwrap(calmResponses[responseSelection]);
		}
	}

	public boolean isTriggered(String userInput){
		if (FriedmanMain.findKeyword(userInput, "hello", 0) >= 0) {
			return true;
		}
		return false;
	}
	
}
