package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import util.GlobalContext;

public class LoginPage {
	
	GlobalContext deps;
	
	public LoginPage(GlobalContext deps) {
		this.deps = deps;
	}
	
	
	@FindBy(name = "userName")
	@CacheLookup
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "login")
	WebElement login;

	
	//Actions
	public String validateTitleLogin() {

		System.out.println("title LoginPage: "+deps.getDriver().getTitle());
		return deps.getDriver().getTitle();
	}
}
