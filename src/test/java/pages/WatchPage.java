package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.WatchMaps;

public class WatchPage extends WatchMaps {

    public WatchPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    
    public boolean isDisplayed() throws Exception {
    	return elVideo != null;
    }  
    
    public MovieInfoPage back() throws Exception {
    	btnBack.click();
		return new MovieInfoPage();
    }
}
