package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage extends PageBase{
    public WishListPage(WebDriver driver) {
        super(driver);
    }
    By quantityField = By.cssSelector("input.qty-input");
    public String getQuantityValue(){
        return getElementValue(quantityField);
    }
}
