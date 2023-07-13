package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    public WebDriver driver;
    private By singInLink = By.className("authorization-link");
    private By welcomeSpan = By.className("logged-in");
    private By menOption = By.className("level0 nav-3 category-item level-top parent ui-menu-item");
    private By topsOption = By.id("ui-id-17");
    private By jacketOption = By.className("level0 nav-3 category-item level-top parent ui-menu-item");

    public BasePage (WebDriver driver) {this.driver = driver;}

    public void clickSingin(){
        driver.findElement(singInLink).click();
    }
    public void hoverMenOption(){
        Actions action = new Actions(driver);
        WebElement menOption = driver.findElement(By.className("level0 nav-3 category-item level-top parent ui-menu-item"));
        action.moveToElement(menOption).perform();
    }
    public void hoverTopsOption(){
        Actions action = new Actions(driver);
        WebElement topsOption = driver.findElement(By.id("ui-id-17"));
        action.moveToElement(topsOption).perform();
    }
    public void getWelcomeSpan(){
        String welcomeMessage = driver.findElement(welcomeSpan).getText();
    }
    public void clickJacketsOption(){
        driver.findElement(jacketOption).click();
    }

}
