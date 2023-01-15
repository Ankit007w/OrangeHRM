package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {

	@FindBy(name = "username") private WebElement username;
	@FindBy(name = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath = "//img[@alt='company-branding']") private WebElement companyBrandingLogo;
	@FindBy(xpath = "//div[@class='orangehrm-login-logo']") private WebElement orangeHrmLoginLogo;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyURL()
	{
		return driver.getCurrentUrl();
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyCompanyBrandingLogo()
	{
		return companyBrandingLogo.isDisplayed();
	}
	
	public boolean verifyOrangeHrmLoginLogo()
	{
		return orangeHrmLoginLogo.isDisplayed();
	}
	
	public String loginToApp() throws Exception
	{
		username.sendKeys(ReadData.readPropertyFile("username"));
		password.sendKeys(ReadData.readPropertyFile("password"));
		loginBtn.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
	
}
