import java.util.*;

public class Workouts {
	Queue workout = new LinkedList();
	
	
	public void addExercise(Exercise exercise) {
		workout.add(exercise);
	}
	
	public int staminaCost(Queue workout) {
		int cost = 0;
		while(workout!=null) {
	//		Exercise exercise = workout.remove();
	//		cost += exercise.getStamina();
		}
		return cost;
	}
}
