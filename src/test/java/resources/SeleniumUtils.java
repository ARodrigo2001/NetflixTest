package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumUtils {

    private WebDriver driver;
    private Actions mActions;

    public SeleniumUtils(WebDriver driver) {
        this.driver = driver;
        this.mActions = new Actions(driver);
    }

    public boolean elementExists(By selector) {
	try {
    		driver.findElement(selector);
    		return true;
    	} catch (NoSuchElementException e) {
    		return false;
    	}
    }

    public void hoverOnElement(WebElement element) throws Exception {
    	mActions.moveToElement(element).perform();
    	Thread.sleep(4000);
    }

    public boolean movieExists(String movieName) throws Exception {
		String movieXpath = XpathFormatter.formatMovieXpath(movieName);
		return elementExists(By.xpath(movieXpath));
	}  
}
