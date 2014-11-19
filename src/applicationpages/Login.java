package applicationpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver ldriver){
		this.driver=ldriver;
	}
	
	
	@FindBy(id="email")
	WebElement username;
	
    @FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='loginbutton']")
	WebElement loginbutton;
	
	public void openApplication(String url){
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
    public void quitApplication(){
		driver.quit();
    }

    
    public void loginFacebook(String uname,String pass){
    	username.sendKeys(uname);
    	password.sendKeys(pass);
        loginbutton.click();
    	
    }
    
	public void typeUsername(String uname){
		username.sendKeys(uname);
	}
	
public void typePassword(String pass){
		
	password.sendKeys(pass);
	
	}

public void clickLoginButton(){
	
	loginbutton.click();
}

}
