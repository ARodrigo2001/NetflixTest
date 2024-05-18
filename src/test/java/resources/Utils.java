package resources;

public class Utils {
		
	public static String formatMovieXpath(String movieName) {
		return String.format("//*[@aria-label='%s']", movieName);
	}
	
	public static String formatProfileNameXpath(String profileName) {
		return String.format("//span[contains(@class, 'profile-name') and text()='%s']", profileName);
	}
}