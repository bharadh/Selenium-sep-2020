package week2.day1;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AssigmentWeek2Day1 {
		
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
	
		  driver.findElementByLinkText("Leads").click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElementByLinkText("Create Lead").click();
		  
		  Thread.sleep(2000);
		  
		  driver.findElementById("createLeadForm_companyName").sendKeys("Test leaf");
		  
		  Thread.sleep(2000);
		  
		  driver.findElementById("createLeadForm_firstName").sendKeys("Bharadhwaj");
		  
		  
		  Thread.sleep(2000);
		  
		  driver.findElementById("createLeadForm_lastName").sendKeys("sudarsanan");
		   
		  Thread.sleep(2000);
		  
		 WebElement source = driver.findElementById("createLeadForm_dataSourceId"); 
		  
		 Select dropdown = new Select (source);
		 
	     dropdown.selectByVisibleText("Employee");
	     
	     Thread.sleep(2000);
	     
	     
	     WebElement marketingCampign = driver.findElementById("createLeadForm_marketingCampaignId"); 
	     
	     Select dropdown1 = new Select(marketingCampign) ;
	     
	     dropdown1.selectByValue("9001");
		    
	     Thread.sleep(2000);
	     
	     
	     WebElement industry = driver.findElementById("createLeadForm_industryEnumId") ;
	     
		 Select dropdown2 = new Select (industry) ;
		    
		 List<WebElement> options = dropdown2.getOptions();
		 int size = options.size() ;
		 dropdown2.selectByIndex(size-2);
		 
		    
		    
		    WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId") ;
		     
		    Select dropdown3 = new Select (ownership) ;
		    
		    dropdown3.selectByIndex(2);
		    
		    Thread.sleep(2000);
		    
		    
		    WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId") ;
		     
		    Select dropdown4 = new Select (country) ;
		    
		    dropdown4.selectByVisibleText("India");
		    
		    Thread.sleep(2000);
		    
		    
		    driver.findElementByName("submitButton").click();
		    
		    Thread.sleep(2000);
		    
		     String Title = driver.getTitle();
		     
		     System.out.println(Title);
		}
		
		
		
		

	}


