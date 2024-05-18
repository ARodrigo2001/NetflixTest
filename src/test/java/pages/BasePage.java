package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import resources.Utils;

public class BasePage {

    protected WebDriver mDriver;
    protected Actions mActions;
    protected JavascriptExecutor mJs;
    
    private final By SELECTOR_CLOSE_COOKIES_DIALOG = By.className("onetrust-close-btn-handler");

    public BasePage(WebDriver driver) throws Exception {
        this.mDriver = driver;
        this.mActions = new Actions(mDriver);
        this.mJs = (JavascriptExecutor) mDriver;
    }
        
    public BasePage closeCookiesDialog() throws Exception {
    	mDriver.findElement(SELECTOR_CLOSE_COOKIES_DIALOG).click();
    	Thread.sleep(1000);
    	return this;
    }
    
	public boolean movieExists(String movieName) throws Exception {

		String movieXpath = Utils.formatMovieXpath(movieName);
		return elementExists(By.xpath(movieXpath));
	}
    
    public BasePage setText(WebElement element, String text) throws InterruptedException {
    	element.clear();
    	element.sendKeys(text);
    	Thread.sleep(1000);
    	return this;
    }
    
    public BasePage click(WebElement element) throws Exception {
    	element.click();
    	Thread.sleep(1000);
    	return this;
    }
    
    public BasePage hoverOnElement(WebElement element) throws Exception {
    	mActions.moveToElement(element).perform();
    	Thread.sleep(4000);
    	return this;
    }
    
    public WebElement findElement(By selector) {
    	return mDriver.findElement(selector);
    	
    }
    
    public boolean elementExists(By selector) {
    	try {
    		findElement(selector);
    		return true;
    	} catch (NoSuchElementException e) {
    		return false;
    	}
    }
   
}
