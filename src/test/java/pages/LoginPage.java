package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.LoginMaps;
import resources.Credentials;

public class LoginPage extends LoginMaps {

    public LoginPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
        btnCloseCookiesDialog.click();
    }
    
    public boolean isDisplayed() throws Exception {
    	return inpEmail != null;
    }

    public HomePage login() throws Exception {
    	
    	Credentials credentials = new Credentials();
    	    	
    	return setEmail(credentials.getValidEmail())
    	.setPassword(credentials.getValidPassword())
    	.tapLoginWithValidCredentials();
    }
    
    public LoginPage setEmail(String email) throws Exception {    	
     	inpEmail.sendKeys(email);    	
    	return this;
    }
    
    public LoginPage setPassword(String password) throws Exception {
    	inpPassword.sendKeys(password);   	
    	return this;
    }
    
    public HomePage tapLoginWithValidCredentials() throws Exception {
    	btnLogin.click();
    	return new HomePage();
    }
    
    public LoginPage tapLoginWithInvalidCredentials() throws Exception {
    	btnLogin.click();    	
    	return this;
    }
    
    public boolean IsEmptyEmailAlertDisplayed() throws Exception {
    	    return alertEmptyEmail != null;
    }
    
    public boolean IsEmptyPasswordAlertDisplayed() throws Exception {
	    return alertEmptyPassword != null;
    }
    
    public boolean IsInvalidEmailAlertDisplayed() throws Exception {
	    return alertInvalidEmail != null;
    }
    
    public boolean IsInvalidPasswordAlertDisplayed() throws Exception {
	    return alertInvalidPassword != null;
    }
}
