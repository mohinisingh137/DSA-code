package dsa2026;
import java.util.Scanner;
public class pairexistsArray {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int arr[] = new int[n];

		    System.out.println("enter the elements of an array:");
		     for(int i = 0; i < n; i++) {
		         arr[i] = sc.nextInt();
		        }
		        System.out.println("enter the value of k:");
		        int k = sc.nextInt();
		        boolean found = false;
		        for(int i = 0; i < n; i++) {
		            for(int j = i + 1; j < n; j++) {
		                if(arr[i] + arr[j] == k) {
		                    found = true;
		                    break;
		                }
		            }
		        }

		        if(found)
		            System.out.println("yes");
		        else
		            System.out.println("no");
		    }
		}
