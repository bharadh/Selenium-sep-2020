package AssignmentsWeek2;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class RadioButton {

	                     public static void main (String[] args) throws InterruptedException {
							
					     WebDriverManager.chromedriver().setup();
								
								
								ChromeDriver driver = new ChromeDriver();
								
								driver.manage().window().maximize();
								
								
							    driver.get("http://leafground.com/pages/radio.html") ;
							    Thread.sleep(2000);
							    
							    driver.findElementById("yes").click();
							    Thread.sleep(1000);
							    
							    
							  boolean selected = driver.findElementByXPath("(//input[@value='1']) [2]").isSelected();   
							  if (selected)
							  {
								  System.out.println("Radio button is checked");
								  
							  }
							  
							  else
							  {
								  System.out.println("Radio button is not checked");
							  }
							    Thread.sleep(1000);
							    
							    
							   boolean selected1 =  driver.findElementByXPath("(//input[@value='1']) [3]").isSelected();
							    if (selected1)
								  {
									  System.out.println("Radio button is checked");
									  
								  }
								  
								  else
								  {
									  System.out.println("Radio button is not checked");
								  }
								    Thread.sleep(1000);
								    
								    
								boolean selected3  =  driver.findElementByXPath("(//input[@value='0']) [3]").isSelected();
								System.out.println(selected3);
	 
	
}
}