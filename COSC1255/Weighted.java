import java.util.*;
public class Weighted extends Exercise {

	private static String[] weighted = {"benchpress", "deadlift", "curls", "squats"};
	static ArrayList<String> weightedExercises = new ArrayList<String>(Arrays.asList(weighted));
		
	
	public Weighted(String exerciseName, int staminaCost) {
		super(exerciseName, staminaCost);
		
	}
	
	public static ArrayList<String> getExercises() {
		return weightedExercises;
	}
	
	
}
