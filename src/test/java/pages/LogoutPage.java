package pages;

import org.openqa.selenium.support.PageFactory;
import core.Driver;
import maps.LogoutMaps;
import resources.SeleniumUtils;

public class LogoutPage extends LogoutMaps {

    private final SeleniumUtils mSeleniumUtils;

    public LogoutPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
        mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
    }
    
    public boolean isDisplayed() throws Exception {
    	return mSeleniumUtils.elementExists(txtLogout);
    }
}
