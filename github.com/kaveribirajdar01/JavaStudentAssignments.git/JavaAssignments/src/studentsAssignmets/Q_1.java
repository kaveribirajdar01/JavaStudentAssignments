package studentsAssignmets;

import java.util.Scanner;

public class Q_1 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of n1:");
		int n1=sc.nextInt();
		
		System.out.println("Enter value of n2:");
		int n2=sc.nextInt();
		
		System.out.println("\n Value Before Exchanging");  
		   
		  System.out.println("value of n1=" + n1);  
		  System.out.println("value of n2=" + n2); 
		  
		  System.out.println("\n Value After Exchanging");  
		  n1 = n1 + n2;  
		  n2 = n1 - n2;  
		  n1 = n1 - n2;  
		  System.out.println("value of n1=" + n1);  
		  System.out.println("value of n2=" + n2); 

	}

}
