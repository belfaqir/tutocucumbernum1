package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	public WebDriver driver1; 
	
	public loginPage(WebDriver driver) {
		this.driver1=driver;
	}
	
	By txt_username=By.id("name");
	By txt_password=By.id("password");
	By btn_login=By.id("login");
	//	By btn_login=(By) driver.findElement(By.id("login"));
	public void get_page() {
//		String projectPath=System.getProperty("user.dir"); 
//		String otherPath="/src/test/resources/Driver/chromedriver.exe";	
//		System.setProperty("webdriver.chrome.driver", projectPath + otherPath);
//		driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.navigate().to("https://example.testproject.io/");
	}
	
	public void check_content() {
		driver1.getPageSource().contains("Hello name1");
		driver1.findElement(By.id("save"));
		driver1.close();
		driver1.quit();

	}
	public void remplir_user(String user) {
		driver1.findElement(txt_username).sendKeys(user);
	}
	public void remplir_pass(String pass) {
		driver1.findElement(txt_password).sendKeys(pass);
	}
	public void submit() {
		driver1.findElement(btn_login).click();;
	}
	//	public void check() {
	//		driver.findElement(btn_login).click();;
}

