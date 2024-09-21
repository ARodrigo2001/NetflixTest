package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.WatchPage;
import resources.SeleniumUtils;
import core.Driver;

public class TestMovie {	        

    private final String VALID_MOVIE_NAME = "Breaking Bad";
    private final String INVALID_MOVIE_NAME = "THIS MOVIE DOES NOT EXIST";

    @Before
    public void setUp() throws Exception {
    	Driver.startDriver();
        new LoginPage()
                .login()
                .launchProfile("Arthur");
    }
    
    @Test
    public void testSearchValidMovie() throws Exception {
    	HomePage homePage = new HomePage()
    	.launchSearch()
    	.inputSearchText(VALID_MOVIE_NAME);
    	assertTrue(homePage.movieExists(VALID_MOVIE_NAME));
    } 
    
    @Test
    public void testSearchInvalidMovie() throws Exception {
    	HomePage homePage = new HomePage()
    	.launchSearch()
    	.inputSearchText(INVALID_MOVIE_NAME);
    	assertTrue(homePage.IsMovieNotFoundAlertDisplayed());
    } 
    
    @Test
    public void testPlayMovie() throws Exception {
    	WatchPage watchPage = new HomePage()
    			.launchHomeTab()
    			.launchSearch()
    			.inputSearchText(VALID_MOVIE_NAME)
    			.openMovieInfo(VALID_MOVIE_NAME)
    			.play();
    	assertTrue(watchPage.isDisplayed());
    	
    	watchPage.back().close().launchHomeTab();
    } 
    
    @After
    public void tearDown() throws Exception {
    	Driver.stopDriver();
    }
}
