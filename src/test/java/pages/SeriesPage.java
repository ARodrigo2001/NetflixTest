package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.SeriesMaps;

public class SeriesPage extends SeriesMaps {

    public SeriesPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
    }  
    
    public boolean isDisplayed() throws Exception {
    	return txtTitle != null;
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
