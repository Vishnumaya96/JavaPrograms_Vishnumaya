package Programs;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0) {
				flag=1;
				System.out.println(num+" is not a prime number");
				break;
			}
		}

		if(flag==0)
			System.out.println(num+" is a prime number");
	}

}
