package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PageBase {
    WebDriver driver;
    public PageBase(WebDriver driver) {
        this.driver = driver;
    }
    public void waitPresenceOfElement(By elementLocator) {
        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }
    public void waitElementToBeInvisible(By elementLocator) {
        new WebDriverWait(driver, Duration.ofSeconds(100))
                .until(ExpectedConditions.invisibilityOfElementLocated(elementLocator));
    }
    public void scrollToElementView(By elementLocator) {
        WebElement element = driver.findElement(elementLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void clickOnElement(By elementLocator){
        waitPresenceOfElement(elementLocator);
        scrollToElementView(elementLocator);
        driver.findElement(elementLocator).click();
    }

    public void setElementText (By elementLocator, String text){
        waitPresenceOfElement(elementLocator);
        scrollToElementView(elementLocator);
        driver.findElement(elementLocator).sendKeys(text);
    }
    public String getElementText (By elementLocator){
        waitPresenceOfElement(elementLocator);
        scrollToElementView(elementLocator);
        return driver.findElement(elementLocator).getText();
    }
    public void selectFromDropDown (By elementLocator, String selection){
        waitPresenceOfElement(elementLocator);
        scrollToElementView(elementLocator);
        Select drpDays = new Select(driver.findElement(elementLocator));
        drpDays.selectByValue(selection);
    }
    public boolean elementIsDisplayed(By elementLocator){
        return driver.findElement(elementLocator).isDisplayed();
    }
    public void navigateToHomePage() {
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }
    public List<WebElement> findElementsList(By elementLocator){
      return  driver.findElements(elementLocator);
    }
    public List <String> getWindowTabs (){
        List <String> tabs = new ArrayList<>(driver.getWindowHandles());
        return tabs;
    }

    public String getElementValue (By elementLocator){
        waitPresenceOfElement(elementLocator);
        scrollToElementView(elementLocator);
        return driver.findElement(elementLocator).getAttribute("value");
    }

}
