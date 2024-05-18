package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewsPage extends BasePage {
	
   private final By SELECTOR_NEWS_TITLE = By.xpath("//div[contains(@class, 'row-header-title') and text()='Novidades na Netflix']");

    public NewsPage(WebDriver driver) throws Exception {
        super(driver);
    }  
    
    public boolean isDisplayed() throws Exception {
    	
    	return elementExists(SELECTOR_NEWS_TITLE);
    }          
}
