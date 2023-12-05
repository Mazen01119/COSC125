import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		// SCANNER DECLARATION
		Scanner input = new Scanner(System.in);
		
		
		
		//OBJECT DECLARATION
		//Making the objects for bodyweighted exercises.
				BodyWeighted pushups = new BodyWeighted("pushups", 15);
				BodyWeighted pullups = new BodyWeighted("pullups", 25);
				BodyWeighted dips = new BodyWeighted("dips", 20);
				BodyWeighted handstands = new BodyWeighted("handstands", 10);
				
				//Making the objects for weighted exercises
				Weighted benchpress  = new Weighted("benchpress", 20);
				Weighted deadlift  = new Weighted("deadlift", 25);
				Weighted curls  = new Weighted("curls", 15);
				Weighted squats  = new Weighted("squats", 25);
		
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
				
				Workouts workout = new Workouts();
				Workouts workout1 = new Workouts(handstands, pushups, curls, null);
				Workouts workout2 = new Workouts(benchpress, squats, curls, null);
				Workouts workout3 = new Workouts(deadlift, dips, pullups, null);
				Workouts workout4 = new Workouts(deadlift, squats, pullups, benchpress);
		
		
		// MENU 
				
				// Brand new set up
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your height (in meters): ");
        double height = input.nextDouble();
        System.out.print("Enter your weight (in kilograms): ");
        double weight = input.nextDouble();
        Person person = new Person(name, height, weight);
        
		boolean exitMenu=false;
		
		while(!exitMenu) {
			System.out.println("=== MENU ===");
            System.out.println("1. Brand new set up");
            System.out.println("2. Today's workout");
            System.out.println("3. General information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); 
            
            switch(choice) {
            	case 1: 
            		// Brand new set up
            		System.out.println("Change your information. ");
                    System.out.print("Enter your name: ");
                    person.setName(input.nextLine());
                    System.out.print("Enter your height (in meters): ");
                    person.setHeight(input.nextDouble());
                    System.out.print("Enter your weight (in kilograms): ");
                    person.setWeight(input.nextDouble());
                    break;
            	case 2:
            		System.out.println("First up on the schedule is the morning questionnaire.");
            		System.out.println("How long did you sleep for? ");
            		int sleepDuration = input.nextInt();
            		if(sleepDuration >= 8) {
            			sleepDuration = 40;
            		}
            		else if(sleepDuration <8 && sleepDuration>6) {
            			sleepDuration = 30;
            		}
            		else {
            			sleepDuration = 20;
            		}
            		System.out.println("What is your soreness level? (0-3 ");
            		int sorenessLevel = input.nextInt();
            		if (sorenessLevel == 1) {
            			sorenessLevel = -10;
            		}
            		else if(sorenessLevel == 2) {
            			sorenessLevel = -20;
            		}
            		else if(sorenessLevel == 3) {
            			sorenessLevel = -30;
            		}
            		else {
            			sorenessLevel=0;
            		}
            		System.out.println("What is your meal count? ");
            		int mealCount = input.nextInt();
            		if (mealCount == 1) {
            			mealCount = 15;
            		}
            		else if(mealCount == 2) {
            			mealCount = 25;
            		}
            		else if(mealCount == 3) {
            			mealCount = 35;
            		}
            		else {
            			mealCount=0;
            		}
            		input.nextLine();
            		Statistics statistics = new Statistics(sleepDuration, sorenessLevel, mealCount);
            		
            		System.out.println("You have successfully completed the questionnaire. ");
            		System.out.println("Would you like to workout today? ");
            		String workoutChoice = input.nextLine();
            		if(workoutChoice.equalsIgnoreCase("yes")) {
            			if((statistics.calculateStaminaLevel()-95) <= 5) {
            				System.out.println("You cannot workout today, your risk of injury is high!");
            				System.out.println("Exiting the Program, goodbye!");
            				exitMenu = true;
            				break;
            			}
            			System.out.println("Would you like to set up your own Workout? ");
            			String workoutChoiceTwo = input.nextLine();
            			
            			if(workoutChoiceTwo.equalsIgnoreCase("yes")) {
            				String answer = "yes";
            				int count = 0;
            				while(!answer.equals("no")) { 
            					count++;
            				System.out.println("Please select the corresponding number of the following Exercises. ");
            				for(int i=0; i<Exercise.exercises.size(); i++) {
            					System.out.print(i+1 + " ");
            					System.out.println(Exercise.exercises.get(i));
            				}	
            					
            					int exerciseChoice = input.nextInt();
            					input.nextLine();
            					switch(exerciseChoice) {
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
            					if(count>3) {
            						System.out.println("You have exceeded the amount of exercises you can add. ");
            						break;
            					}
            					System.out.println("Would you like to add another exercise?");
            					answer = input.nextLine();
            			}
            				System.out.println("This is your workout for today. ");
            				System.out.println(workout.toString());
            				System.out.println("This is your stamine level before the workout: " + statistics.calculateStaminaLevel());
            				System.out.println("This is what the workout is gonna cost you: " + Workouts.totalStaminaLoss);
            				System.out.println("This is your stamina Level after the workout: " + statistics.postCustomWorkout());
            				// stamina level
            				System.out.println("Exiting the program, have a nice Workout and Day! See you tomorrow. ");
            				exitMenu = true;
            				break;
            			}
            			else {
            				System.out.println("How much stamina are you looking to lose? ");
            				int fatigue = input.nextInt();
            				Workouts.setMap(Workouts.map, workout1, workout2, workout3, workout4);
            				System.out.println("According to your stamina loss choice, this is your chosen workout: ");
            				System.out.println(Workouts.map.get(fatigue));
            				System.out.println("This is your stamina Level after the workout: " + statistics.postSetWorkout(fatigue));
            				// stamina level
            				System.out.println("Exiting the Program, have a nice Workout and Day! See you tomorrow. ");
            				exitMenu = true;
            				break;
            			}
            		}
            		else {
            			System.out.println("Exiting the program. Have a great rest day, see you tomorrow! ");
            			exitMenu = true;
            			break;
            		}
            	case 3:
            		System.out.println("Your name is: " + person.getName());
            		System.out.println("Your weight is: " + person.getWeight());
            		System.out.println("Your height is: " + person.getHeight());
            		System.out.println("Your BMI Level is: " + person.calculateBMI());
            		System.out.println("Your current Stamina level can be seen after you do the morning questionnaire and plan out your workout. ");
            		System.out.println("The system calculates your stamina level by adding your sleep Quality/ Duration, your planned meal count and your soreness Level to your inital Stamina Level.");
            		System.out.println("Would you like to return to the original Menu? ");
            		if(input.nextLine().equalsIgnoreCase("yes")) {
            			break;
            		}
            		exitMenu=true;
            		break;
            }
		}
		
		
		
		
	}
}
		
		
		
		
		
				
		
		
		