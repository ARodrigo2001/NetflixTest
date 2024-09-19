package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.EditProfileMaps;

public class EditProfilePage extends EditProfileMaps {

	public EditProfilePage() throws Exception {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	public boolean isDisplayed() throws Exception {
		return elTitle != null;
	}
	
	public EditProfilePage setName(String name) throws Exception {
		inpName.sendKeys(name);
		return this;
	}	
	
	public ManageProfilesPage save() throws Exception {
		btnSave.click();
		return new ManageProfilesPage();
	}	
	
	public DeleteProfilePage delete() throws Exception {
		btnDelete.click();
		return new DeleteProfilePage();
	}
}
