package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.AccountDropdownMaps;
import resources.SeleniumUtils;

public class AccountDropdownPage extends AccountDropdownMaps {

	private final SeleniumUtils mSeleniumUtils;

    public AccountDropdownPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
		mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
    }  
    
    public boolean isDisplayed() throws Exception {
    	return mSeleniumUtils.elementExists(btnDropdown);
    }   
    
	public ManageProfilesPage manageProfiles() throws Exception {
		
		btnManageProfiles.click();
		return new ManageProfilesPage();
	}
	
	public LogoutPage signOut() throws Exception {
		btnSignOut.click();
		return new LogoutPage();
	}	
}
