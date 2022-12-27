package gits;
import java.util.*;

public class Basic_Array {

	static void display(int []arr)
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(i+")"+" "+arr[i]+" ");
//			arr[i] = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0 ; i<size ; i++)
		{
			System.out.println("Element at "+i);
			arr[i] = sc.nextInt();
		}
		System.out.println("The elements of array are :-");
		Basic_Array.display(arr);
		sc.close();
	}

}

