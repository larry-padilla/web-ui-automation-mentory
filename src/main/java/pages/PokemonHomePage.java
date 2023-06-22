package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PokemonHomePage {
    public WebDriver driver;
     private By pokedexBtn = By.className("explore");
     private By acceptAllCookiesBtn = By.id("onetrust-accept-btn-handler");

    public PokemonHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPokedex(){
        driver.findElement(pokedexBtn).click();
    }

    public void clickTheButtonCookies(){
        driver.findElement(acceptAllCookiesBtn).click();
    }
}
