package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.SeriesMaps;
import resources.SeleniumUtils;

public class SeriesPage extends SeriesMaps {

    private final SeleniumUtils mSeleniumUtils;

    public SeriesPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
        mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
    }
    
    public boolean isDisplayed() throws Exception {
    	return mSeleniumUtils.elementExists(txtTitle);
    }        
    
    public SeriesPage setGridView() throws Exception {
    	btnGridView.click();
    	return this;
    }
    
    public SeriesPage setRowView() throws Exception {
    	btnRowView.click();
    	return this;
    }   
}
