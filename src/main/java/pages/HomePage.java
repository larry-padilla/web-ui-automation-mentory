package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By searchBar = By.cssSelector("textarea[aria-label]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ResultsPage search(String word) {
        driver.findElement(searchBar).sendKeys(word, Keys.ENTER);
        return new ResultsPage(driver);
    }
}
