package AssignmentsWeek2;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class EditPage {
	

			   public static void main (String[] args) throws InterruptedException {
				
			   WebDriverManager.chromedriver().setup();
					
					
					ChromeDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					
				    driver.get("http://leafground.com/pages/Edit.html") ;
				    
				    Thread.sleep(2000);
				    
				    driver.findElementById("email").sendKeys("bharadhsuraj@gmail.com");
                    Thread.sleep(1000);
                    
                    driver.findElementByXPath("//input[@value='Append ']").clear();
                    Thread.sleep(1000);
                    
                    driver.findElementByXPath("//input[@value='Append ']").sendKeys("Test Leaf");
                    Thread.sleep(1000);
                    
                    String attribute = driver.findElementByName("username").getAttribute("value");
                    {
                    	System.out.println(attribute);
                    }
                    
                    Thread.sleep(1000);
                    
                    boolean enabled2 = driver.findElementByName("username").isEnabled();
                    {
                    		System.out.println(enabled2);
                    }                   
                    driver.findElementByXPath("//input[@value='Clear me!!']").clear();
                    Thread.sleep(1000);
                    
                    boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
                    
                    System.out.println(enabled);
                    //if (enabled)
                    //{
                    	//System.out.println("The edit field is not disabled");
                    	
           
                    ////}
                    
                   //// else
                   // {
                   // 	System.out.println("The edit field is disabled");
                    }
                    
}
			  


