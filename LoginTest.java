package tests;

import java.util.Stack;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
   
    public LoginPage loginPage;
    public HomePage homePage;

    String standardUsername = "standard_user";
    String emptyUsername = "";
    String invalidUsername = "standard";
    String password = "secret_sauce";
    String emptyPassword = "";
    String invalidPassword = "secret_sauce1";
    String homePageTitle = "Products";
    String lockedOutUser = "locked_out_user";
    String lockedOutUserError = "Epic sadface: Sorry, this user has been locked out.";
    String emptyUsernameError = "Epic sadface: Username is required";
    String emptyPasswordError = "Epic sadface: Password is required";
    String invalidCredentialsError = "Epic sadface: Username and password do not match any user in this service";

@Test
public void verifySuccessfulLogin () {
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    loginPage.basePage();
    loginPage.login (standardUsername, password);
    homePage.verifyUserIsAtHomePage(homePageTitle);

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
       e.printStackTrace ();
    }
}

@Test
public void verifyLockedOutUserUnsuccessfulLogin () {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.login(lockedOutUser, password);
    loginPage.verifyunSuccessfulLogin(lockedOutUserError);

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
       e.printStackTrace ();
    }
}

@Test
public void verifyEmptyUsernameUnsuccessfulLogin () {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.login(emptyUsername, password);
    loginPage.verifyunSuccessfulLogin(emptyUsernameError);

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace ();
    }
}

@Test
public void verifyEmptyPasswordUnsuccessfulLogin () {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.login(standardUsername, emptyPassword);
    loginPage.verifyunSuccessfulLogin(emptyPasswordError);

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace ();
    }
}

@Test
public void verifyInvalidPasswordUnsuccessfulLogin() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.login(standardUsername, invalidPassword);
    loginPage.verifyunSuccessfulLogin(invalidCredentialsError);
    
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace ();
    }
    }

@Test
public void verifyInvalidUsernameUnsuccessfulLogin() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.basePage();
    loginPage.login(invalidUsername, password);
    loginPage.verifyunSuccessfulLogin(invalidCredentialsError);

    try {
        Thread.sleep(5000);
    }   catch (InterruptedException e) {
        e.printStackTrace ();
    }
}

}


