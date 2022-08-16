package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addbtn;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtocart;
	
	public AddToCartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	public void addtocartbutton() {
		addtocart.click();
		}
	

}
