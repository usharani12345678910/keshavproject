package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import executionpart.Baseclass;



public class CreateCustomer  {
	public CreateCustomer(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[div[text()='Tasks']]") WebElement clickontasks;
		@FindBy(xpath="//div[text()='Add New']") WebElement clickonadd_new;
		@FindBy(xpath="//div[@class='dropdownContainer addNewMenu']") List<WebElement> listofalldropdown ;
		@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement ClickonNEw_customer;
		@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']") WebElement clickoncustomertextbox;
		@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Enter Customer Description']") WebElement clickon_discritiontextbox;
		@FindBy(xpath="//div[div[@class='customerImportDivTitle']]/..//div[@class='dropdownButton']") WebElement clickon_dropdown;
		@FindBy(xpath="(//div[@class='searchItemList']//following-sibling::div)[1]") WebElement clickon_firstcompany;
@FindBy(xpath="//div[text()='Create Customer']") WebElement  Clickon_createcustiomer;


	 public WebElement getClickontasks() {
		return clickontasks;
	}
	public WebElement getClickonadd_new() {
		return clickonadd_new;
	}
	public List<WebElement> getListofalldropdown() {
		return listofalldropdown;
	}
	public WebElement getClickonNEw_customer() {
		return ClickonNEw_customer;
	}
	public WebElement getClickoncustomertextbox() {
		return clickoncustomertextbox;
	}
	public WebElement getClickon_discritiontextbox() {
		return clickon_discritiontextbox;
	}
	public WebElement getClickon_dropdown() {
		return clickon_dropdown;
	}
	public WebElement getClickon_firstcompany() {
		return clickon_firstcompany;
	}
	public WebElement getClickon_createcustiomer() {
		return Clickon_createcustiomer;
	}
	

}


