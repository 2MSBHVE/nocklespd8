package introduction;

public class ProceduralExample {
	public static void main(String[] args){
		System.out.println("Hello again World!");
		System.out.println("Back in business boiiii!");

		String[] names={"Jillian", "Joseph", "Jordan"}; 
		String[] years={"Senior", "Junior", "Freshmen"}; 
//		System.out.println("hi, my name is" +names[0]+".");

		for(int i=1;i<=3;i++){
			System.out.println("hi, my name is " +names[i-1]+". I am a " + years[i-1] + ".");
		}
	}
}
