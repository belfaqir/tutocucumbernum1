package cucumber_tuto_replay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionG {

	WebDriver driver=null; 

	@Given("i am in welcome page du site de recherche google")
	public void i_am_in_welcome_page_du_site_de_recherche_google() {
		String projectPath=System.getProperty("user.dir"); 
		String otherPath="/src/test/resources/Driver/chromedriver.exe";
		//System.out.println("the projectPath is :" + projectPath);
		// System.setProperty("webdriver.chrome.driver", "C:/spacework/cucumber_tuto_replay/src/test/resources/Driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", projectPath + otherPath);
		System.out.println("i am in welcome page du site de recherche google");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.fr");

		//driver.findElement(by.name("q").sendKeys)

	}


	@When("I input {string} into input field")
	public void i_input_into_input_field(String string) {
		System.out.println("when I input text into input field");
		driver.findElement(By.name("q")).sendKeys("belfaqir");   
	}
	@And("clicks on submit button")
	public void clicks_on_submit_button() throws InterruptedException {
		System.out.println("and clicks on submit button");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);  
		Thread.sleep(5000);
	}

	@Then("I check results")
	public void i_check_results() {
		System.out.println("then i can check results");
		driver.getPageSource().contains("belfaqir");
		driver.close();
		driver.quit();

	}

}
