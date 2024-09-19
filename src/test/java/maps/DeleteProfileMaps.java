package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteProfileMaps {

    @FindBy(xpath = "//*[@data-uia='profile-delete-page']")
    protected WebElement elTitle;

    @FindBy(xpath = "//*[@data-uia='profile-delete-button']")
    protected WebElement btnDelete;    
}
