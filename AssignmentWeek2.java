package AssignmentsWeek2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentWeek2 {
	
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
		  Thread.sleep(2000);
		  
		  driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
		  Thread.sleep(2000);
		  
		  driver.findElementByXPath("(//input[@name='firstName']) [3]").sendKeys("karthik");
		  Thread.sleep(2000);
		  
		  driver.findElementByXPath("//button[text()='Find Leads']").click();	
		  Thread.sleep(2000);
		  
		  
		  driver.findElementByXPath("(//a[@class='linktext']) [4]").click();
		  Thread.sleep(2000);
		  
		  String title = driver.getTitle();
		  System.out.println(title);
		  
		  driver.findElementByXPath("(//a[@class='subMenuButton']) [3]").click();
		  Thread.sleep(2000);
		  
		  Actions a = new Actions(driver);
		  WebElement companyName = driver.findElementByXPath("(//input[@name='companyName']) [2]");
		  a.doubleClick(companyName).perform();
		  
		  driver.findElementByXPath("(//input[@name='companyName']) [2]").sendKeys("CTS");
		  Thread.sleep(2000);
          
		  driver.findElementByXPath("(//input[@class='smallSubmit']) [1]").click();
		  
		  boolean displayed = driver.findElementByXPath("//span[contains(text(), 'CTS')]").isDisplayed();
		  
		  if (displayed)
		  {
			  System.out.println("The change name is appeared");
		  }
		  
		  else
			  
		  {
			  System.out.println("The change is not appeared");
		  }
		  
Thread.sleep(2000);
		  
		 driver.close();
			 
			  
		  
		  
}
}
