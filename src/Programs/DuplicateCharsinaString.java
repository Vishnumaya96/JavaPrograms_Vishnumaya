package Programs;

import java.util.Scanner;

public class DuplicateCharsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		
		System.out.println("Duplicate characters are ");
		int count=0;
		char[] strArray=str1.toCharArray();
		for(int i=0;i<str1.length();i++) {
			for(int j=i+1;j<str1.length();j++) {
				if(strArray[i]==strArray[j]) {
					System.out.println(strArray[i]);
					count++;
					break;
				}
			}
		}
		
		System.out.println("the number of characters which is repeated is "+count);
	}

}
