package testcasePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import applicationpages.Login;
import applicationpages.Logout;

public class TestFacebookLogin {
	
	@Test
	public void verifyLogin(){
		
		
		WebDriver driver=new FirefoxDriver();		
	
        Login po1=PageFactory.initElements(driver, Login.class);
        
        po1.openApplication("http://www.facebook.com");
        
        
        po1.loginFacebook("selenium", "asdsa");
        
        
        
        
        
        
        
        
        
        
        
        
//        po1.typeUsername("Selenium@gmail.com");
//        
//        po1.typePassword("asdasdas");
//        
//        po1.clickLoginButton();
//        
//        
//        Logout po2=PageFactory.initElements(driver, Logout.class);
//        
//        po2.clickOnLogout();
        
        
     //   po1.quitApplication();
		
		
	}

}
