import org.testng.annotations.Test;

public class Left_Navigation_Menu_Tests extends TestBase {


    @Test
    public void navigateInteractionMenuTestVar1() {

        if (onTheWelcomePage()) {
            clickOnEnLink();
        }


        getInteractionMenuList();


    }


    @Test
    public void navigateInteractionMenuTestVar2() {

        if (onTheWelcomePage()) {
            clickOnEnLink();
        }


        getInteractionMenuItemListVar2();


    }

}