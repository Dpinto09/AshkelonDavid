import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLangaugeTests extends TestBase {

    @Test
    public void openHomePageOnEn() {

        clickOnEnLink();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://en.wikipedia.org/wiki/Main_Page";

        Assert.assertEquals(actualURL, expectedURL);

        returnToPreviousPage();

    }

    @Test
    public void openHomePageOnJap() {

        clickOnJapLink();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://ja.wikipedia.org/wiki/%E3%83%A1%E3%82%A4%E3%83%B3%E3%83%9A%E3%83%BC%E3%82%B8";

        Assert.assertEquals(actualURL, expectedURL);

        returnToPreviousPage();

    }

    @Test
    public void openHomePageOnSp() {

        clickOnSpLink();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://es.wikipedia.org/wiki/Wikipedia:Portada";

        Assert.assertEquals(actualURL, expectedURL);

        returnToPreviousPage();
    }

    @Test
    public void openHomePageOnDe() {

        clickOnDeLink();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://de.wikipedia.org/wiki/Wikipedia:Hauptseite";

        Assert.assertEquals(actualURL, expectedURL);

        returnToPreviousPage();
    }


    @Test
    public void openHomePageOnRus() {

        clickOnRusLink();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0";

        Assert.assertEquals(actualURL, expectedURL);

        returnToPreviousPage();

    }

    @Test
    public void openHomePageOnFr() {

        clickOnFrLink();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://fr.wikipedia.org/wiki/Wikip%C3%A9dia:Accueil_principal";

        Assert.assertEquals(actualURL, expectedURL);

        returnToPreviousPage();
    }


    @Test
    public void openHomePageOnIta() {

        clickOnItaLink();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://it.wikipedia.org/wiki/Pagina_principale";

        Assert.assertEquals(actualURL, expectedURL);

        returnToPreviousPage();
    }


    @Test
    public void openHomePageOnChi() {

        clickOnChiLink();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://zh.wikipedia.org/wiki/Wikipedia:%E9%A6%96%E9%A1%B5";

        Assert.assertEquals(actualURL, expectedURL);

        returnToPreviousPage();
    }


    @Test
    public void openHomePageOnPort() {

        clickOnPortLink();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://pt.wikipedia.org/wiki/Wikip%C3%A9dia:P%C3%A1gina_principal";

        Assert.assertEquals(actualURL, expectedURL);

        returnToPreviousPage();
    }


    @Test
    public void openHomePageOnPol() {

        clickOnPolLink();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://pl.wikipedia.org/wiki/Wikipedia:Strona_g%C5%82%C3%B3wna";

        Assert.assertEquals(actualURL, expectedURL);

        returnToPreviousPage();
    }

}
