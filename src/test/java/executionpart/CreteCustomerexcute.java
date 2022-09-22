package executionpart;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageobject.CreateCustomer;

public class CreteCustomerexcute extends Baseclass {
	 CreateCustomer cc= new CreateCustomer(driver);
@Test
public void test2() throws InterruptedException {
	System.err.println("usha");
	cc.getClickontasks().click();
	cc.getClickonadd_new().click();
	Thread.sleep(3000);
	List<WebElement> list=cc. getListofalldropdown();
	Thread.sleep(3000);
	for(WebElement ele:list) {
		System.out.println(ele.getText());
	}
	cc.getClickon_createcustiomer().click();
	cc.getClickon_createcustiomer().sendKeys("tasks");
	cc.getClickon_discritiontextbox().click();
	cc.getClickon_discritiontextbox().sendKeys("this is discription");
	cc.getClickon_dropdown().click();
	cc.getClickon_firstcompany().click();
	cc.getClickon_createcustiomer().click();
	
	
}
}
