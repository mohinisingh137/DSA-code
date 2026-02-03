//Given an array of integers nums, calculate the pivot index of the array.
//The pivot index is the index where the sum of the numbers strictly to the 
//left of the index is equal to the sum of the numbers strictly to the right of the index.
//If the pivot index is at the left edge of the array, then the left sum is considered as 0 because
//there are no elements to the left of the index.Similarly, if the pivot index is at the right edge of the array, 
//then the right sum is considered as 0.Return the leftmost pivot index if such an index exists.
//If no pivot index exists, return -1.
package dsa2026;
import java.util.Scanner;
public class PivotIndexPrefix {
	public static int main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nums[]=new int[5];
		System.out.println("enter the elements in array:");
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextInt();
		}
		int n=nums.length;
		int[]p =new int[n];
		p[0]=nums[0];
		for(int i=1;i<n;i++) {
			p[i]=nums[i]+p[i-1];
		}
		for(int i=0;i<n;i++) {
			int leftsum;
			if(i==0) 
				leftsum=0;
			 else 
				leftsum=p[i-1];
			int rightsum=p[n-1]-p[i];
			if(leftsum==rightsum) {
				return i;
			}
			}
		return -1;
		
		}
		
		

	}



