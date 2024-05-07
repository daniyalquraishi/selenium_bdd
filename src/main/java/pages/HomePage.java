package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");
    By logoutLink = By.linkText("Log out");
    By myAccountLink = By.linkText("My account");
    By currenciesList = By.id("customerCurrency");
    By itemsPricesText = By.cssSelector("div.prices");
    By firstSlider = By.linkText("1");
    By secondSlider = By.linkText("2");
    By followUsFacebookButton = By.linkText("Facebook");
    By followUsTwitterButton = By.linkText("Twitter");
    By followUsRSSButton = By.linkText("RSS");
    By followUsYouTubeButton = By.linkText("YouTube");
    By wishListSuccessMessage = By.cssSelector("div.success>p.content");
    By wishListButtons = By.cssSelector("button.add-to-wishlist-button");
    By wishListTab = By.linkText("Wishlist");

    public void clickOnRegister(){
        clickOnElement(registerLink);
    }
    public void clickOnLogin(){
        clickOnElement(loginLink);
    }
    public void clickOnLogout(){
        if(elementIsDisplayed(logoutLink)) {
            clickOnElement(logoutLink);
        }
        else
            return;
    }
    public void navigateHomePage() {
        navigateToHomePage();
    }
    public boolean isMyAccountDisplayed(){
        return elementIsDisplayed(myAccountLink);
    }

    public void selectCurrency(){
        selectFromDropDown(currenciesList,"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }
    public List<String> getItemsPricesText(){
        List <String> pricesValues = new ArrayList<>();

        for (int i = 0; i<findElementsList(itemsPricesText).size(); i++){
            String str = findElementsList(itemsPricesText).get(i).getText();
            pricesValues.add(str);
        }
        return pricesValues;
    }
    public void clickOnFirstSlider(){
        clickOnElement(firstSlider);
    }
    public void clickOnSecondSlider(){
        clickOnElement(secondSlider);
    }
    public void clickOnFollowUsFacebook (){
        clickOnElement(followUsFacebookButton);
    }
    public void clickOnFollowUsTwitter (){
        clickOnElement(followUsTwitterButton);
    }
    public void clickOnFollowUsRSS (){
        clickOnElement(followUsRSSButton);
    }
    public void clickOnFollowUsYouTube (){
        clickOnElement(followUsYouTubeButton);
    }
    public void clickOnSpecificProductWishList(int productIndex){
        for (int i=0; i<findElementsList(wishListButtons).size();i++) {
            if (i == productIndex) {
                findElementsList(wishListButtons).get(i).click();
                break;
            }
            else
                continue;
        }
    }
    public String isWishListSuccessMessageDisplayed(){
        return getElementText(wishListSuccessMessage);
    }
    public void waitWishListSuccessMessageBecomesInvisible(){
        waitElementToBeInvisible(wishListSuccessMessage);
    }
    public void clickOnWishListTab(){
        clickOnElement(wishListTab);
    }


}
