package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    private WebDriver driver;
    private String tittle;
    private By navItemOrders = By.linkText("My Orders");
    private By orderId = By.className("col id");
    private By orderDate = By.className("col date");
    private By orderShipping = By.className("col shipping");
    private By orderTotal = By.className("col total");

    public MyAccountPage (WebDriver driver){this.driver=driver;}

    public String getTittle() {
        return driver.getTitle();
    }

    public void clickMyOrders(){
        driver.findElement(navItemOrders).click();
    }

    public String getOrderId(){
        return driver.findElement(orderId).getText();
    }

    public String getOrderDate(){
        return driver.findElement(orderDate).getText();
    }

    public String getOrderShipping(){
        return driver.findElement(orderShipping).getText();
    }

    public String getOrderTotal(){
        return driver.findElement(orderTotal).getText();
    }
}