package tests;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import driver.Driver;
import pages.HomePage;
import pages.IdiomNavigationPage;
import pages.LoginPage;
import pages.ManageProfilesPage;
import pages.MoviesPage;
import pages.MyListPage;
import pages.NewsPage;
import pages.SeriesPage;

import org.openqa.selenium.WebDriver;

public class TestNavigation {
	
	private static WebDriver mDriver;
        
    @BeforeClass
    public static void setUp() throws Exception {
    	mDriver = Driver.startDriver();

        new LoginPage(mDriver).login();
    }
    
    @Test
    public void testNavigateHome() throws Exception {
    	HomePage homePage = new HomePage(mDriver);
    	assertTrue(homePage.isDisplayed());
    } 
    
    @Test
    public void testNavigateSeries() throws Exception {
    	SeriesPage seriesPage = new HomePage(mDriver)
    	.launchSeriesTab();
    	assertTrue(seriesPage.isDisplayed());
    } 
    
    @Test
    public void testNavigateMovies() throws Exception {
    	MoviesPage moviesPage = new HomePage(mDriver)
    	.launchMoviesTab();
    	assertTrue(moviesPage.isDisplayed());
    }
    
    @Test
    public void testNavigateNews() throws Exception {
    	NewsPage newsPage = new HomePage(mDriver)
    	.launchNewsTab();
    	assertTrue(newsPage.isDisplayed());
    } 
    
    @Test
    public void testNavigateMyList() throws Exception {
    	MyListPage myListPage = new HomePage(mDriver)
    	.launchMyListTab();
    	assertTrue(myListPage.isDisplayed());
    } 
    
    @Test
    public void testNavigateIdiomNavigation() throws Exception {
    	IdiomNavigationPage idiomNavigationPage = new HomePage(mDriver)
    	.launchIdiomNavigationTab();
    	assertTrue(idiomNavigationPage.isDisplayed());
    } 
    
    @Test
    public void testNavigateManageProfiles() throws Exception {
    	ManageProfilesPage manageProfilesPage = new HomePage(mDriver)
    			.launchAccount().manageProfiles();
    	assertTrue(manageProfilesPage.isDisplayed());
    	manageProfilesPage.finish();
    }
    
    @AfterClass
    public static void tearDown() throws Exception {
    	mDriver.quit();
    }
}
