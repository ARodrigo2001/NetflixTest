package driver;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	private static WebDriver mDriver;
	
    private static String URL = "https://www.netflix.com/login";
	
	public static WebDriver startDriver() throws Exception {

		// Identify Chrome Driver exe file
		System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");

		// Instantiate ChromeDriver
		mDriver = new ChromeDriver();

		// Set implicit wait of 10 seconds
		mDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Open Netflix login screen
        mDriver.get(URL);

        return mDriver;
	}
}