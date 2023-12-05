import java.util.*;

public class Workouts {
	public static int totalStamina;
	public static HashMap<Integer, Object> map = new HashMap<Integer, Object>();
	
	Queue workout = new LinkedList();
	
	public void addExercise(Exercise exercise) {
		workout.add(exercise);
		totalStamina += exercise.getStamina(); 
		
	}
	
	public Workouts() {}
	
	
	BodyWeighted pushups = new BodyWeighted("pushups", 20);
	BodyWeighted pullups = new BodyWeighted("pullups", 30);
	BodyWeighted dips = new BodyWeighted("dips", 25);
	BodyWeighted handstands = new BodyWeighted("handstands", 15);
	
	//Making the objects for weighted exercises
	Weighted benchpress  = new Weighted("benchpress", 25);
	Weighted deadlift  = new Weighted("deadlift", 30);
	Weighted curls  = new Weighted("curls", 20);
	Weighted squats  = new Weighted("squats", 30);
	
	
	
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
	
	//Exercise exercise = workout.remove();
	
	public int staminaCost() {
		return totalStamina;
		}
		
	}

