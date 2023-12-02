import java.util.*;
public class BodyWeighted extends Exercise {

	private static String[] bodyweight = {"pushups", "pullups", "dips", "handstands"};
	static ArrayList<String> bodyweightExercises = new ArrayList<String>(Arrays.asList(bodyweight));
		
	
	public BodyWeighted(String exerciseName, int staminaCost) {
		super(exerciseName, staminaCost);
		
	}
	
	public String[] getExercises() {
		return bodyweight;
	}
	
	
	
	

}
