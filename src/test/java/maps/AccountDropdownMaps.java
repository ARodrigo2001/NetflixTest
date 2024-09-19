package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDropdownMaps {

    @FindBy(className = "account-drop-down")
    protected WebElement btnDropdown;

    @FindBy(className = "sign-out-links")
    protected WebElement btnSignOut;

    @FindBy(css = "[aria-label=\"Gerenciar perfis\"]")
    protected WebElement btnManageProfiles;    
}
