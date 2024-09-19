package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.MovieInfoMaps;

public class MovieInfoPage extends MovieInfoMaps {

    public MovieInfoPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    
    public boolean isDisplayed() throws Exception {
		return txtMovieInfo != null;
    }  
    
    public WatchPage play() throws Exception {
    	btnPlay.click();
    	return new WatchPage();
    }
    
    public HomePage close() throws Exception {
    	btnClose.click();
    	return new HomePage();
    }
    
    public MovieInfoPage addToList() throws Exception {
    	btnAddToList.click();
    	return this;
    }
    
    public MovieInfoPage removeFromList() throws Exception {
    	btnRemoveFromList.click();
    	return this;
    }
}
