package search;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ResultsPage;

public class SearchTests extends BaseTest {

    @Test
    public void searchByString(){
        ResultsPage resultsPage = homePage.search("Empecemos con selenium en web UI");
        Assert.assertTrue(resultsPage.getResultsNumber()>0);
    }
}
