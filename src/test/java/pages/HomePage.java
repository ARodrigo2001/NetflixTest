package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Utils;

public class HomePage extends BasePage {

	private final By SELECTOR_HOME_BTN = By.className("icon-logoUpdate");
	private final By SELECTOR_SEARCH_BTN = By.className("searchTab");

	private final By SELECTOR_SEARCH_FIELD = By.id("searchInput");
	private final By SELECTOR_MOVIE_NOT_FOUND = By.xpath("//*[contains(text(),'Não encontramos resultados para')]");
	private final By SELECTOR_ACCOUNT_BTN = By.className("account-dropdown-button");

	private final By SELECTOR_TAB_HOME_BTN = By.xpath("//*[text()='Início']");
	private final By SELECTOR_TAB_SERIES_BTN = By.xpath("//*[text()='Séries']");
	private final By SELECTOR_TAB_MOVIES_BTN = By.xpath("//*[text()='Filmes']");
	private final By SELECTOR_TAB_NEWS_BTN = By.xpath("//*[text()='Bombando']");
	private final By SELECTOR_TAB_MY_LIST_BTN = By.xpath("//*[text()='Minha lista']");
	private final By SELECTOR_TAB_IDIOM_NAVIGATION_BTN = By.xpath("//*[text()='Navegar por idiomas']");

	public HomePage(WebDriver driver) throws Exception {
		super(driver);
	}

	public boolean isDisplayed() throws Exception {

		return elementExists(SELECTOR_HOME_BTN);
	}

	public HomePage inputSearchText(String searchText) throws Exception {

		WebElement searchField = findElement(SELECTOR_SEARCH_FIELD);
		setText(searchField, searchText);
		return this;
	}

	public HomePage launchHomeTab() throws Exception {

		findElement(SELECTOR_TAB_HOME_BTN).click();
		Thread.sleep(1000);
		return this;
	}

	public SeriesPage launchSeriesTab() throws Exception {

		findElement(SELECTOR_TAB_SERIES_BTN).click();
		Thread.sleep(1000);
		return new SeriesPage(mDriver);
	}

	public MoviesPage launchMoviesTab() throws Exception {

		findElement(SELECTOR_TAB_MOVIES_BTN).click();
		Thread.sleep(1000);
		return new MoviesPage(mDriver);
	}

	public NewsPage launchNewsTab() throws Exception {

		findElement(SELECTOR_TAB_NEWS_BTN).click();
		Thread.sleep(1000);
		return new NewsPage(mDriver);
	}

	public MyListPage launchMyListTab() throws Exception {

		findElement(SELECTOR_TAB_MY_LIST_BTN).click();
		Thread.sleep(1000);
		return new MyListPage(mDriver);
	}

	public IdiomNavigationPage launchIdiomNavigationTab() throws Exception {

		findElement(SELECTOR_TAB_IDIOM_NAVIGATION_BTN).click();
		Thread.sleep(1000);
		return new IdiomNavigationPage(mDriver);
	}

	public HomePage launchSearch() throws Exception {
		
		findElement(SELECTOR_SEARCH_BTN).click();
		return this;
	}

	public AccountDropdownPage launchAccount() throws Exception {
		
		findElement(SELECTOR_ACCOUNT_BTN).click();
		return new AccountDropdownPage(mDriver);
	}


	public MovieInfoPage openMovieInfo(String movieName) throws Exception {

		WebElement movieElement = findMovieElement(movieName);
		click(movieElement);
		return new MovieInfoPage(mDriver);
	}

	public HomePage hoverOnMovie(String movieName) throws Exception {

		WebElement movieElement = findMovieElement(movieName);
		hoverOnElement(movieElement);
		return this;
	}

	private WebElement findMovieElement(String movieName) throws Exception {

		String xpath = Utils.formatMovieXpath(movieName);
		return findElement(By.xpath(xpath));
	}

	public boolean IsMovieNotFoundAlertDisplayed() throws Exception {
		return elementExists(SELECTOR_MOVIE_NOT_FOUND);
	}
}
