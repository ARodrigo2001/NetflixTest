package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumUtils {

    private final WebDriver driver;
    private final Actions mActions;

    public SeleniumUtils(WebDriver driver) {
        this.driver = driver;
        this.mActions = new Actions(driver);
    }

    public boolean elementExistsBySelector(By selector) {
	    return !driver.findElements(selector).isEmpty();
    }

    public boolean elementExists(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void moveToElement(WebElement element) {
        mActions.moveToElement(element).perform();
    }
}
