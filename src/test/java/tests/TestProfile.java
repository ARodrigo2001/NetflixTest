package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;
import pages.ManageProfilesPage;
import core.Driver;

public class TestProfile {
        
    private static final String PROFILE_NAME= "Test Profile";
    private static final String PROFILE_RENAME= "Test Profile Renaming";

    @Before
    public void setUp() throws Exception {
    	Driver.startDriver();

    	new LoginPage()
          .login()
          .launchAccount()
          .manageProfiles();
    }
    
    @Test
    public void deleteProfile() throws Exception {
    	
    	ManageProfilesPage manageProfilesPage = new ManageProfilesPage();
    	
    	if (!manageProfilesPage.profileExists(PROFILE_NAME)) {
            manageProfilesPage.createProfile(PROFILE_NAME);
    	}
    	 
      	boolean isProfileAdded = new ManageProfilesPage()
    	.editProfile(PROFILE_NAME)
    	.delete()
    	.delete()
    	.profileExists(PROFILE_NAME);
    	    	
    	assertFalse(isProfileAdded);
    } 
        
    @Test
    public void createProfile() throws Exception {
    	
 	ManageProfilesPage manageProfilesPage = new ManageProfilesPage();
    	
    	if (manageProfilesPage.profileExists(PROFILE_NAME)) {
            manageProfilesPage.deleteProfile(PROFILE_NAME);
    	}
    	
       	boolean isProfileAdded = new ManageProfilesPage()
    	.createProfile()
    	.setName(PROFILE_NAME)
    	.finish()
    	.profileExists(PROFILE_NAME);
    	    	
    	assertTrue(isProfileAdded);
    } 
    
    @Test
    public void renameProfile() throws Exception {
    	
    	ManageProfilesPage manageProfilesPage = new ManageProfilesPage();
    	if (!manageProfilesPage.profileExists(PROFILE_NAME)) {
    		manageProfilesPage.createProfile(PROFILE_NAME);
    	}
    	
       	boolean isProfileAdded = new ManageProfilesPage()
    	.editProfile(PROFILE_NAME)
    	.setName(PROFILE_RENAME)
    	.save()
    	.profileExists(PROFILE_RENAME);
    	    	
    	assertTrue(isProfileAdded);
    	
    	manageProfilesPage.deleteProfile(PROFILE_RENAME);
    } 
            
    @After
    public void tearDown() throws Exception {
    	
       	ManageProfilesPage manageProfilesPage = new ManageProfilesPage();
    	if (manageProfilesPage.profileExists(PROFILE_RENAME)) {
    		manageProfilesPage.deleteProfile(PROFILE_RENAME);
    	}    	
    	Driver.stopDriver();    	
    }
}
