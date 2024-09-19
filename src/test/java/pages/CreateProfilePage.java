package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.CreateProfileMaps;

public class CreateProfilePage extends CreateProfileMaps {

    public CreateProfilePage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
    }  
    
    public boolean isDisplayed() throws Exception {
    	return txtCreateProfile != null;
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
