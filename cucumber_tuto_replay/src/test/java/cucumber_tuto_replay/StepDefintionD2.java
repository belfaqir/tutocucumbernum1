package cucumber_tuto_replay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPage;

public class StepDefintionD2 {
	
//	WebDriver driver=getDriver();
//	public WebDriver getDriver() {
//		String projectPath=System.getProperty("user.dir"); 
//		String otherPath="/src/test/resources/Driver/chromedriver.exe";	
//		System.setProperty("webdriver.chrome.driver", projectPath + otherPath);
//		return driver=new ChromeDriver();
//	}
//
//	loginPage pagelogin = new loginPage(driver);
//
//
//	@Given("I m in the login page")
//	public void i_m_in_the_login_page() {
//		System.out.println("I m in the login page 4 testProject");
//		//				String projectPath=System.getProperty("user.dir"); 
//		//				String otherPath="/src/test/resources/Driver/chromedriver.exe";	
//		//				System.setProperty("webdriver.chrome.driver", projectPath + otherPath);
//		//				driver=new ChromeDriver();
//		//		driver.manage().window().maximize();
//		//		driver.navigate().to("https://example.testproject.io/");
//		pagelogin.get_page();
//
//
//	}
//
//	@When("i type {string} and {string}")
//	public void i_type_and(String user, String pass) throws InterruptedException {
//		System.out.println("I m in step: typing credentials");
//		//		driver.findElement(By.id("name")).sendKeys(user); 
//		//		driver.findElement(By.id("password")).sendKeys(pass); 
//
//		pagelogin.remplir_user(user);
//		pagelogin.remplir_pass(pass);
//		Thread.sleep(2000);
//	}
//
//
//	@When("i click on the {string}")
//	public void i_click_on_the(String button) {
//		System.out.println("I m in step: submitting");
//		//driver.findElement(By.id("login")).click(); 
//		pagelogin.submit();
//
//
//	}
//
//	@Then("I verify i am in the welcome page")
//	public void i_verify_i_am_in_the_welcome_page() {
//		System.out.println("I m in step: checking");
//		//		driver.getPageSource().contains("Hello name1");
//		//		driver.findElement(By.id("save"));
//		//		driver.close();
//		//		driver.quit();
//		pagelogin.check_content();
//	}
}
