import java.util.*;
public class Weighted extends Exercise {

	private static String[] weighted = {"benchpress", "deadlift", "curls", "squats"};
	static ArrayList<String> weightExercises = new ArrayList<String>(Arrays.asList(weighted));
		
	
	public Weighted(String exerciseName, int staminaCost) {
		super(exerciseName, staminaCost);
		
	}
	
	public String[] getExercises() {
		return weighted;
	}
	
	
}
