package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeriesPage extends BasePage {
	
    private final By SELECTOR_SERIES_TITLE = By.xpath("//span[contains(@class, 'genreTitle') and text()='Séries']");
    private final By SELECTOR_ROW_VIEW_BTN = By.className("aro-row-toggle");
    private final By SELECTOR_GRID_VIEW_BTN = By.className("aro-grid-toggle");

    public SeriesPage(WebDriver driver) throws Exception {
        super(driver);
    }  
    
    public boolean isDisplayed() throws Exception {
    	
    	return elementExists(SELECTOR_SERIES_TITLE);
    }        
    
    public SeriesPage setGridView() throws Exception {
    	
    	findElement(SELECTOR_GRID_VIEW_BTN).click();
    	return this;
    }
    
    public SeriesPage setRowView() throws Exception {
    	
    	findElement(SELECTOR_ROW_VIEW_BTN).click();
    	return this;
    }   
}
