package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends PageBase{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    // add element type at the end of the locator name, ex confirmPassword should be confirmPasswordField
    By genderMaleRadioButton = By.id("gender-male");
    By genderFemaleRadioButton = By.id("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By birthDayList = By.name("DateOfBirthDay");
    By birthMonthList = By.name("DateOfBirthMonth");
    By birthYearList = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By companyField = By.id("Company");
    By newsLetterCheckBox = By.id("Newsletter");
    By passwordField = By.id("Password");
    By confirmedPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By successMessage = By.cssSelector("div.result");
    public void selectGender(){
        clickOnElement(genderFemaleRadioButton);
    }
    public void enterFirstName(String firstNameText){
        setElementText(firstNameField, firstNameText);
    }
    public void enterLastName(String lastNameText){
        setElementText(lastNameField,lastNameText);
    }
    public void selectDayOfBirth(String dayText){
        selectFromDropDown(birthDayList,dayText);
    }
    public void selectMonthOfBirth(String monthText){
        selectFromDropDown(birthMonthList,monthText);
    }
    public void selectYearOfBirth(String yearText){
        selectFromDropDown(birthYearList,yearText);
    }
    public void enterEmail(String emailText){
        setElementText(emailField,emailText);
    }
    public void enterPassword(String passwordText){
        setElementText(passwordField,passwordText);
    }
    public void enterCompany(String companyText){
        setElementText(companyField,companyText);
    }
    public void enterConfirmedPassword(String confirmedPassword){
        setElementText(confirmedPasswordField,confirmedPassword);
    }
    public void clickRegister(){
        clickOnElement(registerButton);
    }
    public String getSuccessMessage(){
        return getElementText(successMessage);
    }
}
