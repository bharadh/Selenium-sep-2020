package AssignmentWeek3;

public class SumOfDigits {

	public static void main(String[] args) {
	
		int sum=0;
		String str1 = "Tes12Le79af65";
		
	   char[] ch= str1.toCharArray();
	    
	 
	   for (int i = 0; i < ch.length; i++)
		   
		   if(Character.isDigit(ch[i])) 
		   {
			   
			   sum= sum+Character.getNumericValue(ch[i]) ;
			   
		
	}
	   System.out.println(sum);
		   
		
	}
	
	 
	 
	}

