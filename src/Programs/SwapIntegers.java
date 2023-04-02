package Programs;

import java.util.Scanner;

public class SwapIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();

		System.out.println("Enter the second number");
		int b=sc.nextInt();

		System.out.println("Value of a before swapping is "+a);
		System.out.println("Value of b before swapping is "+b);


		int c=a;
		a=b;
		b=c;

		System.out.println("Value of a after swapping is "+a);
		System.out.println("Value of b after swapping is "+b);

	}

}
