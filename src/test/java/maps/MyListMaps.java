package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyListMaps {

    @FindBy(xpath = "//div[contains(@class, 'title') and text()='Minha lista']")
    protected WebElement txtTitle;
}
