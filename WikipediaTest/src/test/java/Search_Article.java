import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search_Article extends TestBase {


    @Test
    public void SearchMainPage(){



        typeSearchMainPage("Michael Jordan");
        click(By.cssSelector("i.svg-search-icon"));

        String actualSearch = driver.getCurrentUrl();
        String expectedSearch = "https://en.wikipedia.org/wiki/Michael_Jordan";

        Assert.assertEquals(actualSearch,expectedSearch);
    }

}
