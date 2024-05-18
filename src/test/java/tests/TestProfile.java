package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import driver.Driver;
import pages.LoginPage;
import pages.ManageProfilesPage;

import org.openqa.selenium.WebDriver;

public class TestProfile {
	
	private static WebDriver mDriver;
        
    private static final String PROFILE_NAME= "Test Profile";
    private static final String PROFILE_RENAME= "Test Profile Renaming";

    @BeforeClass
    public static void setUp() throws Exception {
    	mDriver = Driver.startDriver();

    	new LoginPage(mDriver)
          .login()
          .launchAccount()
          .manageProfiles();
    }
    
    @Test
    public void deleteProfile() throws Exception {
    	
    	ManageProfilesPage manageProfilesPage = new ManageProfilesPage(mDriver);
    	
    	if (!manageProfilesPage.profileExists(PROFILE_NAME)) {
            manageProfilesPage.createProfile(PROFILE_NAME);
    	}
    	 
      	boolean isProfileAdded = new ManageProfilesPage(mDriver)
    	.editProfile(PROFILE_NAME)
    	.delete()
    	.delete()
    	.profileExists(PROFILE_NAME);
    	    	
    	assertFalse(isProfileAdded);
    } 
        
    @Test
    public void createProfile() throws Exception {
    	
 	ManageProfilesPage manageProfilesPage = new ManageProfilesPage(mDriver);
    	
    	if (manageProfilesPage.profileExists(PROFILE_NAME)) {
            manageProfilesPage.deleteProfile(PROFILE_NAME);
    	}
    	
       	boolean isProfileAdded = new ManageProfilesPage(mDriver)
    	.createProfile()
    	.setName(PROFILE_NAME)
    	.finish()
    	.profileExists(PROFILE_NAME);
    	    	
    	assertTrue(isProfileAdded);
    } 
    
    @Test
    public void renameProfile() throws Exception {
    	
    	ManageProfilesPage manageProfilesPage = new ManageProfilesPage(mDriver);
    	if (!manageProfilesPage.profileExists(PROFILE_NAME)) {
    		manageProfilesPage.createProfile(PROFILE_NAME);
    	}
    	
       	boolean isProfileAdded = new ManageProfilesPage(mDriver)
    	.editProfile(PROFILE_NAME)
    	.setName(PROFILE_RENAME)
    	.save()
    	.profileExists(PROFILE_RENAME);
    	    	
    	assertTrue(isProfileAdded);
    	
    	manageProfilesPage.deleteProfile(PROFILE_RENAME);
    } 
            
    @AfterClass
    public static void tearDown() throws Exception {
    	
       	ManageProfilesPage manageProfilesPage = new ManageProfilesPage(mDriver);
    	if (manageProfilesPage.profileExists(PROFILE_RENAME)) {
    		manageProfilesPage.deleteProfile(PROFILE_RENAME);
    	}    	
    	mDriver.quit();
    	
    	
    }
}
