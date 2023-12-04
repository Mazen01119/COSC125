import java.util.*;
public class BodyWeighted extends Exercise {

	private static String[] bodyweight = {"pushups", "pullups", "dips", "handstands"};
	static ArrayList<String> bodyweightExercises = new ArrayList<String>(Arrays.asList(bodyweight));
		
	
	public Bodyweighted(String exerciseName, int staminaCost) {
		super(exerciseName, staminaCost);
		
	}
	
	public static ArrayList<String> getExercises() {
		return bodyweightExercises;
	}
	
	
	
	

}
