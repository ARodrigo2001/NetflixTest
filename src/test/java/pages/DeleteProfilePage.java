package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteProfilePage extends BasePage {

	private final By SELECTOR_DELETE_PAGE= By.xpath("//*[@data-uia='profile-delete-page']");
	private final By SELECTOR_DELETE_BTN = By.xpath("//*[@data-uia='profile-delete-button']");

	public DeleteProfilePage(WebDriver driver) throws Exception {
		super(driver);
	}

	public boolean isDisplayed() throws Exception {

		return elementExists(SELECTOR_DELETE_PAGE);
	}
	
	public ManageProfilesPage delete() throws Exception {
		findElement(SELECTOR_DELETE_BTN).click();
		Thread.sleep(1000);
		return new ManageProfilesPage(mDriver);
	}
	
}
