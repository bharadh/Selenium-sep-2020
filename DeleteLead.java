package AssignmentsWeek2;


import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

		   public static void main (String[] args) throws InterruptedException {
			
		   WebDriverManager.chromedriver().setup();
				
				
				ChromeDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				
			    driver.get("http://leaftaps.com/opentaps/control/main") ;
			    
			    Thread.sleep(2000);
			    
			    
			    driver.findElementById("username").sendKeys("demosalesmanager");
			   
			   Thread.sleep(2000);
			    
			    
			   driver.findElementByName("PASSWORD").sendKeys("crmsfa");
			   
			   Thread.sleep(2000);
			   
			   
			   driver.findElementByClassName("decorativeSubmit").click();
			   
			   Thread.sleep(2000);
			   
			   driver.findElementByLinkText("CRM/SFA").click();
			   
			   
			  Thread.sleep(2000);

			  
			  driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
			  Thread.sleep(1000);
			  
			  driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
			  Thread.sleep(1000);
			  
			  driver.findElementByXPath("//span[text()='Phone']").click();
			  Thread.sleep(1000);
			  
			  driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
			  Thread.sleep(1000);
			  
			  
			   driver.findElementByXPath("//button[text()='Find Leads']").click();
			   Thread.sleep(2000);
			 
			 String text = driver.findElementByXPath("//a[text()='10340']").getText();
			 {
				 System.out.println(text);
			 }
			 
			 Thread.sleep(1000);
			 
             driver.findElementByXPath("//a[text()='10340']").click();
             Thread.sleep(1000);
             
             driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
             Thread.sleep(1000);
             
			  driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
              Thread.sleep(1000);        
              
              driver.findElementByXPath("//input[@name='id']").sendKeys("10340");
              Thread.sleep(1000);
              
              
              driver.findElementByXPath("//button[text()='Find Leads']");
 			 Thread.sleep(2000);
              
                 	
              boolean displayed = driver.findElementByXPath("//div[@id='ext-gen304']//div").isDisplayed();
                 	
              if (displayed)
    		  {
    			  System.out.println("The record is successfully is deleted");
    		  }
    		  
    		  else
    			  
    		  {
    			  System.out.println("The records is displayed");
    		  }
    		  
    Thread.sleep(2000);
    		  
    		 driver.close();
    			 
}
}



