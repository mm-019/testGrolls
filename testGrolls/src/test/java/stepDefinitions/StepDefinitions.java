package stepDefinitions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.Before;

public class StepDefinitions {
	private WebDriver driver;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grolls.se/helags-t-shirt--svart1100099.html");
		
		
		
		
		
//		@Given("I have entered {double} into the calculator")
//		public void i_have_entered_into_the_calculator(double num1) {
//			WebElement inputBox1 = driver.findElement(By.xpath(
//					"/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[1]/input"));
//			inputBox1.sendKeys(String.valueOf(num1));
//		}
		
	}
}
