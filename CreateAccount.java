package week2.day1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	
	public static void main (String[] args) throws InterruptedException {
	
					
			WebDriverManager.chromedriver().setup();
					
					
					ChromeDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					
				    driver.get("http://leaftaps.com/opentaps/control/main") ;
				    
				    Thread.sleep(2000);
				    
				    
				    driver.findElementById("username").sendKeys("demosalesmanager");
				   
				   Thread.sleep(4000);
				    
				    
				   driver.findElementByName("PASSWORD").sendKeys("crmsfa");
				   
				   Thread.sleep(4000);
				   
				   
				   driver.findElementByClassName("decorativeSubmit").click();
				   
				   Thread.sleep(4000);
				   
				   driver.findElementByLinkText("CRM/SFA").click();
				   
				   
				  Thread.sleep(2000);
			
		
				 driver.findElementByXPath("//a [@href= '/crmsfa/control/accountsMain']").click();
				 
				 Thread.sleep(2000);
				 
				 
				 driver.findElementByXPath("//a[text()='Create Account']").click();
				 
				 Thread.sleep(1000);
				 
				 
				 driver.findElementByXPath("//input[@id='accountName']").sendKeys("Debitlimitedaccount");
				 Thread.sleep(1000);
				 
				 driver.findElementByXPath("//textarea[@name='description']").sendKeys("Seleniumautomationtester");
				 Thread.sleep(1000);
				 
				 
				 driver.findElementByXPath("//input[@name='groupNameLocal']").sendKeys("Bharadhwaj");
				 Thread.sleep(1000);
				 
				 
				 driver.findElementByXPath("//input[@name='officeSiteName']").sendKeys("Bharadh");
				 Thread.sleep(1000);
	
				 driver.findElementByXPath("(//input[@class='inputBox']) [5]").sendKeys("100");
				 Thread.sleep(1000);
				 
				 
				 
				    WebElement industry =  driver.findElementByXPath("//select[@name='industryEnumId']");
				    Select dropdown = new Select (industry) ;
				    dropdown.selectByIndex(3);
				    Thread.sleep(2000);
				    
				    
				    WebElement ownership = driver.findElementByXPath("//select[@name='ownershipEnumId']");
				    Select dropdown1 = new Select (ownership) ;
				    dropdown1.selectByVisibleText("S-Corporation");
				    Thread.sleep(1000);
				    
				    
				    
				    WebElement source = driver.findElementByXPath("//select[@name='dataSourceId']");
				    Select dropdown2 = new Select (source);
				    dropdown2.selectByValue("LEAD_EMPLOYEE");
				    Thread.sleep(1000);
				    
				    
				    WebElement marketingcampign = driver.findElementByXPath("//select[@name='marketingCampaignId']");
				    Select dropdown3 = new Select (marketingcampign);
				    dropdown3.selectByIndex(6);
				    Thread.sleep(1000);
				    
				    
				    WebElement state = driver.findElementByXPath("//select[@name='generalStateProvinceGeoId']");
				    Select dropdown4 = new Select (state) ;
				    dropdown4.selectByValue("TX");
				    Thread.sleep(2000);
				    
				    driver.findElementByXPath("//input[@value='Create Account']").click();
				    
				
				    
	
	}
}
