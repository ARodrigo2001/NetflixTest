package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageProfilesMaps {
    @FindBy(className = "list-profiles-container")
    protected WebElement txtProfiles;

    @FindBy(className = "addProfileIcon")
    protected WebElement btnCreateProfile;

    @FindBy(className = "profile-button")
    protected WebElement btnFinish;
    
}
