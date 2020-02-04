package constructor;

public class User {

	public static void main(String[] args) {
		Car ford = new Car();
		ford.colour = "white";
		ford.model = "Vento.";
		Car.wheel = 5;
		ford.features();

		Car Suzuki = new Car();
		Suzuki.colour = "Blue";
		Suzuki.model = "ertiga.";
		Car.wheel = 6;
		Suzuki.features();

		Car Mahindra = new Car();
		Mahindra.colour = "Gray";
		Mahindra.model = "XUV500.";
		Car.wheel = 4;
		Mahindra.features();

		Car bmw = new Car("Blue", "X320",878);
		Car.wheel=45;
		bmw.features(); 
		
		Car bnhg = new Car("Black","Ass",74);
		bnhg.features();
	}

}
