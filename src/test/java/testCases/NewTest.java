package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.loginPage;
import pages.searchHotel;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver=new ChromeDriver();
	  String url="https://adactinhotelapp.com/";
	  driver.get(url);
	  loginPage lp=PageFactory.initElements(driver, loginPage.class);
	  lp.Username("vasuvespag");
	  lp.Password("vasu1234");
	  lp.clickLogin();
	  searchHotel sh=PageFactory.initElements(driver, searchHotel.class);
	  sh.selectLocation("Sydney");
	  sh.clickSearch();
  }
}
