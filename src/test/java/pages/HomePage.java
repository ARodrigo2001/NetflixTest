package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import core.Driver;
import maps.HomeMaps;
import resources.XpathFormatter;

public class HomePage extends HomeMaps {

	protected Actions mActions;
    protected JavascriptExecutor mJs;

	public HomePage() throws Exception {
		PageFactory.initElements(Driver.getDriver(), this);
		this.mActions = new Actions(Driver.getDriver());
        this.mJs = (JavascriptExecutor) Driver.getDriver();
	}

	public boolean isDisplayed() throws Exception {
		return btnHome != null;
	}

	public HomePage inputSearchText(String searchText) throws Exception {
		inpSearch.sendKeys(searchText);
		return this;
	}

	public HomePage launchHomeTab() throws Exception {
		btnHome.click();
		return this;
	}

	public SeriesPage launchSeriesTab() throws Exception {
		tabSeries.click();
		return new SeriesPage();
	}

	public MoviesPage launchMoviesTab() throws Exception {
		tabMovies.click();
		return new MoviesPage();
	}

	public NewsPage launchNewsTab() throws Exception {
		tabNews.click();
		return new NewsPage();
	}

	public MyListPage launchMyListTab() throws Exception {
		tabMyList.click();
		return new MyListPage();
	}

	public IdiomNavigationPage launchIdiomNavigationTab() throws Exception {
		tabIdiomNavigation.click();
		return new IdiomNavigationPage();
	}

	public HomePage launchSearch() throws Exception {
		btnSearch.click();
		return this;
	}

	public AccountDropdownPage launchAccount() throws Exception {
		btnAccount.click();
		return new AccountDropdownPage();
	}

	public MovieInfoPage openMovieInfo(String movieName) throws Exception {

		WebElement movieElement = findMovieElement(movieName);
		movieElement.click();
		return new MovieInfoPage();
	}

	public HomePage hoverOnMovie(String movieName) throws Exception {

		WebElement movieElement = findMovieElement(movieName);
		mActions.moveToElement(movieElement).perform();
		return this;
	}

	private WebElement findMovieElement(String movieName) throws Exception {
		String xpath = XpathFormatter.formatMovieXpath(movieName);
		return Driver.getDriver().findElement(By.xpath(xpath));
	}

	public boolean IsMovieNotFoundAlertDisplayed() throws Exception {
		return txtMovieNotFound != null;
	}
}
