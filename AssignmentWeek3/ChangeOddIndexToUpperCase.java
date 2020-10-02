package AssignmentWeek3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
	String str = "changeme" ;
		
		
	       char[] ch = str.toCharArray();
	       
	       for (int i = 0; i < ch.length; i++) {
	    	   
	    	   if (i%2==1)
	    	   {
	    		   System.out.print(Character.toUpperCase(ch[i]));
	    	   }
	    	   else
	    	   {
	    		   System.out.print(ch[i]);
	    	   }
			
		}
	}
	

}
