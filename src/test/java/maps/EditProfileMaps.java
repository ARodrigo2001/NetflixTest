package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditProfileMaps {

    @FindBy(xpath = "//*[@data-uia='profile-edit-page']")
    protected WebElement elTitle;

    @FindBy(xpath = "//*[@data-uia='profile-delete-button']")
    protected WebElement btnDelete;

    @FindBy(xpath = "//*[@data-uia='profile-save-button']")
    protected WebElement btnSave;

    @FindBy(xpath = "//*[@data-uia='profile-edit-name-input']")
    protected WebElement inpName;    
}
