package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;

public class LoginPage extends Baseclass {

	@FindBy(name = "email")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginbutton;

	public LoginPage() {
		try {
			PageFactory.initElements(driver, this);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void usernameEnter(String uname) {
		username.sendKeys(uname);
	}

	public void passEnter(String pass) {
		password.sendKeys(pass);
	}

	public void clickonLoginbutton() {
		loginbutton.click();
	}

}
