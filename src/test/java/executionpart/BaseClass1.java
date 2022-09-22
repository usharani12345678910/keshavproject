package executionpart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	 public  WebDriver driver;
	@BeforeClass
	public void beforeclass() {
		//WebDriverManager.firefoxdriver().setup();

		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRAVEENA\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
 ChromeOptions options=new ChromeOptions();
 options.setAcceptInsecureCerts(true);		
 driver=new ChromeDriver(options);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
	   js1.executeScript("window.scrollBy(0,500);", "");

	//driver.findElement(By.id("mobileNumberPass")).sendKeys("8333898571");
	//driver.findElement(By.xpath("//input[@class='form-control has-feedback']")).sendKeys("usharani1@A");
	//driver.findElement(By.xpath("//button[@class='btn primary  lg block submitButton']")).click();
	
	
}
	@Test
	public void test1() throws InterruptedException {
		//Click on  category and select the one item of product list
		Actions act=new Actions(driver);
		//act.moveToElement(driver.findElement(By.linkText("Mobiles"))).click().build().perform();
		//driver.findElement(By.xpath("//span[text()='Samsung']/../../..//i[@class='a-icon a-icon-checkbox']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung m 31");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Actions act1=new Actions(driver);
		//act1.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
	List<WebElement>	list=driver.findElements(By.tagName("a"));
	
	System.out.println(list.size());
	for(int i=1;i<=list.size();i++) {
	WebElement 	a=list.get(i);
	String		te=a.getText();
	System.out.println(te);
		}
	}
	
}

