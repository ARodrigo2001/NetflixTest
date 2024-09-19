package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import pages.HomePage;
import pages.LoginPage;
import resources.SeleniumUtils;
import core.Driver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMyList {

	private SeleniumUtils mSeleniumUtils = new SeleniumUtils(Driver.getDriver());
	private final String MOVIE_NAME= "Breaking Bad";

    @Before
    public void setUp() throws Exception {
    	Driver.startDriver();

        new LoginPage().login();
    }
    
    @Test
    public void testAddMovieToList() throws Exception {
		new HomePage()
    	.launchHomeTab()
    	.launchSearch()
    	.inputSearchText(MOVIE_NAME)
    	.openMovieInfo(MOVIE_NAME)
    	.addToList()
    	.close()
    	.launchMyListTab();
    	assertTrue(mSeleniumUtils.movieExists(MOVIE_NAME));
    } 
    
    @Test
    public void testRemoveMovieFromList() throws Exception {
    	new HomePage()
    	.launchHomeTab()
    	.launchSearch()
    	.inputSearchText(MOVIE_NAME)
    	.openMovieInfo(MOVIE_NAME)
    	.removeFromList()
    	.close()
    	.launchMyListTab();    	
    	assertFalse(mSeleniumUtils.movieExists(MOVIE_NAME));
    } 
        
    @After
    public void tearDown() throws Exception {
    	Driver.stopDriver();
    }
}
