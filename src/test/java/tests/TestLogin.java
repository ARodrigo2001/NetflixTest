package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import driver.Driver;
import pages.HomePage;
import pages.LoginPage;
import resources.Credentials;

import org.openqa.selenium.WebDriver;

public class TestLogin {
    
    private WebDriver mDriver;
    private Credentials mCredentials;
   
    @Before
    public void setUp() throws Exception {
        mDriver = Driver.startDriver();     
        mCredentials = new Credentials();
    }
    
    @Test
    public void testLoginWithNoEmail() throws Exception {
    	LoginPage loginPage = new LoginPage(mDriver)
    			.setPassword(mCredentials.getValidPassword())
    			.tapLoginWithInvalidCredentials();

    	assertTrue(loginPage.IsEmptyEmailAlertDisplayed());
    }
    
    @Test
    public void testLoginWithNoPassword() throws Exception {
    	LoginPage loginPage = new LoginPage(mDriver)
    			.setEmail(mCredentials.getValidEmail())
    			.tapLoginWithInvalidCredentials();

    	assertTrue(loginPage.IsEmptyPasswordAlertDisplayed());
    }
    
    @Test
    public void testLoginWithInvalidEmail() throws Exception {
    	LoginPage loginPage = new LoginPage(mDriver)
    			.setEmail(mCredentials.getInvalidEmail())
    			.setPassword(mCredentials.getValidPassword())
    			.tapLoginWithInvalidCredentials();

    	assertTrue(loginPage.IsInvalidEmailAlertDisplayed());
    }
    
    @Test
    public void testLoginWithInvalidPassword() throws Exception {
    	LoginPage loginPage = new LoginPage(mDriver)
    			.setEmail(mCredentials.getValidEmail())
    			.setPassword(mCredentials.getInvalidPassword())
    			.tapLoginWithInvalidCredentials();

    	assertTrue(loginPage.IsInvalidPasswordAlertDisplayed());
    }

    @Test
    public void testLoginWithValidCredentials() throws Exception {
   	
    	HomePage homePage = new LoginPage(mDriver)
    			.setEmail(mCredentials.getValidEmail())
    			.setPassword(mCredentials.getValidPassword())
    			.tapLoginWithValidCredentials();

    	assertTrue(homePage.isDisplayed());
    }
        
    @After
    public void tearDown() throws Exception {
    	mDriver.quit();
    }
}
