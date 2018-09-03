import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikiLogIn extends TestBase {


    @BeforeMethod
    public void EnsurePreconditions() {

        if (onTheWelcomePage()) {
            clickOnEnLink();
        }
        if (isLoggedIn()) {

            ClickOnLogOut();
        }
    }

    @Test
    public void LogInTest() {


        ClickOnLogIn();
        fillLogInForm("DPinto09", "Basketball09");
        confirmLogIn();


        Assert.assertTrue(isLoggedIn());

    }

    @Test
    public void LoginTestNegative() {
        
        ClickOnLogIn();
        fillLogInForm("DPinto", "Basketball09");
        confirmLogIn();

        Assert.assertTrue(isElementPresent(By.cssSelector("div.mw-parser-output")));
    }
}