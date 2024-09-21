package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.MoviesMaps;
import resources.SeleniumUtils;
import resources.XpathFormatter;

public class MoviesPage extends MoviesMaps {

    private final SeleniumUtils mSeleniumUtils;

    public MoviesPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
        mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
    }  
    
    public boolean isDisplayed() throws Exception {
    	return mSeleniumUtils.elementExists(txtTitle);
    }

    public boolean movieExists(String movieName) throws Exception {
        By profileXpath = By.xpath(XpathFormatter.formatProfileNameXpath(movieName));
        return mSeleniumUtils.elementExistsBySelector(profileXpath);
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
