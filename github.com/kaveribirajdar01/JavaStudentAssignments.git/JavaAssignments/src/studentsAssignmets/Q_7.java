package studentsAssignmets;

import java.util.Scanner;

public class Q_7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println ("Enter your number of Widgets: ");
		int widgets=sc.nextInt();
		
		System.out.println ("Enter your number of Gizmos: ");
		int gizmos=sc.nextInt();
		
		int weightofWidgets=widgets*75;
		int weightofGizmos=gizmos*112;
		
		int totalWeight=weightofWidgets+weightofGizmos;
		
		System.out.println ("The total weight of the order = "+totalWeight+" grams");
	}

}
