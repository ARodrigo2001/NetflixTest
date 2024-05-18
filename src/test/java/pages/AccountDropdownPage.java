package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDropdownPage extends BasePage {
	
   private final By SELECTOR_DROPDOWN = By.className("account-drop-down");
   private final By SELECTOR_SIGN_OUT_BTN = By.className("sign-out-links");
   
   private final String QUERY_CLICK_MANAGE_PROFILES = "document.querySelector(\".account-links\").children[0].children[0].click()";

    public AccountDropdownPage(WebDriver driver) throws Exception {
        super(driver);
    }  
    
    public boolean isDisplayed() throws Exception {
    	
    	return elementExists(SELECTOR_DROPDOWN);
    }   
    
	public ManageProfilesPage manageProfiles() throws Exception {
		
		mJs.executeScript(QUERY_CLICK_MANAGE_PROFILES);
		Thread.sleep(1000);
		return new ManageProfilesPage(mDriver);
	}
	
	public LogoutPage signOut() throws Exception {
		
		findElement(SELECTOR_SIGN_OUT_BTN).click();
		return new LogoutPage(mDriver);
	}	
}
