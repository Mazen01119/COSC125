
import java.util.*;
public class Exercise {

	private int staminaCost;
	private String exerciseName;
	static ArrayList<Exercise> exercises = new ArrayList<Exercise>();
	
	public Exercise(String exerciseName, int staminaCost) {
		this.exerciseName = exerciseName;
		this.staminaCost = staminaCost;
		
	}
	
	public int getStamina() {
		return staminaCost;
	}
	
	public static void addExercise(String name, int stamina) {
		Exercise ex = new Exercise(name, stamina);
		exercises.add(ex);
	}
	
	
	public String toString() {
		return exerciseName + " " + staminaCost;
	}
	
	public static void main(String[] args) {
		
		
		//Making the objects for bodyweighted exercises.
		Bodyweighted pushups = new Bodyweighted("pushups", 20);
		Bodyweighted pullups = new Bodyweighted("pullups", 30);
		Bodyweighted dips = new Bodyweighted("dips", 25);
		Bodyweighted handstands = new Bodyweighted("handstands", 15);
		
		//Making the objects for weighted exercises
		Weighted benchpress  = new Weighted("benchpress", 25);
		Weighted deadlift  = new Weighted("deadlift", 30);
		Weighted curls  = new Weighted("curls", 20);
		Weighted squats  = new Weighted("squats", 30);
		
		//Adding the bodyweight exercises to the list of exercises.
		Exercise.exercises.add(pushups);
		Exercise.exercises.add(pullups);
		Exercise.exercises.add(dips);
		Exercise.exercises.add(handstands);
		
		//Adding the weighted exercises to the list of exercises.
		Exercise.exercises.add(benchpress);
		Exercise.exercises.add(deadlift);
		Exercise.exercises.add(curls);
		Exercise.exercises.add(squats);
		
		
		
		
		
		
		while(true) {
			//Temporary for now, gives an example of how a user would add a custom exercise to the list of exercises.
			System.out.println(Bodyweighted.getExercises());
			System.out.println(Weighted.getExercises());
			Scanner input = new Scanner(System.in);
			
			System.out.println("Do you want to add exercises? (yes/no)");
			if(input.nextLine().toLowerCase().equals("yes")) {
				
				System.out.println("Whats the name of the exercise you want to add");
				String exerciseName = input.nextLine();
				
				System.out.println("How much stamina does it cost?");
				int staminaCost = input.nextInt();
				
				boolean weighted = true;
				
				System.out.println("is it weighted?");
				input.nextLine(); 
				if(!(input.nextLine().toLowerCase().equals("yes"))) {
					weighted = false;
				}
				
				if(weighted) {
					Weighted.weightedExercises.add(exerciseName); //Adds to weighted exercise list
				} else {
					Bodyweighted.bodyweightExercises.add(exerciseName); //Adds to bodyweighted exercise list
				}
				
				Exercise.addExercise(exerciseName, staminaCost); //Adds exercise to general listz	
			} else {
				break;
			}
		}
		
		
	}
	
	
	
}
