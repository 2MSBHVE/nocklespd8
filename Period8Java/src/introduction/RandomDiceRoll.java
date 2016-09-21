package introduction;

import java.util.Scanner;

public class RandomDiceRoll {

	public static void main(String[] args) {
//		fill array with 6 zeroes
		int[] results = new int[6];
		
		int totalRolls = 200000;
		
		//		declare variable, logic test, increment
		for(int index = 0; index < totalRolls; index++) {
			int rollOut = rollFairDie();
			results[rollOut-1]++;
			System.out.println("Roll #" + (index + 1)+ ": " + rollOut);
		}
		
		for(int i = 0; i < results.length; i++) {
//			System.out.println((i + 1)+ ": " + results[i]);
			
			double percentage = (int)(1000*(double)results[i]/totalRolls)/10.0;
			System.out.println((i + 1)+ " appeared " + percentage + "% of the time.");
			
//			System.out.println((i + 1)+ " appeared " + (results[i]%totalRolls) + "times.");
		}
		
		
	}
	
	
//	return 1,2,3,4,5,6 with equal probability
	public static int rollFairDie(){
		double rand = Math.random();//returns a double (0,1)
		int roll = (int) (6*rand) + 1;//[1,6]
		return roll;
	}
	
	
	public static int rollUnfairDie(){
		int[] conceptualSides = {1,2,3,4,4,4,5,5,6};
		int conceptualOutcomes = conceptualSides.length; //length of array
		double rand2 = Math.random();//returns a double (0,1)
		int roll2 = (int) (conceptualOutcomes*rand2);
		return conceptualSides[roll2];
	}

}
