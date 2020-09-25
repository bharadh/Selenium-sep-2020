package AssignmentsWeek2;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HyperLink {


                      public static void main (String[] args) throws InterruptedException {
						
					   WebDriverManager.chromedriver().setup();
							
							
							ChromeDriver driver = new ChromeDriver();
							
							driver.manage().window().maximize();
							
							
						    driver.get("http://leafground.com/pages/Link.html") ;
						    
						    Thread.sleep(2000);
						    
						   WebElement homepage = driver.findElementByXPath("(//a[text()='Go to Home Page']) [1]");
						   homepage.click();
						    Thread.sleep(1000);
						    
						    driver.findElementByXPath("//img[@alt='Link']").click();
						    Thread.sleep(1000);
						    
						 String attribute =    driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href"); 
						 System.out.println(attribute);   
						 Thread.sleep(1000);
						    
						String attribute2 = driver.findElementByXPath("//a[text()='Verify am I broken?']").getAttribute("href");
						 System.out.println(attribute2);
						 Thread.sleep(1000);
						 
						 
						 driver.findElementByXPath("(//a[text()='Go to Home Page']) [1]").click();
						 Thread.sleep(1000);
						   
						   
						   driver.close();
						    
						    
	
}
}
		              
