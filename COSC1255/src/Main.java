import java.util.*;

public class Main {

	public static void main(String[] args) {
		/* There has to be a menu the user is first presented with the following items
		 * - brand new set up (this is if the user is using our program for the first time, this is where we ask him about name height and weight and whatever else u think fits the criteria
		 * 
		 * - todays date, this just means we have the users information and he wants to start the questionnaire then figure out his workout 
		 * 
		 * - general information, this is where the user can access all sorts of info like current stamina level for example, u can be creative with this as well
		 * 
		 * - now everytime a user finishes doing the questionnaire and picking his workout a new text file should be created that acts a diary of ssorts, this file shows the date, the answers to his questionnaire and the workout he did
		 * - these files regardless of the date should also be accessible from the menu 
		 * when i say he i mean he/she, not to sound sexist 
		 */
		//Making the objects for bodyweighted exercises.
		BodyWeighted pushups = new BodyWeighted("pushups", 20);
		BodyWeighted pullups = new BodyWeighted("pullups", 30);
		BodyWeighted dips = new BodyWeighted("dips", 25);
		BodyWeighted handstands = new BodyWeighted("handstands", 15);
		
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
				
		
		Scanner input = new Scanner(System.in);
		System.out.println(Exercise.exercises);
		//Exercise.print();
		//Workouts workout = new Workouts();
		//String answer = "yes";
		//String exercise;
		/*do {
			System.out.println("Do you want to add an exercise? ");
		    answer = input.nextLine();	
		    System.out.println("What exercise do you want to add? ");
		    
		}while(answer.equals("yes"));*/
		
		//String s = input.nextLine();
		//workout.addExercise(curls);
	//	workout.addExercise(pull up);
		
		
			
	/*			
			String answer = "yes";
			
			while(!answer.equals("no")) { 
				
			
			
				
				
				System.out.println("Please select the corrospinding number of the desired Exercise. ");
				for(int i=0; i<Exercise.exercises.size(); i++) {
					System.out.println(i+1);
					System.out.println(Exercise.exercises.get(i));
				}
				int test = input.nextInt();
				input.nextLine();
				switch(test) {
					case 1:
						workout.addExercise(Exercise.exercises.get(0));
						break;
					case 2:
						workout.addExercise(Exercise.exercises.get(1));
						break;
					case 3:
						workout.addExercise(Exercise.exercises.get(2));
						break;
					case 4:
						workout.addExercise(Exercise.exercises.get(3));
						break;
					case 5:
						workout.addExercise(Exercise.exercises.get(4));
						break;
					case 6:
						workout.addExercise(Exercise.exercises.get(5));
						break;
					case 7:
						workout.addExercise(Exercise.exercises.get(6));
						break;
					case 8:
						workout.addExercise(Exercise.exercises.get(7));
						break;
					
				}
				System.out.println("Would you like to add another exercise?");
				answer = input.nextLine();
				
				
			}
			System.out.println(workout.toString());
			System.out.println(Workouts.totalStamina);
			*/
		
		Workouts workout1 = new Workouts(handstands, pushups, curls, null);
		Workouts workout2 = new Workouts(benchpress, squats, curls, null);
		Workouts workout3 = new Workouts(deadlift, dips, pullups, null);
		Workouts workout4 = new Workouts(deadlift, squats, pullups, benchpress);
		
		System.out.println("What fatigue level would you like to use?");
		int fatigue = input.nextInt();
		Workouts.setMap(Workouts.map, workout1, workout2, workout3, workout4);
		System.out.println(Workouts.map.get(fatigue));
		
		
		
		
	}

}
