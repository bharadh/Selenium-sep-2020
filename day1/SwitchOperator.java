package week1.day1;

public class SwitchOperator {
	
	public static void main (String[] args) {
		
		int a = 2;
		int b = 3;
		int c ;
		
		String operator = "Add" ;
		
	switch (operator) {
	case "Add": c = a+b; 
	
	System.out.println(c);
	break;
	
	case "Sub" : c= b-a ;
	System.out.println(c);
		break;
		
	case "Mul" : c=a*b ;
	System.out.println(c);
	break;
	
	case "Div" : c= b/a ;
	System.out.println(c);
	break;
			
			

	default: System.out.println("Invalid operator");
		break;
	}
	}

}
