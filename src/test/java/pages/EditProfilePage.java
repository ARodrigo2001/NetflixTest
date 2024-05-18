package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProfilePage extends BasePage {

	private final By SELECTOR_EDIT_PAGE= By.xpath("//*[@data-uia='profile-edit-page']");
	private final By SELECTOR_DELETE_BTN = By.xpath("//*[@data-uia='profile-delete-button']");
	private final By SELECTOR_SAVE_BTN = By.xpath("//*[@data-uia='profile-save-button']");
	private final By SELECTOR_NAME_FIELD = By.xpath("//*[@data-uia='profile-edit-name-input']");

	public EditProfilePage(WebDriver driver) throws Exception {
		super(driver);
	}

	public boolean isDisplayed() throws Exception {

		return elementExists(SELECTOR_EDIT_PAGE);
	}
	
	public EditProfilePage setName(String name) throws Exception {
		
		WebElement nameField = findElement(SELECTOR_NAME_FIELD);
		setText(nameField, name);
		return this;
	}	
	
	public ManageProfilesPage save() throws Exception {
		findElement(SELECTOR_SAVE_BTN).click();
		Thread.sleep(1000);
		return new ManageProfilesPage(mDriver);
	}	
	
	public DeleteProfilePage delete() throws Exception {
		findElement(SELECTOR_DELETE_BTN).click();
		Thread.sleep(1000);
		return new DeleteProfilePage(mDriver);
	}


}
