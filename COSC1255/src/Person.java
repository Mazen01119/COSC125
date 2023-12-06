

public class Person {
	    String name;
	    double height; // Assuming height is in meters
	    double weight; // Assuming weight is in kilograms

	    // Constructors
	    
	    public Person(){
	        
	    }
	    
	    public Person(String name, double height, double weight) {
	        this.name = name;
	        this.height = height;
	        this.weight = weight;
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getHeight() {
	        return height;
	    }

	    public void setHeight(double height) {
	        this.height = height;
	    }

	    public double getWeight() {
	        return weight;
	    }

	    public void setWeight(double weight) {
	        this.weight = weight;
	    }

	    

	   // Example: Method to calculate BMI (Body Mass Index)
	    public double calculateBMI() {
	        // BMI formula: weight / (height * height)
	        return weight / (height * height);
	    }

}
