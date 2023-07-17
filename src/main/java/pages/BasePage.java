package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    public WebDriver driver;
    public Actions action;
    private By singInLink = By.className("authorization-link");
    private By welcomeMessage = By.className("logged-in");
    private By menOption = By.className("level0 nav-3 category-item level-top parent ui-menu-item");
    private By topsOption = By.id("ui-id-17");
    private By jacketOption = By.className("level0 nav-3 category-item level-top parent ui-menu-item");

    public BasePage (WebDriver driver,Actions action) {
        this.driver = driver;
        this.action = action;

    }

    public void clickSingIn(){
        driver.findElement(singInLink).click();
    }
    public void hoverMenOption(){
        WebElement menOption = driver.findElement(By.className("level0 nav-3 category-item level-top parent ui-menu-item"));
        action.moveToElement(menOption).perform();
    }
    public void hoverTopsOption(){
        Actions action = new Actions(driver);
        WebElement topsOption = driver.findElement(By.id("ui-id-17"));
        action.moveToElement(topsOption).perform();
    }
    public String getWelcomeMessage(){
        return driver.findElement(welcomeMessage).getText();
    }
    public void clickJacketsOption(){
        driver.findElement(jacketOption).click();
    }
}
