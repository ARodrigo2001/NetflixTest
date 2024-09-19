package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WatchMaps {

    @FindBy(className = "watch-video")
    protected WebElement elVideo;
    
    @FindBy(xpath = "//*[@data-icon='ArrowLeftStandard']")
    protected WebElement btnBack;   
}
