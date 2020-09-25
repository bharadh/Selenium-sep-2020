package AssignmentsWeek2;


import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ButtonPage {
	       
	       
	       public static void main (String[] args) throws InterruptedException {
					
				   WebDriverManager.chromedriver().setup();
						
						
						ChromeDriver driver = new ChromeDriver();
						
						driver.manage().window().maximize();
						
						
					    driver.get("http://leafground.com/pages/Button.html") ;
					    
					    Thread.sleep(2000);
					    
					    driver.findElementByXPath("//button[@id='home']").click();
					    Thread.sleep(1000);
					    
					    
					    driver.findElementByXPath("//h5[text()='Button']").click();
					    Thread.sleep(1000);
					    
					    
					    Point location = driver.findElementByXPath("//button[@id='position']").getLocation();
					    {
					    System.out.println(location);
					    }
					    Thread.sleep(1000);
					    
					    String cssValue = driver.findElementById("color").getCssValue("background-color");
					    {
					    	System.out.println(cssValue);
					    }
					    Thread.sleep(1000);

					    int height = driver.findElementById("size").getSize().getHeight();
					    {
					    	System.out.println(height);
					    }
					    Thread.sleep(1000);
					    
					    driver.close();
					    
					    
					    
					    
					    

}
}