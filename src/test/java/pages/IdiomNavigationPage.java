package pages;

import org.openqa.selenium.support.PageFactory;
import core.Driver;
import maps.IdiomNavigationMaps;

public class IdiomNavigationPage extends IdiomNavigationMaps {

    public IdiomNavigationPage( ) throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
    }  
    
    public boolean isDisplayed() throws Exception {
    	return txtTitle != null;
    }
}
