package dsa2026;
import java.util.Scanner;
public class ColumnSumMatrix {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no. of rows:");
		int rows=sc.nextInt();
		System.out.println("enter the no.of columns:");
		int cols=sc.nextInt();
		int matrix[][]=new int[rows][cols];
		System.out.println("enter the matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]=sc.nextInt();
			}
	}
		int sum=0;
		for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
		
            System.out.println("Sum of column " + (j + 1) + " = "  + sum);
        
		}
	}

}
