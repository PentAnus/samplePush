package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
	
	WebDriver driver;	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(id="username")WebElement Uname;
	@FindBy(id="password")WebElement Upassword;
	@FindBy(id="login")WebElement Ulogin;
	
//	@FindBys({@FindBy(id="username")WebElement Uname,@FindBy(id="password")WebElement Upassword,@FindBy(id="login")WebElement Ulogin});
	
	public void Username(String username) {
		Uname.sendKeys(username);
	}
	public void Password(String pass) {
		Upassword.sendKeys(pass);
	}
	public void clickLogin() {
		Ulogin.click();
	}

}
