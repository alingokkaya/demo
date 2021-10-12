package testCases;

import pages.CheckBoxesPage;
import pages.WelcomePage;
import utilities.Init;
import org.testng.annotations.Test;


public class CheckBoxesPageTest extends Init {

    @Test
    public void testCheckboxPage() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLink("Checkboxes");

        CheckBoxesPage checkboxesPage = new CheckBoxesPage(driver);
        checkboxesPage.verifyCheckboxPageHeader();
        checkboxesPage.clickOnCheckbox(3);
    }

    @Test
    public void testCheckboxViaSmartWay() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLink("Checkboxes");

        CheckBoxesPage checkboxesPage = new CheckBoxesPage(driver);
        checkboxesPage.verifyCheckboxPageHeader();
        checkboxesPage.clickOnCheckbox(2, false);
    }

    @Test
    public void testToSelectAllCheckboxes() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLink("Checkboxes");

        CheckBoxesPage checkboxesPage = new CheckBoxesPage(driver);
        checkboxesPage.verifyCheckboxPageHeader();
        checkboxesPage.toSelectAllCheckboxes(false);
    }

}