package GITDemo;

public class demoGIT {

	@Test
	public void test1(){
		
		System.out.println("Hello GIT");
		System.out.println("Hello Selenium ")
	}
	@BeforeTest
	public void Asserttest2(){
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		String data_actual= driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/a")).getText();
		String data_execpted="Click to reset password";
		Assert.assertEquals(data_actual,data_execpted);
		driver.close();
		
	}
	
}
