package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyListPage extends BasePage {
	
    private final By SELECTOR_MY_LIST_TITLE = By.xpath("//div[contains(@class, 'title') and text()='Minha lista']");

    public MyListPage(WebDriver driver) throws Exception {
        super(driver);
    }  
    
    public boolean isDisplayed() throws Exception {
    	
    	return elementExists(SELECTOR_MY_LIST_TITLE);
    }
          
}
