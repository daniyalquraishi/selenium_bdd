package steps;

import base.TestBase;
import pages.HomePage;
import pages.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SD01_RegistrationTestSteps extends TestBase {
    HomePage homePage = new HomePage(driver);
    RegistrationPage registrationPage = new RegistrationPage(driver);

    @Given("user is in home page")
    public void user_is_in_home_page() {
        homePage.navigateHomePage();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }
    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        homePage.clickOnRegister();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store. Register");
    }

    @When("user enters registration data with firstName as {string} and lastName as {string} and birthDay as {string} and birthMonth as {string} and birthYear as {string} and email as {string} and company as {string} and password as {string} and confirmedPassword as {string}")
    public void user_enters_registration_data_with_first_name_as_and_last_name_as_and_birth_day_as_and_birth_month_as_and_birth_year_as_and_email_as_and_company_as_and_password_as_and_confirmed_password_as(String  firstNameText, String lastNameText, String dayText, String monthText, String yearText, String emailText, String companyText, String passwordText, String confirmedPasswordText) {
        registrationPage.selectGender();
        registrationPage.enterFirstName(firstNameText);
        registrationPage.enterLastName(lastNameText);
        registrationPage.selectDayOfBirth(dayText);
        registrationPage.selectMonthOfBirth(monthText);
        registrationPage.selectYearOfBirth(yearText);
        registrationPage.enterEmail(emailText);
        registrationPage.enterCompany(companyText);
        registrationPage.enterPassword(passwordText);
        registrationPage.enterConfirmedPassword(confirmedPasswordText);
    }

    @When("clicks on register button")
    public void clicks_on_register_button() {
        registrationPage.clickRegister();
    }
    @Then("user registration success message is displayed")
    public void user_registration_success_message_is_displayed() {
        Assert.assertEquals(registrationPage.getSuccessMessage(),"Your registration completed");
    }
}
