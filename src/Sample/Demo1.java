package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException 
    {
	  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");	
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.google.com/");
      
      Thread.sleep(3000);
      driver.quit();
      
    }


}
