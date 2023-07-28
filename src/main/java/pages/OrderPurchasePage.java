package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPurchasePage {
    protected WebDriver driver;
    private By thankYouMessage = By.className("base");
    private By orderNumber = By.className("order-number");
    private By labelEmailMessage = By.tagName("p");

    public OrderPurchasePage(WebDriver driver){
        this.driver=driver;
    }
    public String verifyThanksMessage(){
        return driver.findElement(thankYouMessage).getText();
    }
    public String verifyOrderNumber(){
        return  driver.findElement(orderNumber).getText();
    }

    public  String verifyLabelEmailMessage(){
        return driver.findElement(labelEmailMessage).getText();
    }
}
