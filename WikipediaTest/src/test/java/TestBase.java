import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeClass

    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");

    }

    @AfterClass

    public void tearDown() {

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


    public void getInteractionMenuItemListVar2() {
        int size = driver.findElements(By.xpath("//*[@id='p-interaction']//li")).size(); // determine la taille dans le menu
        System.out.println(size);


        for (int i = 1; i <= size; i++)                                                   //  imprime de a 1 a size les elements contenus dans le menu
        {

            List<String> itemsMenu = new ArrayList<>();
            WebElement item = driver.findElement(By.xpath("//*[@id='p-interaction']//li[" + i + "]")); // trouve chaque element par incrementation
            String itemName = item.getText();                                                          // recupere le nom dans le menu
            itemsMenu.add(itemName.toLowerCase());
            System.out.println(itemsMenu);                                                              // imprime
        }
    }

    public void getInteractionMenuList() {
        int size = driver.findElements(By.xpath("//*[@id='p-interaction']//li")).size(); // determine la taille dans le menu
        System.out.println(size);


        for (int i = 1; i <= size; i++) //  imprime de a 1 a size les elements contenus dans le menu
        {

            WebElement item = driver.findElement(By.xpath("//*[@id='p-interaction']//li[" + i + "]")); // trouve chaque element par incrementation
            String itemName = item.getText();                                                          // recupere le nom dans le menu
            System.out.println(itemName);                                                          // imprime
        }
    }

    public boolean onTheWelcomePage() {

        return isElementPresent(By.cssSelector("a#js-link-box-en"));
    }

    public boolean isElementPresent(By locator) {

        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    public void confirmLogIn() {
        click(By.id("wpLoginAttempt"));
    }

    public void fillLogInForm(String user, String password) {
        type(user, By.id("wpName1"));
        type(password, By.id("wpPassword1"));
    }

    public void ClickOnLogIn() {

        click(By.id("pt-login"));
    }

    public boolean isLoggedIn() {

        return isElementPresent(By.id("pt-logout"));
    }

    public void ClickOnLogOut() {

        click(By.cssSelector("li#pt-logout"));
    }
}

