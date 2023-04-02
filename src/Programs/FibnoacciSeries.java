package Programs;

import java.util.Scanner;

public class FibnoacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the series that you want to display");
		int len=sc.nextInt();
		
		System.out.println("The series is ");
		System.out.print(a+" "+b+" ");
		
		for(int i=3;i<=len;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}

}
