import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeClass

    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");

    }
    @AfterClass

    public void tearDown(){

        //driver.quit();
    }

    public void type(String text, By locator) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {

        driver.findElement(locator).click();
    }

    public void typeSearchMainPage(String text) {
        type(text, By.name("search"));
        click(By.cssSelector("button[type=submit]"));
    }

    public void returnToPreviousPage() {
        driver.navigate().back();
    }

    public void clickOnEnLink() {
        click(By.cssSelector("a#js-link-box-en"));
    }

    public void clickOnJapLink() {

        click(By.cssSelector("a#js-link-box-ja"));
    }

    public void clickOnSpLink() {

        click(By.cssSelector("a#js-link-box-es"));
    }

    public void clickOnDeLink() {

        click(By.cssSelector("a#js-link-box-de"));

    }

    public void clickOnRusLink() {

    click(By.cssSelector("a#js-link-box-ru"));
    }

    public void clickOnFrLink() {
        click(By.cssSelector("a#js-link-box-fr"));
    }

    public void clickOnItaLink() {
        click(By.cssSelector("a#js-link-box-it"));
    }

    public void clickOnChiLink() {

        click(By.cssSelector("a#js-link-box-zh"));

    }

    public void clickOnPortLink() {

        click(By.cssSelector("a#js-link-box-pt"));


    }

    public void clickOnPolLink() {

    click(By.cssSelector("a#js-link-box-pl"));
    }
}
