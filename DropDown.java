package AssignmentsWeek2;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DropDown {

	
	                       public static void main (String[] args) throws InterruptedException {
						
					   WebDriverManager.chromedriver().setup();
							
							
							ChromeDriver driver = new ChromeDriver();
							
							driver.manage().window().maximize();
							
							
						    driver.get("http://leafground.com/pages/Dropdown.html") ;
						    
						    Thread.sleep(2000);
						    
						    WebElement index =  driver.findElementByXPath("//select[@id='dropdown1']");
						    Select dropdown1 = new Select (index);
						     
						    dropdown1.selectByIndex(3);
						    Thread.sleep(1000);
						    
						    
						    WebElement text =   driver.findElementByXPath("//select[@name='dropdown2']");
						    Select dropdown2 = new Select (text);
						     
						    dropdown2.selectByVisibleText("Appium");
						    Thread.sleep(1000);
						    
						    
						    WebElement value =   driver.findElementByXPath("//select[@name='dropdown3']");
						    Select dropdown3 = new Select (value);
						     
						    dropdown3.selectByValue("3");
						    Thread.sleep(1000);
						    
						    
						    WebElement number =   driver.findElementByXPath("//select[@class='dropdown']");
						    Select dropdown4 = new Select (number);
						     
						    List<WebElement> options = dropdown4.getOptions();
						    int size = options.size();
						    
						    System.out.println(size);
						    
						   
						    Thread.sleep(1000);
						    
						    
						    driver.findElementByXPath("(//section[@class='innerblock']//select) [5]").sendKeys("Appium");
						 
						    
						    Thread.sleep(1000);
						    
						    
						    
	                        WebElement select2 = driver.findElementByXPath("(//section[@class='innerblock']//select) [6]");
	                        Select dropdown5 = new Select(select2);
	                        dropdown5.selectByValue("2");
	                        dropdown5.selectByVisibleText("Selenium");
	                        
	
}
}