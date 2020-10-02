package AssignmentWeek3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str = "stops" ;
		 
		String str1 = "potss" ;
		
		boolean status = false ;
		
		int length = str1.length();
		int length2 = str.length();

		if (length==length2)
		{
			System.out.println("The length of both strings are same");
		}
		
		else
		{
			System.out.println("The length of both strings are not same ");
		}
		
		
		 char[] ch = str.toCharArray() ;
		 char[] ch2 = str1.toCharArray() ;
		 
		 Arrays.sort(ch);
		 Arrays.sort(ch2);
		 
		 status = Arrays.equals(ch, ch2) ;
		 
		 System.out.println(status);
		 
		 
	}

}
