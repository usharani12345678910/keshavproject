package executionpart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageobject.Login;

public class Baseclass {
	readconfig read=new readconfig();
	public static WebDriver driver=null;
	public static Login login=null;
	
@BeforeClass
public void beforeclass() {
	//cross browser testing
	if(read.getdesiredbrowser().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",read.getchropath());
	 driver=new ChromeDriver();
	}
	else if(read.getdesiredbrowser().equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",read.getfirefoxpath());
 driver=new FirefoxDriver();
}
	else if(read.getdesiredbrowser().equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver",read.getiepath());
 driver=new  EdgeDriver();
}
	driver.get(read.geturl());

}
@BeforeMethod
public void Beforemethod() {
 login=new Login(driver);
 login.getUsernametextb0x().sendKeys(read.getusername());
 login.getPasswordtextbox().sendKeys(read.getpassword());
 login.getLoginbutton().click();
 
	
}

}
