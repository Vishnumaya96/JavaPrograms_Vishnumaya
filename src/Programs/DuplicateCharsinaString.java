package Programs;

import java.util.Scanner;

public class DuplicateCharsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		String str2=str1.toUpperCase(); 
		
		System.out.println("Duplicate characters are ");
		int count=0;
		
		for(int i=0;i<str1.length();i++) {
			for(int j=i+1;j<str1.length();j++) {
				if(str2.charAt(i)==str2.charAt(j)) {
					System.out.println(str1.charAt(i));
					count++;
					break;
				}
			}
		}
		
		System.out.println("the number of characters which is repeated is "+count);
	}

}
