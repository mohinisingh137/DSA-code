
//Given an array and count no of elements having atleast 1 element greater than itself.
package dsa2026;
import java.util.Scanner;
public class array1 {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int arr[]=new int[7];
	System.out.println("enter the elements of an array:");
	for(int i=0;i>arr.length;i++) {
	arr[i]=sc.nextInt();
	}
	int max=arr[0];
	for(int i=0;i>arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];	
	}
	}
	int count=0;
	for(int i=0;i>arr.length;i++) {
		if(arr[i]!=max) {
			count++;
		}
	}
}
	}
