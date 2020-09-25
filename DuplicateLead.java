package AssignmentsWeek2;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DuplicateLead {

			   public static void main (String[] args) throws InterruptedException {
				
			   WebDriverManager.chromedriver().setup();
					
					
					ChromeDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					
				    driver.get("http://leaftaps.com/opentaps/control/main") ;
				    
				    Thread.sleep(1000);
				    
				    
				    driver.findElementById("username").sendKeys("demosalesmanager");
				   
				   Thread.sleep(1000);
				    
				    
				   driver.findElementByName("PASSWORD").sendKeys("crmsfa");
				   
				   Thread.sleep(1000);
				   
				   
				   driver.findElementByClassName("decorativeSubmit").click();
				   
				   Thread.sleep(1000);
				   
				   driver.findElementByLinkText("CRM/SFA").click();
				   
				   
				  Thread.sleep(1000);

				  
				  driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
				  Thread.sleep(1000);
				  
				  driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
				  Thread.sleep(1000);
				  
				  driver.findElementByXPath("//span[text()='Email']").click();
				  Thread.sleep(1000);
				  
				  driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc");
				  Thread.sleep(1000);
				  
				  driver.findElementByXPath("//button[text()='Find Leads']").click();
				   Thread.sleep(1000);
				  
				  
				   String text = driver.findElementByXPath("(//a[text()='poonguzhali']) [2]").getText();
					 {
						 System.out.println(text);
					 }
					 
					 driver.findElementByXPath("(//a[text()='poonguzhali']) [2]").click();
					 Thread.sleep(1000);
					 
					 
					 driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		             Thread.sleep(1000); 
		              
		             String title = driver.getTitle();
		             {
		            	 System.out.println(title);
		             }
		              
		             Thread.sleep(1000);
		             
		             driver.findElementByXPath("//input[@class='smallSubmit']").click();
		             Thread.sleep(1000);
		             
		             
		              String text2 = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		              {
		            	  System.out.println(text2);
		              }
		             if (text2.equals(text))
		             {
		            	 System.out.println("Duplicated name is same as captured name");
		             }
		             
		             else
		             {
		            	 System.out.println("Duplicated name is not same as captured name");
		             }
		             
		             Thread.sleep(1000);
		             
		             driver.close();
		
					 
}
}