package pages;

import org.openqa.selenium.support.PageFactory;
import core.Driver;
import maps.IdiomNavigationMaps;
import resources.SeleniumUtils;

public class IdiomNavigationPage extends IdiomNavigationMaps {

    private final SeleniumUtils mSeleniumUtils;

    public IdiomNavigationPage( ) throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
        mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
    }  
    
    public boolean isDisplayed() throws Exception {
    	return mSeleniumUtils.elementExists(txtTitle);
    }
}
