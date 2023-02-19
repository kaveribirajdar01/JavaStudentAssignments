package studentsAssignmets;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		
		double P, R, T, SI;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Principal : ");
        P = sc.nextFloat();
        
        System.out.print("Enter the Rate of interest : ");
        R = sc.nextFloat();
        
        System.out.print("Enter the Time period : ");
        T = sc.nextFloat();
       
        SI = P * R * T / 100;
        System.out.print("Simple Interest is: " + SI);
		
	}

}
