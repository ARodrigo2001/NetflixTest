package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.MyListMaps;

public class MyListPage extends MyListMaps {
	
    public MyListPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
    }  
    
    public boolean isDisplayed() throws Exception {
    	
    	return txtTitle != null;
    }
          
}
