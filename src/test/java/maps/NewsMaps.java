package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsMaps {

    @FindBy(xpath = "//div[contains(@class, 'row-header-title') and text()='Novidades na Netflix']")
    protected WebElement txtTitle;
}
