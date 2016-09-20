package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
//		declare variable, logic test, increment
		for(int index = 0; index < 10; index++) {
			System.out.println("Roll #" + (index + 1)+ ": " + rollUnfairDie());
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
		double rand = Math.random();//returns a double (0,1)
		int roll = (int) (conceptualOutcomes*rand);
		return conceptualSides[roll];
	}

}
