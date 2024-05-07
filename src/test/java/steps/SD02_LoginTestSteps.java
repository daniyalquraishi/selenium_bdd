package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

public class SD02_LoginTestSteps extends TestBase {
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Given("user in home page")
    public void user_in_home_page() {
        homePage.navigateHomePage();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }
    @When("user clicks on login")
    public void user_clicks_on_login() {
        homePage.clickOnLogin();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store. Login");
    }
    @When("user enters valid email")
    public void user_enters_valid_email() {
        loginPage.enterValidEmailField();
    }
    @When("user enters password")
    public void user_enters_password() {
        loginPage.enterPasswordField();
    }
    @When("user clicks on logout")
    public void user_clicks_on_logout() {
        homePage.clickOnLogout();
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLogin();
    }
    @When("user enters invalid email")
    public void user_enters_invalid_email() {
        loginPage.enterInValidEmailField();
    }
    @Then("user login successfully")
    public void user_login_successfully() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        Assert.assertTrue(homePage.isMyAccountDisplayed());
    }
    @Then("user login unsuccessfully")
    public void user_login_unsuccessfully() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }

}
