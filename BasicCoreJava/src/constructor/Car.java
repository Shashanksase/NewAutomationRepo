package constructor;

public class Car {
	String colour;
	String model;
	static int wheel = 4;

	public void features() {
		System.out.println("There is " + wheel + " wheeler  with " + colour + " colour model " + model);
	}

	public Car() {
	}

	
	  public Car(String colour, String model) {
	  
	  this.colour = colour; this.model = model;  }
	 // Car p1= new Car(); 
	  public Car (String colour, String model, int wheel) {
		  this.colour=colour;
		  this.model=model;
		  Car.wheel=wheel;
	  }
	 
}
