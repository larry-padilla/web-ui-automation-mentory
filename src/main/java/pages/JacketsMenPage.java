package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JacketsMenPage {

    protected WebDriver driver;
    protected Actions action;
    private By cardOfJackets = By.className("product-item-info");
    private By sizeButtonS = By.id("option-label-size-143-item-167");
    private By colorButton = By.id("option-label-color-93-item-56");
    private By addToCartButton = By.className("action tocart primary");
    private By succesMessage = By.className("message-success success message");
    private By iconCart = By.className("action showcart");
    private By  checkoutButton = By.id("top-cart-btn-checkout");

    public JacketsMenPage (WebDriver driver,Actions action) {
        this.driver = driver;
        this.action = action;
    }

    public void hoverCardOfJacket(){
        WebElement cardOfJackets = driver.findElement(By.className("product-item-info"));
    }
    public void  clickSizeButton(){
        driver.findElement(sizeButtonS).click();
    }

    public void clickColorButton(){

    driver.findElement(colorButton).click();
    }

    public void clickAddToCart(){
        driver.findElement(addToCartButton).click();
    }

    public String getSuccessMessage(){
        return driver.findElement(succesMessage).getText();
    }

    public void clickIconCart(){
        driver.findElement(iconCart).click();
    }

    public void clickCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }
}