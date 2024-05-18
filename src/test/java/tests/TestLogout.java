package tests;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import driver.Driver;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;

import org.openqa.selenium.WebDriver;

public class TestLogout {
    
    private static WebDriver mDriver;
    
    @BeforeClass
    public static void setUp() throws Exception {
        mDriver = Driver.startDriver();
        new LoginPage(mDriver).login();
    }
    
    @Test
    public void testLogout() throws Exception {
    	LogoutPage logoutPage = new HomePage(mDriver)
    	.launchAccount()
    	.signOut();
    	
    	assertTrue(logoutPage.isDisplayed());
    } 
    
    @AfterClass
    public static void tearDown() throws Exception {
    	mDriver.quit();
    }
}
