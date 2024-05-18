package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import driver.Driver;
import pages.HomePage;
import pages.LoginPage;

import org.openqa.selenium.WebDriver;

public class TestMyList {
	
	private static WebDriver mDriver;
        
    // Target movie name
    private final String MOVIE_NAME= "Breaking Bad";

    @BeforeClass
    public static void setUp() throws Exception {
    	mDriver = Driver.startDriver();

        new LoginPage(mDriver).login();
    }
    
    @Test
    public void testAddMovieToList() throws Exception {
    	boolean isMovieAdded = new HomePage(mDriver)
    	.launchHomeTab()
    	.launchSearch()
    	.inputSearchText(MOVIE_NAME)
    	.openMovieInfo(MOVIE_NAME)
    	.addToList()
    	.close()
    	.launchMyListTab()
    	.movieExists(MOVIE_NAME);
    	
    	assertTrue(isMovieAdded);
    } 
    
    @Test
    public void testRemoveMovieFromList() throws Exception {
    	boolean isMovieAdded = new HomePage(mDriver)
    	.launchHomeTab()
    	.launchSearch()
    	.inputSearchText(MOVIE_NAME)
    	.openMovieInfo(MOVIE_NAME)
    	.removeFromList()
    	.close()
    	.launchMyListTab()
    	.movieExists(MOVIE_NAME);
    	
    	assertFalse(isMovieAdded);
    } 
        
    @AfterClass
    public static void tearDown() throws Exception {
    	mDriver.quit();
    }
}
