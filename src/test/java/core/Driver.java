package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	
	private static WebDriver mDriver;
    private static String URL = "https://www.netflix.com/login";
	
	public static WebDriver getDriver() {
		return mDriver;
	}

	public static void startDriver() throws Exception {
		// Uncomment this if you need Headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		mDriver = new ChromeDriver(options);

		//mDriver = new ChromeDriver();
		mDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		mDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        mDriver.get(URL);
	}

	public static void stopDriver() throws Exception {
		mDriver.quit();
	}
}