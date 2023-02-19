package studentsAssignmets;

import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		int n=sc.nextInt();
		
		int sum=n*(n+1)/2;
		
		System.out.println("The sum of the first "+n+" positive integers="+sum);

	}

}
