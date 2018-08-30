import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Naviagate_Menu_Left extends TestBase {



    @Test
            public void navigateMenu(){

        clickOnEnLink();

        List<WebElement> leftMenu = driver.findElements(By.cssSelector("div#p-navigation"));

        for(WebElement e: leftMenu ){

            click(By.cssSelector("li#n-mainpage-description"));
            String actualURL0 = driver.getCurrentUrl();
            String expectedURL0 =  "https://en.wikipedia.org/wiki/Main_Page";

            Assert.assertEquals(actualURL0,expectedURL0);

           click(By.cssSelector("li#n-contents"));
           String actualURL1 = driver.getCurrentUrl();
           String expectedURL1 = "https://en.wikipedia.org/wiki/Portal:Contents";

           Assert.assertEquals(actualURL1,expectedURL1);

            click(By.cssSelector("li#n-featuredcontent"));

            String actualURL2 = driver.getCurrentUrl();
            String expectedURL2 =  "https://en.wikipedia.org/wiki/Portal:Featured_content";

            Assert.assertEquals(actualURL2,expectedURL2);

            click(By.cssSelector("li#n-currentevents"));

            String actualURL3 = driver.getCurrentUrl();
            String expectedURL3 =  "https://en.wikipedia.org/wiki/Portal:Current_events";

            Assert.assertEquals(actualURL3,expectedURL3);

            click(By.cssSelector("li#n-randompage"));

            click(By.cssSelector("li#n-sitesupport"));

            String actualURL4 = driver.getCurrentUrl();
            String expectedURL4 =  "https://donate.wikimedia.org/w/index.php?title=Special:LandingPage&country=IL&uselang=en&utm_medium=sidebar&utm_source=donate&utm_campaign=C13_en.wikipedia.org";

            Assert.assertEquals(actualURL4,expectedURL4);

            click(By.cssSelector("li#n-shoplink"));

            String actualURL5 = driver.getCurrentUrl();
            String expectedURL5 =  "https://store.wikimedia.org/";

            Assert.assertEquals(actualURL5,expectedURL5);
        }

        returnToPreviousPage();
    }





}
/*@Test

    public void MainPage(){

        click(By.cssSelector("a#js-link-box-en"));


        String actualURL = driver.getCurrentUrl();
        String expectedURL =  "https://en.wikipedia.org/wiki/Main_Page";

        Assert.assertEquals(actualURL,expectedURL);



}

    @Test
    public void Contents(){

        click(By.cssSelector("li#n-contents"));

        String actualURL = driver.getCurrentUrl();
        String expectedURL =  "https://en.wikipedia.org/wiki/Portal:Contents";

        Assert.assertEquals(actualURL,expectedURL);

        returnToPreviousPage();

}

    @Test
    public void FeaturedContent(){

        click(By.cssSelector("li#n-featuredcontent"));

        String actualURL = driver.getCurrentUrl();
        String expectedURL =  "https://en.wikipedia.org/wiki/Portal:Featured_content";

        Assert.assertEquals(actualURL,expectedURL);

        returnToPreviousPage();
    }

    @Test
    public void CurrentEvents(){

        click(By.cssSelector("li#n-currentevents"));

        String actualURL = driver.getCurrentUrl();
        String expectedURL =  "https://en.wikipedia.org/wiki/Portal:Current_events";

        Assert.assertEquals(actualURL,expectedURL);

        returnToPreviousPage();

}

    @Test
    public void RandomArticle(){

        click(By.cssSelector("li#n-randompage"));

        String actualURL = driver.getCurrentUrl();
        String expectedURL =  "https://en.wikipedia.org/wiki/Bus_contracting_model_of_Singapore";

        Assert.assertEquals(actualURL,expectedURL);

        returnToPreviousPage();
    }

    @Test
    public void DonateToWiki(){

        click(By.cssSelector("li#n-sitesupport"));

        String actualURL = driver.getCurrentUrl();
        String expectedURL =  "https://donate.wikimedia.org/w/index.php?title=Special:LandingPage&country=IL&uselang=en&utm_medium=sidebar&utm_source=donate&utm_campaign=C13_en.wikipedia.org";

        Assert.assertEquals(actualURL,expectedURL);

        returnToPreviousPage();

    }

    @Test
    public void WikiStore(){

        click(By.cssSelector("li#n-shoplink"));

        String actualURL = driver.getCurrentUrl();
        String expectedURL =  "https://store.wikimedia.org/";

        Assert.assertEquals(actualURL,expectedURL);

        returnToPreviousPage();

    }

}
*/