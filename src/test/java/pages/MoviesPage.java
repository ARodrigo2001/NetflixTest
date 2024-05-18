package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoviesPage extends BasePage {
	
    private final By SELECTOR_ROW_VIEW_BTN = By.className("aro-row-toggle");
    private final By SELECTOR_GRID_VIEW_BTN = By.className("aro-grid-toggle");
    private final By SELECTOR_MOVIES_TITLE = By.xpath("//span[contains(@class, 'genreTitle') and text()='Filmes']");

    public MoviesPage(WebDriver driver) throws Exception {
        super(driver);
    }  
    
    public boolean isDisplayed() throws Exception {
    	
    	return elementExists(SELECTOR_MOVIES_TITLE);
    }
    
    public MoviesPage setGridView() throws Exception {
    	
    	findElement(SELECTOR_GRID_VIEW_BTN).click();
    	return this;
    }
    
    public MoviesPage setRowView() throws Exception {
    	
    	findElement(SELECTOR_ROW_VIEW_BTN).click();
    	return this;
    }            
}
