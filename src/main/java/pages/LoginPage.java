package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.cssSelector("button.login-button");
    By unsuccessfulLoginError = By.cssSelector("div.message-error");

    public void enterValidEmailField(){
        setElementText(emailField,"test@example.com");
    }
    public void enterPasswordField(){
        setElementText(passwordField,"P@ssw0rd");
    }
    public void enterInValidEmailField(){
        setElementText(emailField,"wrong@example.com");
    }
    public void clickOnLogin(){
        clickOnElement(loginButton);
    }

    public boolean isErrorMessageDisplayed(){
        return elementIsDisplayed(unsuccessfulLoginError);
    }
}
