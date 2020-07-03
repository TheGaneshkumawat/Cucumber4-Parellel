# Cucumber4-Parellel

Without using @Before Annotation

public class GlobalContext {
	private boolean driverInitialized = false;
	private WebDriver driver;

	
	@Before()
    public void init() throws Exception {
		//check browser and load needed driver
		
      
    }

    public WebDriver getDriver() {
    	if(!driverInitialized) {
    		System.out.println("Launching browser");
    		System.setProperty("webdriver.chrome.driver",
    				System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
    		driver = new ChromeDriver();
    		driverInitialized =true;
    	}
    	
        return driver;
    }

    @After()
    public void destruct() {
        driver.close();
        driver.quit();
    }

}
