package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import executionpart.Baseclass;

public class Login  {
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username") WebElement usernametextb0x;
	@FindBy(name="pwd") WebElement passwordtextbox;
	@FindBy(id="loginButton") WebElement loginbutton;
	
	
	
	
	public WebElement getUsernametextb0x() {
		return usernametextb0x;
	}
	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
}
