package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeMaps {
    @FindBy(className = "icon-logoUpdate")
    protected WebElement btnHome;

    @FindBy(className = "searchTab")
    protected WebElement btnSearch;

    @FindBy(className = "account-dropdown-button")
    protected WebElement btnAccount;

    @FindBy(id = "searchInput")
    protected WebElement inpSearch;
    
    @FindBy(xpath = "//*[text()='Início']")
    protected WebElement tabHome;

    @FindBy(xpath = "//*[text()='Séries']")
    protected WebElement tabSeries;

    @FindBy(xpath = "//*[text()='Filmes']")
    protected WebElement tabMovies;

    @FindBy(xpath = "//*[text()='Bombando']")
    protected WebElement tabNews;

    @FindBy(xpath = "//*[text()='Minha lista']")
    protected WebElement tabMyList;

    @FindBy(xpath = "//*[text()='Navegar por idiomas']")
    protected WebElement tabIdiomNavigation;

    @FindBy(xpath = "//*[contains(text(),'Não encontramos resultados para')]")
    protected WebElement txtMovieNotFound;
}
