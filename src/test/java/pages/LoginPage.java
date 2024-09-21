package pages;

import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.LoginMaps;
import resources.Credentials;
import resources.SeleniumUtils;

public class LoginPage extends LoginMaps {

    private final SeleniumUtils mSeleniumUtils;

    public LoginPage() throws Exception {
        PageFactory.initElements(Driver.getDriver(), this);
        mSeleniumUtils = new SeleniumUtils(Driver.getDriver());

        btnCloseCookiesDialog.click();
    }
    
    public boolean isDisplayed() throws Exception {
    	return mSeleniumUtils.elementExists(inpEmail);
    }

    public ManageProfilesPage login() throws Exception {
    	
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
    
    public ManageProfilesPage tapLoginWithValidCredentials() throws Exception {
    	btnLogin.click();
    	return new ManageProfilesPage();
    }
    
    public LoginPage tapLoginWithInvalidCredentials() throws Exception {
    	btnLogin.click();    	
    	return this;
    }
    
    public boolean IsEmptyEmailAlertDisplayed() throws Exception {
    	    return mSeleniumUtils.elementExists(alertEmptyEmail);
    }
    
    public boolean IsEmptyPasswordAlertDisplayed() throws Exception {
	    return mSeleniumUtils.elementExists(alertEmptyPassword);
    }
    
    public boolean IsInvalidEmailAlertDisplayed() throws Exception {
	    return mSeleniumUtils.elementExists(alertInvalidEmail);
    }
    
    public boolean IsInvalidPasswordAlertDisplayed() throws Exception {
	    return mSeleniumUtils.elementExists(alertInvalidPassword);
    }
}
