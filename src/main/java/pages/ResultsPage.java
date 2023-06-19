package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {
    private WebDriver driver;
    private By resultsStatsLabel = By.id("result-stats");

    public ResultsPage(WebDriver driver){
        this.driver = driver;
    }

    public int getResultsNumber(){
       String textResult = driver.findElement(resultsStatsLabel).getText();
        return Integer.parseInt(textResult.split(" ")[0]) ;
    }
}
