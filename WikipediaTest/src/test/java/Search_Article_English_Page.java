import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search_Article_English_Page extends TestBase {

    @Test
    public void searchArticleEnPage() {

        clickOnEnLink();
        type("Marie Curie", By.name("search"));
        click(By.cssSelector("input#searchButton"));

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://en.wikipedia.org/wiki/Marie_Curie";

        Assert.assertEquals(actualURL, expectedURL);

        returnToPreviousPage();
    }

}
