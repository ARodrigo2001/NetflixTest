package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.DeleteProfileMaps;

public class DeleteProfilePage extends DeleteProfileMaps {

	public DeleteProfilePage() throws Exception {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	public boolean isDisplayed() throws Exception {
		return elTitle != null;
	}
	
	public ManageProfilesPage delete() throws Exception {
		btnDelete.click();
		return new ManageProfilesPage();
	}
	
}
