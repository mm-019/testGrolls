package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import io.cucumber.java.Before;

public class StepDefinitions {
	private WebDriver driver;

	@Given("I have opened the website")
	public void i_have_opened_the_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grolls.se/helags-t-shirt--svart1100099.html");
	}

	@Given("I have selected size XL in drop-down list")
	public void i_have_selected_size_xl_in_drop_down_list() {
		Select dropDown = new Select(driver.findElement(By.xpath("//*[@id=\"attribute400\"]")));
		dropDown.selectByValue("1420");
	}

	@When("I press Add to cart")
	public void i_press_add_to_cart() throws InterruptedException {
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.id("product-addtocart-button"));
		button.click();
	}

	@When("I also press cart")
	public void i_also_press_cart() throws InterruptedException {
		Thread.sleep(5000);
		WebElement cart = driver.findElement(By.xpath("/html/body/div[4]/header/div[3]/div[4]"));
		cart.click();
	}

	@Then("There should be {int} object in cart")
	public void there_should_be_object_in_cart(int result) throws InterruptedException {
		Thread.sleep(2000);
		WebElement items = driver.findElement(By.xpath(
				"/html/body/div[4]/header/div[3]/div[4]/div/div/div/div[2]/div[4]/div/ol/li/div/div/div[3]/div[2]/input"));

		assertEquals(String.valueOf(result), items.getAttribute("value"));
		driver.close();
	}

}
