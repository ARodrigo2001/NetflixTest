package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.WatchMaps;
import resources.SeleniumUtils;

public class WatchPage extends WatchMaps {

    private final SeleniumUtils mSeleniumUtils;

    public WatchPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
        mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
    }
    
    public boolean isDisplayed() throws Exception {
    	return mSeleniumUtils.elementExists(elVideo);
    }  
    
    public MovieInfoPage back() throws Exception {
    	btnBack.click();
		return new MovieInfoPage();
    }
}
