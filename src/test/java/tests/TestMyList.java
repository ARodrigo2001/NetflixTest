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
import pages.MyListPage;
import resources.SeleniumUtils;
import core.Driver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestMyList {

	private final String MOVIE_NAME= "Breaking Bad";

    @Before
    public void setUp() throws Exception {
    	Driver.startDriver();
        new LoginPage()
				.login()
				.launchProfile("Arthur");
    }
    
    @Test
    public void testAddMovieToList() throws Exception {
		MyListPage myListPage = new HomePage()
    	.launchHomeTab()
    	.launchSearch()
    	.inputSearchText(MOVIE_NAME)
    	.openMovieInfo(MOVIE_NAME)
    	.addToList()
    	.close()
    	.launchMyListTab();

    	assertTrue(myListPage.movieExists(MOVIE_NAME));
    } 
    
    @Test
    public void testRemoveMovieFromList() throws Exception {
		MyListPage myListPage = new HomePage()
    	.launchHomeTab()
    	.launchSearch()
    	.inputSearchText(MOVIE_NAME)
    	.openMovieInfo(MOVIE_NAME)
    	.removeFromList()
    	.close()
    	.launchMyListTab();    	
    	assertFalse(myListPage.movieExists(MOVIE_NAME));
    } 
        
    @After
    public void tearDown() throws Exception {
    	Driver.stopDriver();
    }
}
