import java.util.*;

public class Workouts {
	public static int totalStamina;
	HashMap<Integer, Object> map = new HashMap<Integer, Object>();
	
	Queue workout = new LinkedList();
	
	public void addExercise(Exercise exercise) {
		workout.add(exercise);
		totalStamina += exercise.getStamina(); 
		
	}
	
	
	//Exercise exercise = workout.remove();
	
	public int staminaCost() {
		return totalStamina;
		}
		
	}

