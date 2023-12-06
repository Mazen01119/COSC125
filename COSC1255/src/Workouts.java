import java.util.*;

public class Workouts {
	public static int totalStaminaLoss;
	public static HashMap<Integer, Object> map = new HashMap<Integer, Object>();
	Queue workout = new LinkedList();
	
	public void addExercise(Exercise exercise) {
		workout.add(exercise);
		totalStaminaLoss += exercise.getStamina(); 
		
	}
	
	public Workouts() {}
	
	public static int getTotalStaminaLoss(){
		return totalStaminaLoss;
	}
	
	
	
	
	public Workouts(Exercise exerciseOne, Exercise exerciseTwo, Exercise exerciseThree, Exercise exerciseFour) {
		
		this.workout.add(exerciseOne);
		this.workout.add(exerciseTwo);
		this.workout.add(exerciseThree);
		this.workout.add(exerciseFour);
	}
	
	
	
	public static void setMap(HashMap<Integer, Object> map, Workouts workout1, Workouts workout2, Workouts workout3, Workouts workout4){
		map.put(40, workout1);
		map.put(60, workout2);
		map.put(80, workout3);
		map.put(95, workout4);
	}
	
	
	public String toString() {
		return workout.toString();
	}
	
	
	
	public int staminaCost() {
		return totalStaminaLoss;
		}
		
	}

//40, 60, 80, 95

	// 40 = handstands 10 + pushups 15 + curls 15
	// 60 = benchpress 20 + squats 25 + curls 15
	// 80 = deadlift 25 + dips 20 + pull ups 25 + handstands 10 
	// 95 = deadlift 25 + squats 25 + pull ups 25 + bench press 20
