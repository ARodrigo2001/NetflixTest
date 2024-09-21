package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.DeleteProfileMaps;
import resources.SeleniumUtils;

public class DeleteProfilePage extends DeleteProfileMaps {

	private final SeleniumUtils mSeleniumUtils;

	public DeleteProfilePage() throws Exception {
		PageFactory.initElements(Driver.getDriver(), this);
		mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
	}

	public boolean isDisplayed() throws Exception {
		return mSeleniumUtils.elementExists(elTitle);
	}
	
	public ManageProfilesPage delete() throws Exception {
		btnDelete.click();
		return new ManageProfilesPage();
	}
	
}
