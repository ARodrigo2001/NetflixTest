package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Credentials;

public class LoginPage extends BasePage {
    
    private final By SELECTOR_EMAIL_FIELD = By.name("userLoginId");
    private final By SELECTOR_PASSWORD_FIELD = By.name("password");
    
    private final By SELECTOR_LOGIN_BUTTON = By.cssSelector("[data-uia='login-submit-button']");
    
    private final By SELECTOR_EMPTY_EMAIL_ALERT= By.xpath("//*[text()='Informe um email ou número de telefone válido.']");
    private final By SELECTOR_INVALID_EMAIL_ALERT= By.xpath("//*[contains(text(),'Desculpe, não encontramos uma conta com esse endereço de email.')]");
    private final By SELECTOR_EMPTY_PASSWORD_ALERT= By.xpath("//*[text()='A senha deve ter entre 4 e 60 caracteres.']");
    private final By SELECTOR_INVALID_PASSWORD_ALERT= By.xpath("//*[contains(text(),'Senha incorreta')]");

    public LoginPage(WebDriver driver) throws Exception {
        super(driver);
        
    	closeCookiesDialog();
    }
    
    public boolean isDisplayed() throws Exception {
    	return elementExists(SELECTOR_EMAIL_FIELD);
    }
    
    public LoginPage setEmail(String email) throws Exception {
    	
    	// Find email text field
    	WebElement emailFieldElement = findElement(SELECTOR_EMAIL_FIELD);
    	
     	// Set email
    	setText(emailFieldElement, email);
    	
    	return this;
    }
    
    public LoginPage setPassword(String password) throws Exception {
    	
    	// Find password text field
    	WebElement passwordFieldElement = findElement(SELECTOR_PASSWORD_FIELD);
    	
    	// Set password
    	setText(passwordFieldElement, password);
    	
    	return this;
    }
    
    public HomePage tapLoginWithValidCredentials() throws Exception {
    	
    	// Find login button
    	WebElement loginBtn = findElement(SELECTOR_LOGIN_BUTTON);
    	
    	// Click login button
    	click(loginBtn);
    	
    	return new HomePage(mDriver);
    }
    
    public LoginPage tapLoginWithInvalidCredentials() throws Exception {
    	
    	// Find login button
    	WebElement loginBtn = findElement(SELECTOR_LOGIN_BUTTON);
    	
    	// Click login button
    	click(loginBtn);
    	
    	return this;
    }
    
    public boolean IsEmptyEmailAlertDisplayed() throws Exception {
    	    return elementExists(SELECTOR_EMPTY_EMAIL_ALERT);
    }
    
    public boolean IsEmptyPasswordAlertDisplayed() throws Exception {
	    return elementExists(SELECTOR_EMPTY_PASSWORD_ALERT);
    }
    
    public boolean IsInvalidEmailAlertDisplayed() throws Exception {
	    return elementExists(SELECTOR_INVALID_EMAIL_ALERT);
    }
    
    public boolean IsInvalidPasswordAlertDisplayed() throws Exception {
	    return elementExists(SELECTOR_INVALID_PASSWORD_ALERT);
    }

    public HomePage login() throws Exception {
    	
    	Credentials credentials = new Credentials();
    	    	
    	return setEmail(credentials.getValidEmail())
    	.setPassword(credentials.getValidPassword())
    	.tapLoginWithValidCredentials();
    }
  
}
