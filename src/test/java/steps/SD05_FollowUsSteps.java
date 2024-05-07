package steps;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

public class SD05_FollowUsSteps extends TestBase {
    HomePage homePage = new HomePage(driver);

    @Given("user is on home page")
    public void user_is_on_home_page() {
        homePage.navigateHomePage();
    }

    @When("user clicks on facebook link")
    public void user_clicks_on_facebook_link() {
        homePage.clickOnFollowUsFacebook();
    }

    @Then("facebook should open in new tab")
    public void facebook_should_open_in_new_tab() {
        if(homePage.getWindowTabs().size()>1) {
            driver.switchTo().window(homePage.getWindowTabs().get(1));
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");
        }
    }
    @Given("user back to home page")
    public void user_back_to_home_page() {
        if(homePage.getWindowTabs().size()>1) {
            driver.close();
            driver.switchTo().window(homePage.getWindowTabs().get(0));
            Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
        }
        else {
            homePage.navigateHomePage();
        }
    }

    @When("user clicks on twitter link")
    public void user_clicks_on_twitter_link() {
        homePage.clickOnFollowUsTwitter();
    }

    @Then("twitter should open in new tab")
    public void twitter_should_open_in_new_tab() {
        if(homePage.getWindowTabs().size()>1) {
            driver.switchTo().window(homePage.getWindowTabs().get(1));
            Assert.assertEquals(driver.getCurrentUrl(), "https://twitter.com/nopCommerce");
        }
    }

    @When("user clicks on rss link")
    public void user_clicks_on_rss_link() {
        homePage.clickOnFollowUsRSS();
    }

    @Then("rss should open in new tab")
    public void rss_should_open_in_new_tab() {
        if(homePage.getWindowTabs().size()>1) {
            driver.switchTo().window(homePage.getWindowTabs().get(1));
            Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open");
        }
    }

    @When("user clicks on youtube link")
    public void user_clicks_on_youtube_link() {
        homePage.clickOnFollowUsYouTube();
    }

    @Then("youtube should open in new tab")
    public void youtube_should_open_in_new_tab() {
        if(homePage.getWindowTabs().size()>1) {
            driver.switchTo().window(homePage.getWindowTabs().get(1));
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");
        }
    }
    // remove commented code
    /*@After
    public void afterScenario(){
        driver.close();
        driver.switchTo().window(homePage.getWindowTabs().get(0));
    }*/
}
