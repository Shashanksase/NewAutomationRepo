package start;

public class Switch {

	public static void main(String[] args) {

		
		int week = 4;
		String day;

		switch (week) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day =  "MOnday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4: 
			day ="Wednesday";
			break;
		default:
			day = "invalid day";
			break;
		}
		
		System.out.println(day);
		
	}

}
