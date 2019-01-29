package India.TestPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import India.TestPOM.*;

public class NewTest {
  WebDriver driver;
	@Test
  public void f() throws InterruptedException {
		
		
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Muthukumar\\Downloads\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.get("https://www.hackerrank.com/dashboard");
		  driver.manage().window().maximize();
		  POM_Class p=new POM_Class();
		  driver.findElement(p.Login_Button).click();
		  Thread.sleep(2000);
		  driver.close();
  }
}
