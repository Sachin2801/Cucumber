package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sachin Jathar\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		Thread.sleep(2000);

	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
		System.out.println(driver.getTitle());
	
	}
}
