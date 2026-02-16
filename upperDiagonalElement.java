package dsa2026;
import java.util.Scanner;

public class upperDiagonalElement {

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
		 System.out.println("Matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(a[i][j] + " ");
	            }
	        }
	        int sum=0;
	        System.out.println("sum of upper diagonal matrix:");
	        for(int i=0;i<rows;i++) {
	        	for(int j=0;j<cols;j++) {
	        		if(i<j) {
	        			System.out.print(a[i][j] + " ");
	                    sum += a[i][j];
	        		}
	        	}
	        }
	        System.out.println("Sum of upper diagonal elements = " + sum);

	}

}
