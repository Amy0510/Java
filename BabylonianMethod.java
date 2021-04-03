import java.util.Scanner;
import java.util.Random;

public class BabylonianMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What number would you like to get the square root of?");
		double radicand = input.nextDouble();
		int upperbound = Integer.MAX_VALUE;
		int lowerbound = 0;
		Random rand = new Random();
		double randRoot =  rand.nextInt(upperbound-lowerbound) + lowerbound;

		int i= 1;
		while(randRoot != (radicand/randRoot)) {
			randRoot = ((radicand/randRoot) + randRoot)/2;
			System.out.println("Guess #"+ i + ": " + randRoot);
			i++;
			
		}
		
		System.out.println(randRoot);
	}

}
