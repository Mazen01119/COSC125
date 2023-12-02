import java.util.ArrayList;


// this class is supposed to store questionnaire results 
public class Statistics {
	
	/* Add the following data fields to store the questionnaire results 
	 * int sleep duration
	 * int soreness level out of a 100
	 * int amount of meals
	 * 
	 * there should also be a calculation of stamina level here 
	 * now the exact calculaation we do not know, we do not know how much stamina sleep replenishes 
	 * we do not know how much the amount of meals affect stamina and we do not 
	 * know how much the soreness level in the morning affects stamina
	 * but we can say that stamina = 100 - workout_total_fatigue_level - morning soreness + (sleep duration + meal count)
	 * Yousif set up the fatigue levels of each exercise so do your values accordingly 
	 * you have full freedom in how the values and the calculation end up looking like, they just have to make sense 
	 *
	 */
	
	
	
    private ArrayList<Integer> workoutTimes;
    private ArrayList<Person> persons;

    public Statistics() {
        workoutTimes = new ArrayList<>();
        persons = new ArrayList<>();
    }

    public void addWorkoutTime(int time) {
        workoutTimes.add(time);
    }

    public int getMinimumWorkoutTime() {
        if (workoutTimes.isEmpty()) {
            return 0; // Return 0 if there are no workout times recorded
        }

        int minTime = workoutTimes.get(0);
        for (int time : workoutTimes) {
            if (time < minTime) {
                minTime = time;
            }
        }

        return minTime;
    }

    public int getMaximumWorkoutTime() {
        if (workoutTimes.isEmpty()) {
            return 0; // Return 0 if there are no workout times recorded
        }

        int maxTime = workoutTimes.get(0);
        for (int time : workoutTimes) {
            if (time > maxTime) {
                maxTime = time;
            }
        }

        return maxTime;
    }

    public double getAverageWorkoutTime() {
        if (workoutTimes.isEmpty()) {
            return 0; // Return 0 if there are no workout times recorded
        }

        int sumTime = 0;
        for (int time : workoutTimes) {
            sumTime += time;
        }

        return (double) sumTime / workoutTimes.size();
    }

    public double getBMIDifference() {
        if (persons.isEmpty()) {
            return 0; // Return 0 if there are no person data available
        }

        Person initialPerson = persons.get(0);
        double initialBMI = initialPerson.calculateBMI();

        Person latestPerson = persons.get(persons.size() - 1);
        double latestBMI = latestPerson.calculateBMI();

        return latestBMI - initialBMI;
    }

    public int getTotalWorkoutTime() {
        if (workoutTimes.isEmpty()) {
            return 0; // Return 0 if there are no workout times recorded
        }

        int totalWorkoutTime = 0;
        for (int time : workoutTimes) {
            totalWorkoutTime += time;
        }

        return totalWorkoutTime;
    }

    public double getAverageWorkoutIntensity() {
        if (persons.isEmpty()) {
            return 0; // Return 0 if there are no person data available
        }

        double totalIntensity = 0;
       /* for (Person person : persons) {
            totalIntensity += person.getWorkoutIntensity();
        }*/

        return totalIntensity / persons.size();
    }

   /* public double getCalorieBurnRate() {
        if (workoutTimes.isEmpty() || persons.isEmpty()) {
            return 0; // Return 0 if there are no workout times recorded or person data available
        }

        int totalWorkoutTime = getTotalWorkoutTime();
        double totalCaloriesBurned = 0;
        for (Person person : persons) {
            totalCaloriesBurned += person.calculateCaloriesBurned(totalWorkoutTime);
        }

        return totalCaloriesBurned / totalWorkoutTime;
    }*/
}