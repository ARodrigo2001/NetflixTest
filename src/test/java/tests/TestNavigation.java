package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;
import pages.IdiomNavigationPage;
import pages.LoginPage;
import pages.ManageProfilesPage;
import pages.MoviesPage;
import pages.MyListPage;
import pages.NewsPage;
import pages.SeriesPage;
import core.Driver;

public class TestNavigation {
        
    @Before
    public void setUp() throws Exception {
    	Driver.startDriver();

        new LoginPage().login().launchProfile("Arthur");
    }
    
    @Test
    public void testNavigateHome() throws Exception {
    	HomePage homePage = new HomePage();
    	assertTrue(homePage.isDisplayed());
    } 
    
    @Test
    public void testNavigateSeries() throws Exception {
    	SeriesPage seriesPage = new HomePage()
    	.launchSeriesTab();
    	assertTrue(seriesPage.isDisplayed());
    } 
    
    @Test
    public void testNavigateMovies() throws Exception {
    	MoviesPage moviesPage = new HomePage()
    	.launchMoviesTab();
    	assertTrue(moviesPage.isDisplayed());
    }
    
    @Test
    public void testNavigateNews() throws Exception {
    	NewsPage newsPage = new HomePage()
    	.launchNewsTab();
    	assertTrue(newsPage.isDisplayed());
    } 
    
    @Test
    public void testNavigateMyList() throws Exception {
    	MyListPage myListPage = new HomePage()
    	.launchMyListTab();
    	assertTrue(myListPage.isDisplayed());
    } 
    
    @Test
    public void testNavigateIdiomNavigation() throws Exception {
    	IdiomNavigationPage idiomNavigationPage = new HomePage()
    	.launchIdiomNavigationTab();
    	assertTrue(idiomNavigationPage.isDisplayed());
    } 
    
    @Test
    public void testNavigateManageProfiles() throws Exception {
    	ManageProfilesPage manageProfilesPage = new HomePage()
    			.launchAccount().manageProfiles();
    	assertTrue(manageProfilesPage.isDisplayed());
    	manageProfilesPage.finish();
    }
    
    @After
    public void tearDown() throws Exception {
    	Driver.stopDriver();
    }
}
