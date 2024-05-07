package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.WishListPage;

public class SD06_WishListSteps extends TestBase {
    HomePage homePage = new HomePage(driver);
    WishListPage wishListPage = new WishListPage(driver);
    @Given("user opens home page")
    public void user_opens_home_page() {
        homePage.navigateHomePage();
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }
    @When("user clicks on product with index {}")
    public void userClicksOnProductWithIndex(int arg0) {
        homePage.clickOnSpecificProductWishList(arg0);
    }
    @Then("success message should displayed")
    public void success_message_should_displayed() {
        Assert.assertEquals(homePage.isWishListSuccessMessageDisplayed(),"The product has been added to your wishlist");
    }
    @Given("success message becomes invisible")
    public void success_message_becomes_invisible() {
        homePage.waitWishListSuccessMessageBecomesInvisible();
    }
    @When("user clicks on wishlist tab")
    public void user_clicks_on_wishlist_tab() {
        homePage.clickOnWishListTab();
    }
    @Then("quantity should be greater than zero")
    public void quantity_should_be_greater_than_zero() {
        Assert.assertNotEquals(wishListPage.getQuantityValue(),"0");
    }

}
