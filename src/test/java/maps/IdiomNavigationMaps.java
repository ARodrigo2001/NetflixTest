package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IdiomNavigationMaps {

    @FindBy(xpath = "//div[contains(@class, 'title') and text()='Navegar por idiomas']")
    protected WebElement txtTitle;
}
