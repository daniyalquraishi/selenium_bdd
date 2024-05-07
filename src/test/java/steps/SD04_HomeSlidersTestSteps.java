package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class SD04_HomeSlidersTestSteps extends TestBase {
    HomePage homePage = new HomePage(driver);
    @Given("user on home page")
    public void user_on_home_page() {
        homePage.navigateHomePage();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }
    @When("user click on first slider")
    public void user_click_on_first_slider() {
        homePage.clickOnFirstSlider();
    }
    @Then("direct user to new url")
    public void direct_user_to_new_url() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-14-pro");
    }
    @When("user click on second slider")
    public void user_click_on_second_slider() {
        homePage.clickOnSecondSlider();
    }
    @Then("direct user to another url")
    public void direct_user_to_another_url() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/galaxy-s22-ultra");
    }


}
