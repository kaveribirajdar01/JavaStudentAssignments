package studentsAssignmets;

import java.util.Scanner;

public class Q_5 {

	public static void main(String[] args) {
		
		double sqft_per_area=43560;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Length of the field in feet: ");
		double length=sc.nextInt();
		
		System.out.println("Enter the Width of the field in feet: ");
		double width=sc.nextInt();
		
		double acres=length*width/sqft_per_area;
		
		System.out.println("The area of the field is "+acres+ " acres"); 

	}

}
