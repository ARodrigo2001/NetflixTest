package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.MyListMaps;
import resources.SeleniumUtils;
import resources.XpathFormatter;

public class MyListPage extends MyListMaps {

    private final SeleniumUtils mSeleniumUtils;

    public MyListPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
        mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
    }  
    
    public boolean isDisplayed() throws Exception {
    	return mSeleniumUtils.elementExists(txtTitle);
    }

    public boolean movieExists(String movieName) throws Exception {
        String movieXpath = XpathFormatter.formatMovieXpath(movieName);
        return mSeleniumUtils.elementExistsBySelector(By.xpath(movieXpath));
    }
          
}
