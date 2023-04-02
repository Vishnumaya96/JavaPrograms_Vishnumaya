package Programs;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		int len=str1.length();
		for(int i=len-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}

	}

}
