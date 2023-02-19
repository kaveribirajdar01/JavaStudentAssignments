package studentsAssignmets;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
			
			float cel;
			double fahr;

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Temperature in Celsius :");
			cel=sc.nextInt();

			 fahr = (cel * 1.8 + 32);

			System.out.println("Converted Temperature in Fahrenheit: "+fahr);

	}

}
