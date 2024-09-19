package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MovieInfoMaps {

    @FindBy(className = "previewModal")
    protected WebElement txtMovieInfo;

    @FindBy(className = "playLink")
    protected WebElement btnPlay;
    
    @FindBy(className = "previewModal-close")
    protected WebElement btnClose;
    
    @FindBy(xpath = "//*[@data-uia='add-to-my-list']")
    protected WebElement btnAddToList;

    @FindBy(xpath = "//*[@data-uia='add-to-my-list-added']")
    protected WebElement btnRemoveFromList;    
}
