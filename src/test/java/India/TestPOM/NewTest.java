package India.TestPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import India.TestPOM.*;

public class NewTest {
  WebDriver driver;
	@Test
  public void f() throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Muthukumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.hackerrank.com/dashboard");
		  driver.manage().window().maximize();
		  POM_Class p=new POM_Class();
		  driver.findElement(p.Login_Button).click();
		  Thread.sleep(2000);
		  driver.close();
  }
}
