package testCases;

import org.testng.annotations.Test;
import pages.WelcomePage;
import utilities.Init;


public class AlertPageTest extends Init {

    @Test
    public void testClickForJSAlert() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLink("JavaScript Alerts");

        pages.AlertPage alertPage = new pages.AlertPage(driver);
        alertPage.verifyAlertPageHeader();
        alertPage.clickOnButton("Click for JS Alert");
        alertPage.accept();

    }

    @Test
    public void testClickForJSConfirm() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLink("JavaScript Alerts");

        pages.AlertPage alertPage = new pages.AlertPage(driver);
        alertPage.verifyAlertPageHeader();
        alertPage.clickOnButton("Click for JS Confirm");
        alertPage.cancel();
    }

    @Test
    public void testClickForJSPrompt() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLink("JavaScript Alerts");

        pages.AlertPage alertPage = new pages.AlertPage(driver);
        alertPage.verifyAlertPageHeader();
        alertPage.clickOnButton("Click for JS Prompt");
        alertPage.typeAndAccept();
    }
}