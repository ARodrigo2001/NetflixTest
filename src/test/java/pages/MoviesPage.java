package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.MoviesMaps;

public class MoviesPage extends MoviesMaps {
	
    public MoviesPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
    }  
    
    public boolean isDisplayed() throws Exception {
    	return txtTitle != null;
    }        
    
    public MoviesPage setGridView() throws Exception {
    	btnGridView.click();
    	return this;
    }
    
    public MoviesPage setRowView() throws Exception {
    	btnRowView.click();
    	return this;
    }             
}
