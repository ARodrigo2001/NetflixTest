package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.CreateProfileMaps;
import resources.SeleniumUtils;

public class CreateProfilePage extends CreateProfileMaps {

    private final SeleniumUtils mSeleniumUtils;

    public CreateProfilePage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
        mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
    }  
    
    public boolean isDisplayed() throws Exception {
    	return mSeleniumUtils.elementExists(txtCreateProfile);
    }
    
    public CreateProfilePage setName(String name) throws Exception {
        inpProfileName.sendKeys(name);
    	return this;
    }
    
    public ManageProfilesPage finish() throws Exception {
    	btnContinue.click();
    	return new ManageProfilesPage();
    }
}
