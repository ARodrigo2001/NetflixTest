package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMaps {

    @FindBy(name = "userLoginId")
    protected WebElement inpEmail;

    @FindBy(name = "password")
    protected WebElement inpPassword;

    @FindBy(css = "[data-uia='login-submit-button']")
    protected WebElement btnLogin;
    
    @FindBy(xpath = "//*[text()='Informe um email ou número de telefone válido.']")
    protected WebElement alertEmptyEmail;

    @FindBy(xpath = "//*[contains(text(),'Desculpe, não encontramos uma conta com esse endereço de email.')]")
    protected WebElement alertInvalidEmail;

    @FindBy(xpath = "//*[text()='A senha deve ter entre 4 e 60 caracteres.']")
    protected WebElement alertEmptyPassword;

    @FindBy(xpath = "//*[contains(text(),'Senha incorreta')]")
    protected WebElement alertInvalidPassword;

    @FindBy(className = "onetrust-close-btn-handler")
    protected WebElement btnCloseCookiesDialog;
}
