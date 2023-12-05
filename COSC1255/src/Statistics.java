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
	    private int sleepDuration;
	    private int sorenessLevel;
	    private int mealCount;
	    private int currentStamina;
	    private int stamina = 100;

	    public Statistics(int sleepDuration, int sorenessLevel, int mealCount) {
	        this.sleepDuration = sleepDuration;
	        this.sorenessLevel = sorenessLevel;
	        this.mealCount = mealCount;
	    }

	    public int getSleepDuration() {
	        return sleepDuration;
	    }

	    public void setSleepDuration(int sleepDuration) {
	        this.sleepDuration = sleepDuration;
	    }

	    public int getSorenessLevel() {
	        return sorenessLevel;
	    }

	    public void setSorenessLevel(int sorenessLevel) {
	        this.sorenessLevel = sorenessLevel;
	    }

	    public int getMealCount() {
	        return mealCount;
	    }

	    public void setMealCount(int mealCount) {
	        this.mealCount = mealCount;
	    }

	    public int calculateStaminaLevel() {
	        int currentStamina = stamina + getSorenessLevel() + getSleepDuration() + getMealCount();
	        return currentStamina;
	    }
	    
	    public int postCustomWorkout() {
	    	int postWorkout = currentStamina - Workouts.getTotalStaminaLoss();
	    	return postWorkout;
	    }
	    
	    
	    
	    public int getCurrentStamina() {
	    	return currentStamina;
	    }
	    
	    public void setInitialStamina(int stamina) {
	    	this.stamina = stamina;
	    }
	    
	// >8 hours of sleep + 40, <8 hours of sleep + 30, <6hours of sleep + 20, 1 meal 15, 2 meals 25, 3 meals 35, 1 soreness -10, 2 soreness -20, 3 soreness -30 
	
	
}	
   