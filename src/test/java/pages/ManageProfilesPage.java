package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.ManageProfilesMaps;
import resources.SeleniumUtils;
import resources.XpathFormatter;

public class ManageProfilesPage extends ManageProfilesMaps {

	private final SeleniumUtils mSeleniumUtils;

	public ManageProfilesPage() throws Exception {
		PageFactory.initElements(Driver.getDriver(), this);

		mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
	}

	public boolean isDisplayed() throws Exception {
		return mSeleniumUtils.elementExists(txtProfiles);
	}
		
	public CreateProfilePage createProfile() throws Exception {
		btnCreateProfile.click();
		return new CreateProfilePage();
	}
	
	public boolean profileExists(String profileName) throws Exception {
		By profileXpath = By.xpath(XpathFormatter.formatProfileNameXpath(profileName));
		return mSeleniumUtils.elementExistsBySelector(profileXpath);
	}

	public HomePage launchProfile(String profileName) throws Exception {
		By profileXpath = By.xpath(XpathFormatter.formatProfileNameXpath(profileName));
		Driver.getDriver().findElement(profileXpath).click();
		return new HomePage();
	}
	
	public EditProfilePage editProfile(String profileName) throws Exception {
		By profileXpath = By.xpath(XpathFormatter.formatProfileNameXpath(profileName));
		Driver.getDriver().findElement(profileXpath).click();
		Thread.sleep(1000);
		return new EditProfilePage();
	}
	
	public ManageProfilesPage createProfile(String profileName) throws Exception {
	 	    createProfile().setName(profileName).finish();
	 	    return this;
	}
	
	public ManageProfilesPage deleteProfile(String profileName) throws Exception {
	 	    editProfile(profileName).delete().delete();
	 	    return this;
	}

	public HomePage finish() throws Exception {
		btnFinish.click();
		return new HomePage();
	}
}
