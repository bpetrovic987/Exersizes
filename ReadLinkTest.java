package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.LoginPage;

public class ReadLinkTest extends BaseTest {

    String standardUsername = "standard_user";
    String password = "secret_sauce";
    String expectedAboutLink = "https://saucelabs.com/";
    String homePageTitle = "Products";
    
@Test
public void VerifyAboutLink () {
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    loginPage.basePage();
    loginPage.login(standardUsername, password);
    homePage.verifyUserIsAtHomePage(homePageTitle);
    homePage.clickOnMenuButton();
    homePage.verifyAboutLink(expectedAboutLink);

    try {
        Thread.sleep(5000);
    }   catch (InterruptedException e) {
        e.printStackTrace ();
    }
}

}

