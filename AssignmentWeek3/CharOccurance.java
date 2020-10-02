package AssignmentWeek3;

public class CharOccurance {
	
	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		
		int count = 0;
		
	 char ch = 'n' ;
		
	 
	 char[] charArray = str.toCharArray();
		
	 for (int i = 0; i <str.length() ; i++) {
			
			if (charArray[i] == ch) {
				
				count++ ;
			}
			
		}
				
			System.out.println("the no of count is" + count);
			
		
			
			
		}
		
	}

