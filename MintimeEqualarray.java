//given an integer array a of size n ,in one second u can increase the value of one element by one 
//.find the minimum time in seconds to make all element of the array equal
//observation=to minimise time to make all elements equal to the max element in the array;
// step1-find the max element in the array 
// step-2for every element calculate how much its need to be increase to reach the maximum.
//step3-sum all those differences.
package dsa2026;
import java.util.Scanner;
public class MintimeEqualarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of an array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];	
			}
		}
		int time=0;
		for(int i=0;i<a.length;i++) {
			time+=max-a[i];
		}
		System.out.println(time);
	}
	}


