package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMaps {

    @FindBy(name = "userLoginId")
    protected WebElement inpEmail;

    @FindBy(name = "password")
    protected WebElement inpPassword;

    @FindBy(css = "[data-uia='login-submit-button']")
    protected WebElement btnLogin;

    @FindBy(css = "[data-uia='login-field+validationMessage']")
    protected WebElement alertEmptyEmail;

    @FindBy(css = "[data-uia='password-field+validationMessage']")
    protected WebElement alertEmptyPassword;

    @FindBy(css = "[data-uia='error-message-container+header']")
    protected WebElement alertInvalidEmail;

    @FindBy(css = "[data-uia='error-message-container+header']")
    protected WebElement alertInvalidPassword;

    @FindBy(className = "onetrust-close-btn-handler")
    protected WebElement btnCloseCookiesDialog;
}
