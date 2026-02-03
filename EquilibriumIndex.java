//given an array element count no.of equilibrium index ,an index is said to be equilibrium 
//if sum of all element left of ith index is equal to sum of all the elements right  of ith index.
//note:-if i==0 then leftsum==0 and i==n-1 then rightsum =0

package dsa2026;
import java.util.Scanner;
public class EquilibriumIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("size of an array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = arr[i]+prefix[i-1];
        }
        int count = 0;
       
        for (int i = 0; i < n; i++) {
        	int leftSum;
            
        	if (i == 0) {
        	    leftSum = 0;
        	} else {
        	    leftSum = prefix[i - 1];
        	}
        int rightSum = prefix[n - 1] - prefix[i];
        if (leftSum == rightSum) {
            count++;
            System.out.println("Equilibrium Index: " + i);
        }
    }

    System.out.println("Total number of equilibrium indices = " + count);
}


	}


