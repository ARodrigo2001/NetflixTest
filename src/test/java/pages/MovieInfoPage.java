package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MovieInfoPage extends BasePage {
    
    private final By SELECTOR_INFO_DIALOG = By.className("previewModal");
    private final By SELECTOR_PLAY_BTN = By.className("playLink");
    private final By SELECTOR_CLOSE_BTN= By.className("previewModal-close");
    private final By SELECTOR_ADD_TO_LIST= By.xpath("//*[@data-uia='add-to-my-list']");
    private final By SELECTOR_REMOVE_FROM_LIST= By.xpath("//*[@data-uia='add-to-my-list-added']");

    public MovieInfoPage(WebDriver driver) throws Exception {
        super(driver);
    }
    
    public boolean isDisplayed() throws Exception {
		return elementExists(SELECTOR_INFO_DIALOG);
    }  
    
    public WatchPage play() throws Exception {
    	findElement(SELECTOR_PLAY_BTN).click();
    	return new WatchPage(mDriver);
    }
    
    public HomePage close() throws Exception {
    	findElement(SELECTOR_CLOSE_BTN).click();
    	return new HomePage(mDriver);
    }
    
    public MovieInfoPage addToList() throws Exception {
    	findElement(SELECTOR_ADD_TO_LIST).click();
    	return this;
    }
    
    public MovieInfoPage removeFromList() throws Exception {
    	findElement(SELECTOR_REMOVE_FROM_LIST).click();
    	return this;
    }
}
