package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.GlobalContext;

public class firstClass {
	
	GlobalContext deps;
	
	public firstClass(GlobalContext deps) {
		this.deps = deps;
	}
	
	@Given("user is already on login page")
	public void user_is_already_on_login_page() throws InterruptedException {
		System.out.println("In given 1");
		/*
		 * WebDriver driver = null; System.setProperty("webdriver.chrome.driver",
		 * System.getProperty("user.dir") +
		 * "\\src\\main\\java\\resources\\chromedriver.exe"); driver = new
		 * ChromeDriver();
		 */
		deps.getDriver().get("https://cucumber.io/docs/guides/parallel-execution/");
		System.out.println("user_is_already_on_login_page: "+deps.getDriver().getTitle());
		//deps.setDriver(driver);
	}

	@When("title of the page is Google")
	public void title_of_the_page_is_Google() throws InterruptedException {
		System.out.println("In when 1");

		deps.getDriver().get("https://cucumber.io/docs/guides/parallel-execution/");
		System.out.println("title_of_the_page_is_Google: "+deps.getDriver().getTitle());
	}

	@Then("user closes the browser")
	public void user_closes_the_browser() throws InterruptedException {
		System.out.println("In then 1");
		Thread.sleep(1000);
	}

	@Given("user is already on login page 2")
	public void user_is_already_on_login_page_2() throws InterruptedException {
		System.out.println("In given 2");
//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://newtours.demoaut.com/");
		deps.getDriver().get("http://newtours.demoaut.com/");
	}

	@When("title of the page is Google 2")
	public void title_of_the_page_is_Google_2() throws InterruptedException {
		System.out.println("In when 2");
		Thread.sleep(1000);
	}

	@Then("user closes the browser 2")
	public void user_closes_the_browser_2() throws InterruptedException {
		System.out.println("In then 2");
		Thread.sleep(1000);
	}
}
