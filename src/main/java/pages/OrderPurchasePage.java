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
    public String getThanksMessage(){
        return driver.findElement(thankYouMessage).getText();
    }
    public String getOrderNumber(){
        return  driver.findElement(orderNumber).getText();
    }

    public  String getLabelEmailMessage(){
        return driver.findElement(labelEmailMessage).getText();
    }
}
