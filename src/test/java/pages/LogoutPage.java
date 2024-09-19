package pages;

import org.openqa.selenium.support.PageFactory;
import core.Driver;
import maps.LogoutMaps;

public class LogoutPage extends LogoutMaps {
    
    public LogoutPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    
    public boolean isDisplayed() throws Exception {
    	return txtLogout != null;
    }
}
