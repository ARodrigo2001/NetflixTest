package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.AccountDropdownMaps;

public class AccountDropdownPage extends AccountDropdownMaps {

    public AccountDropdownPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
    }  
    
    public boolean isDisplayed() throws Exception {
    	return btnDropdown != null;
    }   
    
	public ManageProfilesPage manageProfiles() throws Exception {
		
		btnManageProfiles.click();
		//mJs.executeScript(QUERY_CLICK_MANAGE_PROFILES);
		return new ManageProfilesPage();
	}
	
	public LogoutPage signOut() throws Exception {
		btnSignOut.click();
		return new LogoutPage();
	}	
}
