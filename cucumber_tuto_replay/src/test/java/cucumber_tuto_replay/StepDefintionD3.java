package cucumber_tuto_replay;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.loginPage_F;

public class StepDefintionD3 {
	
	WebDriver driver;
//	public StepDefintionD3() {
//		String projectPath=System.getProperty("user.dir"); 
//		String otherPath="/src/test/resources/Driver/chromedriver.exe";	
//		System.setProperty("webdriver.chrome.driver", projectPath + otherPath);
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.navigate().to("https://example.testproject.io/");
//	}
//	WebDriver driver=getDriver();
	public WebDriver getDriver() {
		String projectPath=System.getProperty("user.dir"); 
		String otherPath="/src/test/resources/Driver/chromedriver.exe";	
		System.setProperty("webdriver.chrome.driver", projectPath + otherPath);
		return driver=new ChromeDriver();
	}

	loginPage_F pagelogin1 = new loginPage_F(getDriver());


	@Given("I m in the login page")
	public void i_m_in_the_login_page() {
		System.out.println("I m in the login page 4 testProject");
		pagelogin1.getPage();


	}

	@When("i type {string} and {string}")
	public void i_type_and(String user, String pass) throws InterruptedException {
		System.out.println("I m in step: typing credentials");
	pagelogin1.typeUser(user);
	pagelogin1.typePass(pass);
	
		Thread.sleep(2000);
	}


	@When("i click on the {string}")
	public void i_click_on_the(String button) {
		System.out.println("I m in step: submitting");
		pagelogin1.submitt();

	}

	@Then("I verify i am in the welcome page")
	public void i_verify_i_am_in_the_welcome_page() throws InterruptedException {
		System.out.println("I m in step: checking");
		String s="Hello name1";
		String b="save";
		pagelogin1.checkContent(s, b);
		Thread.sleep(2000);

	}
}
