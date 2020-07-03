package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class GlobalContext {
	
	private WebDriver driver;

	
	@Before()
    public void init() throws Exception {
		//check browser and load needed driver
		System.out.println("In given 3");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
      
    }

    public WebDriver getDriver() {
        return driver;
    }

    @After()
    public void destruct() {
        driver.close();
        driver.quit();
    }

}
