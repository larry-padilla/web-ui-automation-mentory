package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {
    protected WebDriver driver;
    private By titlePageCheckout = By.name("Checkout");
    private By address = By.className("shipping-address-items");
    private By addressSelected = By.className("shipping-address-item selected-item");
    private By detailsQuantity = By.className("details-qty");

    public ShippingPage(WebDriver driver){
        this.driver = driver;
    }

public String getTittlePage (){
        return driver.findElement(titlePageCheckout).getText();
}

public String getAddress(){
        return driver.findElement(address).getText();
}

public String getBorderColorSelectedAddress(){
       return driver.findElement(addressSelected).getCssValue("border-color");
}

public String getTotalNumberItems(){
        return driver.findElement(detailsQuantity).getText();
}
}