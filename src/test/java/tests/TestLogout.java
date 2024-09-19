package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import core.Driver;

public class TestLogout {
        
    @Before
    public void setUp() throws Exception {
        Driver.startDriver();
        new LoginPage().login();
    }
    
    @Test
    public void testLogout() throws Exception {
    	LogoutPage logoutPage = new HomePage()
    	.launchAccount()
    	.signOut();
    	assertTrue(logoutPage.isDisplayed());
    } 
    
    @After
    public void tearDown() throws Exception {
    	Driver.stopDriver();
    }
}
