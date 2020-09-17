package week1.day1;

public class PrintDuplicates {
	
	public static void main (String[] args) {
		
		int[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20} ;
		
		      int size = a.length;
		      int count =0 ;
		      
		      for (int i =0 ; i< size ; i++) {
		    	  for (int b = i+1; b< size; b++) {
		    		  
		    		  if (a[i]==a[b])
		    		  {
		    			  System.out.println(a[b]);
		    	  }
		    		  
		      }
	}

}
}
