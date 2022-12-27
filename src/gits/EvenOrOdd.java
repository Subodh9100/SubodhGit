package gits;
import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		
		if(a%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		
	}

}
