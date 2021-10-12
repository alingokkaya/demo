package testCases;

import pages.WelcomePage;
import utilities.Init;
import org.testng.annotations.Test;


public class WelcomePageTest extends Init {

    @Test
    public void testWelcomePage() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
    }
}