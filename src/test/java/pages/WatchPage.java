package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WatchPage extends BasePage {
    
    private final By SELECTOR_VIDEO = By.className("watch-video");
	private final By SELECTOR_BACK_BTN = By.xpath("//*[@data-icon='ArrowLeftStandard']");

    public WatchPage(WebDriver driver) throws Exception {
        super(driver);
    }
    
    public boolean isDisplayed() throws Exception {
    	return elementExists(SELECTOR_VIDEO);
    }  
    
    public MovieInfoPage back() throws Exception {
    	findElement(SELECTOR_BACK_BTN).click();
    	Thread.sleep(1000);
		return new MovieInfoPage(mDriver);
    }
}
