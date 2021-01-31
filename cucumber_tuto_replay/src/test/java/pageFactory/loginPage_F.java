package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_F {
	@FindBy(id="name")
	WebElement txt_username;
	@FindBy(id="password")
	WebElement txt_password;
	@FindBy(id="login")
	WebElement btn_login;
	WebDriver  driver;
	public loginPage_F(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getPage() {
//		String projectPath=System.getProperty("user.dir"); 
//		String otherPath="/src/test/resources/Driver/chromedriver.exe";	
//		System.setProperty("webdriver.chrome.driver", projectPath + otherPath);
//		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://example.testproject.io/");
		System.out.println("chui le bon driver");
	}
	
	public void typeUser(String user) {
		System.out.println(" the user is:  "+ user);
		System.out.println(" the user is:  "+ txt_username.getText());
		txt_username.sendKeys(user);
	}
	public void typePass(String pass) {
		txt_password.sendKeys(pass);
	}
	public void submitt() {
		btn_login.click();
	}
	public void checkContent(String s, String b) {
		driver.getPageSource().contains(s);
		driver.findElement(By.id(b));
		
	}

}
