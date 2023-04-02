package Programs;

import java.util.Scanner;

public class InputUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		float floatval;
		String str1;
		char ch;
		Double doub;

		System.out.println("Enter the integer number");
		num=sc.nextInt();

		System.out.println("Enter the float number");
		floatval=sc.nextFloat();


		System.out.println("Enter  the char");
		ch=sc.next().charAt(0);

		System.out.println("Enter the Double");
		doub=sc.nextDouble();

		System.out.println("Enter the string");
		str1=sc.next();

		System.out.println("Integer : "+num);
		System.out.println("Floatnum : "+floatval);
		System.out.println("String : "+str1);
		System.out.println("Character : "+ch);
		System.out.println("Double : "+doub);

	}

}
