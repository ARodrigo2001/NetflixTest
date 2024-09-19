package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoviesMaps {

    @FindBy(name = "aro-row-toggle")
    protected WebElement btnRowView;

    @FindBy(name = "aro-grid-toggle")
    protected WebElement btnGridView;

    @FindBy(xpath = "//span[contains(@class, 'genreTitle') and text()='Filmes']")
    protected WebElement txtTitle;
}
