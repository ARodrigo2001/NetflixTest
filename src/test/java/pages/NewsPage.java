package pages;

import org.openqa.selenium.support.PageFactory;
import core.Driver;
import maps.NewsMaps;

public class NewsPage extends NewsMaps {
	
    public NewsPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
    }  
    
    public boolean isDisplayed() throws Exception {
    	return txtTitle != null;
    }          
}
