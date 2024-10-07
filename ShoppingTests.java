package tests;

import org.checkerframework.checker.units.qual.h;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class ShoppingTests extends BaseTest { 
    public HomePage homePage;
    public LoginPage loginPage;
    String standardUsername = "standard_user";
    String password = "secret_sauce";
    String homePageTitle = "Products";
    int actaulNumberOfItems = 6;

@Test
public void verifySuccessfulAddToCart () {
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    loginPage.basePage();
    loginPage.login(standardUsername, password);
    homePage.verifyUserIsAtHomePage(homePageTitle);
    homePage.verifyProductAddedToCart();

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace ();
    }
}

@Test
    public void verifyNumberOfItems () {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(standardUsername, password);
        homePage.verifyUserIsAtHomePage(homePageTitle);
        homePage.assertNumberOfItems(actaulNumberOfItems);
 
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace ();
    }
}

}


