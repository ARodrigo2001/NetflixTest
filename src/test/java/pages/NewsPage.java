package pages;

import org.openqa.selenium.support.PageFactory;
import core.Driver;
import maps.NewsMaps;
import resources.SeleniumUtils;

public class NewsPage extends NewsMaps {

    private final SeleniumUtils mSeleniumUtils;

    public NewsPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
        mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
    }  
    
    public boolean isDisplayed() throws Exception {
    	return mSeleniumUtils.elementExists(txtTitle);
    }          
}
