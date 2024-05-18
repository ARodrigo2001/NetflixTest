package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IdiomNavigationPage extends BasePage {
	
    private final By SELECTOR_IDIOM_NAVIGATION_TITLE = By.xpath("//div[contains(@class, 'title') and text()='Navegar por idiomas']");

    public IdiomNavigationPage(WebDriver driver) throws Exception {
        super(driver);
    }  
    
    public boolean isDisplayed() throws Exception {
    	
    	return elementExists(SELECTOR_IDIOM_NAVIGATION_TITLE);
    }
}
