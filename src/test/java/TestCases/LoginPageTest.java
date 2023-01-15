package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage login;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		Thread.sleep(2000);
		login = new LoginPage();
	}
	
	@Test (enabled=false)
	public void verifyURLTest()
	{
		String expRes = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actRes = login.verifyURL();
		Assert.assertEquals(actRes, expRes);
	}
	
	@Test (enabled=false)
	public void verifyTitleTest()
	{
		String expRes = "OrangeHRM";
		String actRes = login.verifyTitle();
		Assert.assertEquals(actRes, expRes);
	}
	
	@Test (enabled=false)
	public void verifyCompanyBrandingLogoTest()
	{
		boolean result = login.verifyCompanyBrandingLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test (enabled=false)
	public void verifyOrangeHrmLoginLogoTest()
	{
		boolean result = login.verifyOrangeHrmLoginLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test 
	public void loginToAppTest() throws Exception
	{
		String expRes = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actRes = login.loginToApp();
		Assert.assertEquals(expRes, actRes);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
}
