package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.security.Key;

public class LoginPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("pass");
    private By buttonSingin = By.id("send2");

    public LoginPage(WebDriver driver){this.driver=driver;}

    public  void typeEmail (String userEmail){
        driver.findElement(emailField).sendKeys(userEmail, Keys.ENTER);
    }

    public void typePassword (String password){
        driver.findElement(emailField).sendKeys(password, Keys.ENTER);
    }

    public void clickButtonSignIn (){
        driver.findElement(buttonSingin).click();
}
}
