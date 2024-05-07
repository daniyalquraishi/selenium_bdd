package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class SD03_CurrenciesTestSteps extends TestBase {
    HomePage homePage = new HomePage(driver);
    @Given("user at home page")
    public void user_at_home_page() {
        homePage.navigateHomePage();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }
    @When("selects Euro currency")
    public void selects_euro_currency() {
        homePage.selectCurrency();
    }
    @Then("verify that prices contain €")
    public void verify_that_prices_contain_€() {
        for (int i = 0; i<homePage.getItemsPricesText().size(); i++){
            Assert.assertTrue(homePage.getItemsPricesText().get(i).contains("€"));
        }
    }

}
