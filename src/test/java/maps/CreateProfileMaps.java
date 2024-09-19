package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProfileMaps {

    @FindBy(className = "profile-create-page")
    protected WebElement txtCreateProfile;
    
    @FindBy(id = "add-profile-name")
    protected WebElement inpProfileName;

    @FindBy(xpath = "//*[@data-uia='profile-create-continue-button']")
    protected WebElement btnContinue;
}
