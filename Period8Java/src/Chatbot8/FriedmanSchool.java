package Chatbot8;

public class FriedmanSchool implements Chatbot {

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	@Override
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			FriedmanMain.println("(Type 'quit' to go back.)");
			schoolResponse = FriedmanMain.promptInput("");
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				FriedmanMain.promptInputForever("");
			}
			FriedmanMain.println("That's my favorite part about school!");
		}
		
	}

}
