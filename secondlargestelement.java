package dsa2026;
import java.util.Scanner;
public class secondlargestelement {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("enter the  elements of an array:");
		for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];	
			}
		}
		
			int smax=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>smax && arr[i]!=max) {
					smax=arr[i];
				
			}
			}
				System.out.println(smax);
		}
		}
		
		

	


