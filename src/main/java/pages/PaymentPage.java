package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    protected WebDriver driver;
private By checkbox = By.id("billing-address-same-as-shipping-checkmo");
private By totalAmount = By.className("amount");

public PaymentPage (WebDriver driver){
    this.driver=driver;
}

public boolean isShippingAddressActive(){
   return driver.findElement(checkbox).isSelected();

}

public String  getTotalAmount(){
    return driver.findElement(totalAmount).getText();
}
}