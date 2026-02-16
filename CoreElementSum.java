package dsa2026;
import java.util.Scanner;
public class CoreElementSum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no. of rows:");
		int rows=sc.nextInt();
		System.out.println("enter the no.of columns:");
		int cols=sc.nextInt();
		int a[][]=new int[rows][cols];
		System.out.println("enter the matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=sc.nextInt();
			}
	}
		int sum=0;
		for(int i=0;i<rows;i++) {
        	for(int j=0;j<cols;j++) {
        		if(i!=0 && j!=0 && j!=2 && i!=2) {
        			sum+=a[i][j];
        		}

	}
        	
}
		System.out.println("Sum of frame elements = " + sum);

	}



	}


