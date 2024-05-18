package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateProfilePage extends BasePage {
	
    private final By SELECTOR_CREATE_PROFILE_PAGE = By.className("profile-create-page");
    private final By SELECTOR_PROFILE_NAME_FIELD= By.id("add-profile-name");
    private final By SELECTOR_CONTINUE_BTN = By.xpath("//*[@data-uia='profile-create-continue-button']");

    public CreateProfilePage(WebDriver driver) throws Exception {
        super(driver);
    }  
    
    public boolean isDisplayed() throws Exception {
    	
    	return elementExists(SELECTOR_CREATE_PROFILE_PAGE);
    }
    
    public CreateProfilePage setName(String name) throws Exception {
    	
    	WebElement nameField = findElement(SELECTOR_PROFILE_NAME_FIELD);
    	setText(nameField, name);
    	return this;
    }
    
    public ManageProfilesPage finish() throws Exception {
    	findElement(SELECTOR_CONTINUE_BTN).click();
    	Thread.sleep(1000);
    	return new ManageProfilesPage(mDriver);
    }
    
}
