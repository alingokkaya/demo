package testCases;

import pages.DropdownPage;
import pages.WelcomePage;
import utilities.Init;
import org.testng.annotations.Test;

public class DropdownPageTest extends Init {

    @Test
    public void testDropdownPage() throws InterruptedException {
        System.out.println("testMe");
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.verifyWelcomePageTitle();
        welcomePage.verifyWelcomePageHeader();
        welcomePage.clickOnLink("Dropdown");

        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.verifyDropdownPageHeader();
        dropdownPage.selectDropDown(1);
        dropdownPage.selectDropDown("Option 2");
        dropdownPage.selectDropDownByValue("2");
    }
}