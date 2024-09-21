package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.EditProfileMaps;
import resources.SeleniumUtils;

public class EditProfilePage extends EditProfileMaps {

	private final SeleniumUtils mSeleniumUtils;

	public EditProfilePage() throws Exception {
		PageFactory.initElements(Driver.getDriver(), this);
		mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
	}

	public boolean isDisplayed() throws Exception {
		return mSeleniumUtils.elementExists(elTitle);
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
