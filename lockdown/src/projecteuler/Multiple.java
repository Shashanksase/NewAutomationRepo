package projecteuler;

public class Multiple {

	public static void main(String[] args) {
		int threes = 0;
        int fives  = 0;
        int sum    = 0;
        for (int i = 1; i < 1000; i++) {
            if (i>threes)
                threes+=3;
            if (i>fives)
               // fives+=5;
            fives = fives +5;
            if (i == threes || i == fives )
                sum+=i;
        }
        System.out.print(sum);
    }}