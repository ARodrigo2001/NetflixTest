package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage {
    
    private final By SELECTOR_LOGOUT_DIALOG = By.className("logout");

    public LogoutPage(WebDriver driver) throws Exception {
        super(driver);
    }
    
    public boolean isDisplayed() throws Exception {
    	return elementExists(SELECTOR_LOGOUT_DIALOG);
    }
}
