package tests;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import driver.Driver;
import pages.HomePage;
import pages.LoginPage;
import pages.WatchPage;

import org.openqa.selenium.WebDriver;

public class TestMovie {
	
	private static WebDriver mDriver;
        
    // Target movie name
    private final String VALID_MOVIE_NAME= "Breaking Bad";
    private final String INVALID_MOVIE_NAME= "THIS MOVIE DOES NOT EXIST";

    @BeforeClass
    public static void setUp() throws Exception {
    	mDriver = Driver.startDriver();
        new LoginPage(mDriver).login();
    }
    
    @Test
    public void testSearchValidMovie() throws Exception {
    	HomePage homePage = new HomePage(mDriver)
    	.launchSearch()
    	.inputSearchText(VALID_MOVIE_NAME);
    	assertTrue(homePage.movieExists(VALID_MOVIE_NAME));
    } 
    
    @Test
    public void testSearchInvalidMovie() throws Exception {
    	HomePage homePage = new HomePage(mDriver)
    	.launchSearch()
    	.inputSearchText(INVALID_MOVIE_NAME);
    	assertTrue(homePage.IsMovieNotFoundAlertDisplayed());
    } 
    
    @Test
    public void testPlayMovie() throws Exception {
    	WatchPage watchPage = new HomePage(mDriver)
    			.launchHomeTab()
    			.launchSearch()
    			.inputSearchText(VALID_MOVIE_NAME)
    			.openMovieInfo(VALID_MOVIE_NAME)
    			.play();
    	assertTrue(watchPage.isDisplayed());
    	
    	watchPage.back().close().launchHomeTab();
    } 
    
    @AfterClass
    public static void tearDown() throws Exception {
    	mDriver.quit();
    }
}
