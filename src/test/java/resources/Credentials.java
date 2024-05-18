package resources;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Credentials {
	
	private final String VALID_EMAIL;
	private final String VALID_PASSWORD;
	private final String INVALID_EMAIL;
	private final String INVALID_PASSWORD;
	
    public Credentials() throws Exception {
        	
    	Properties properties = new Properties();
    	InputStream fileContent = new FileInputStream("src/test/java/resources/config.properties");
    
    	// Read config.properties
    	properties.load(fileContent);
  
        this.VALID_EMAIL = properties.getProperty("valid.email");
        this.VALID_PASSWORD = properties.getProperty("valid.password");
        this.INVALID_EMAIL = properties.getProperty("invalid.email");
        this.INVALID_PASSWORD = properties.getProperty("invalid.password");
    }
	
    public String getValidEmail() {
    	return VALID_EMAIL;
    }
    
    public String getValidPassword() {
    	return VALID_PASSWORD;
    }
    
    public String getInvalidEmail() {
    	return INVALID_EMAIL;
    }
    
    public String getInvalidPassword() {
    	return INVALID_PASSWORD;
    }
}