package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import resources.Utils;

public class ManageProfilesPage extends BasePage {

	private final By SELECTOR_PROFILES_TITLE = By.className("list-profiles-container");
	private final By SELECTOR_CREATE_PROFILE_BTN = By.className("addProfileIcon");
	private final By SELECTOR_FINISHED_BTN = By.className("profile-button");

	public ManageProfilesPage(WebDriver driver) throws Exception {
		super(driver);
	}

	public boolean isDisplayed() throws Exception {

		return elementExists(SELECTOR_PROFILES_TITLE);
	}
		
	public CreateProfilePage createProfile() throws Exception {
		
		findElement(SELECTOR_CREATE_PROFILE_BTN).click();
		Thread.sleep(1000);
		return new CreateProfilePage(mDriver);
	}

	public HomePage finish() throws Exception {
		
		findElement(SELECTOR_FINISHED_BTN).click();
		Thread.sleep(1000);
		return new HomePage(mDriver);
	}
	
	public boolean profileExists(String profileName) throws Exception {
		
		By profileXpath = By.xpath(Utils.formatProfileNameXpath(profileName));
		return elementExists(profileXpath);
	}
	
	public EditProfilePage editProfile(String profileName) throws Exception {
		
		By profileXpath = By.xpath(Utils.formatProfileNameXpath(profileName));;
		findElement(profileXpath).click();
		Thread.sleep(1000);
		return new EditProfilePage(mDriver);
	}
	
	public ManageProfilesPage createProfile(String profileName) throws Exception {
	 	    createProfile().setName(profileName).finish();
	 	    return this;
	}
	
	public ManageProfilesPage deleteProfile(String profileName) throws Exception {
	 	    editProfile(profileName).delete().delete();
	 	    return this;
	}
	

}
