package week1.day1;

import java.util.Arrays;

public class SecondLargest {
	
	public static void main (String[] args) {
		
		int[] a = {22, 24, 16, 99, 56};
		
	
	
	Arrays.sort(a) ;
	
	int size = a.length ;
	
	System.out.println(a[size-2]);
	
	

}
}
