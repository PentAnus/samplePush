package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class searchHotel {
	
WebDriver driver;
	
	public searchHotel(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="location")WebElement Uselect;
	@FindBy(id="Submit")WebElement Usearch;
	
	public void selectLocation(String location) {
		WebElement location_dropdown = Uselect;
		Select loc_dropdown = new Select(location_dropdown);
		loc_dropdown.selectByVisibleText(location);
	}
	public void clickSearch() {
		Usearch.click();
	}
}
