package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;
import resources.Credentials;

import core.Driver;

public class TestLogin {
    
    private Credentials mCredentials;
   
    @Before
    public void setUp() throws Exception {
        Driver.startDriver();     
        mCredentials = new Credentials();
    }
    
    @Test
    public void testLoginWithNoEmail() throws Exception {
    	LoginPage loginPage = new LoginPage()
    			.setPassword(mCredentials.getValidPassword())
    			.tapLoginWithInvalidCredentials();

    	assertTrue(loginPage.IsEmptyEmailAlertDisplayed());
    }
    
    @Test
    public void testLoginWithNoPassword() throws Exception {
    	LoginPage loginPage = new LoginPage()
    			.setEmail(mCredentials.getValidEmail())
    			.tapLoginWithInvalidCredentials();

    	assertTrue(loginPage.IsEmptyPasswordAlertDisplayed());
    }
    
    @Test
    public void testLoginWithInvalidEmail() throws Exception {
    	LoginPage loginPage = new LoginPage()
    			.setEmail(mCredentials.getInvalidEmail())
    			.setPassword(mCredentials.getValidPassword())
    			.tapLoginWithInvalidCredentials();

    	assertTrue(loginPage.IsInvalidEmailAlertDisplayed());
    }
    
    @Test
    public void testLoginWithInvalidPassword() throws Exception {
    	LoginPage loginPage = new LoginPage()
    			.setEmail(mCredentials.getValidEmail())
    			.setPassword(mCredentials.getInvalidPassword())
    			.tapLoginWithInvalidCredentials();

    	assertTrue(loginPage.IsInvalidPasswordAlertDisplayed());
    }

    @Test
    public void testLoginWithValidCredentials() throws Exception {
   	
    	HomePage homePage = new LoginPage()
    			.setEmail(mCredentials.getValidEmail())
    			.setPassword(mCredentials.getValidPassword())
    			.tapLoginWithValidCredentials();

    	assertTrue(homePage.isDisplayed());
    }
        
    @After
    public void tearDown() throws Exception {
    	Driver.stopDriver();
    }
}
