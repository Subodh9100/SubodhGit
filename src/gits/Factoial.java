package gits;
import java.util.*;

public class Factoial {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b=1;
		for(int i=1;i<=a;i++)
		{
			b=b*i;
		}
		System.out.println("Factorial numbers are "+b);
	}

}
