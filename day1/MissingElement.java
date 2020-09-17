package week1.day1;

import java.util.Arrays;

public class MissingElement {
	
	public static void main (String[] args) {
		
		int[] a = {1,2,3,4,5,6,8};
		
		Arrays.sort(a) ;
		
		int n= a.length+1 ;
		int sum = n*(n+1)/2 ;
		
		int res = 0;
		
		for(int i=0; i<a.length; i++) {
			
			res = res + a[i] ;
			
			}
		int missingNumber = sum-res ;
		
		System.out.println("missing number is" +missingNumber);
		
		
	
	}
}
