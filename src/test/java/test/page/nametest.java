package test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nametest {
	private By homepagenamelocator = By.xpath("//div[@class='exehdj']");
	private By myprofilelocator = By.xpath("//div[contains(text(),'My Profile')]");
	private By getactuialnamelocator = By.xpath("//div[contains(text(),'Rutwik Kulkarni')]");
	private By becomesellerlocator = By.xpath("//span[contains(text(),'Become a Seller')]");
	private By middlenamelocator = By.xpath("//span[contains(text(),'Raju Lunawath')]");
	private By closeloginlocator = By.xpath("//button[@class='_2KpZ6l _2doB4z']");


	private WebDriver driver;

	public nametest(WebDriver driver) {
		this.driver = driver;
	}

	public void clickname() {
		driver.findElement(homepagenamelocator).click();
	}

	public void clickonmyprofile() {
		driver.findElement(myprofilelocator).click();
	}


	public String getmyname() {
		String actualname = driver.findElement(getactuialnamelocator).getText();
		return actualname;
		// TODO Auto-generated method stub

	}

	public void clickonbecomeseller() {
		driver.findElement(becomesellerlocator).click();
	}

	public void clickoncloselogin(){
		driver.findElement(closeloginlocator).click();
	}
	public String getmiddlemanname() {
		String actualname = driver.findElement(middlenamelocator).getText();
		return actualname;
	}
}
