package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage (WebDriver driver) {
    super (driver);
    }

    By homePageTitleBy = By.className("title");
    By addToCartButton1By = By.id("add-to-cart-sauce-labs-backpack");
    By addToCartButton2By = By.id("add-to-cart-sauce-labs-bike-light");
    By shoppingCartBeigeBy = By.className("shopping_cart_badge");
    By numberOfItemsBy = By.className("inventory_item");
    By burgerMenuBy = By.id("react-burger-menu-btn");
    By aboutButtonBy = By.id("about_sidebar_link");


    public HomePage verifyUserIsAtHomePage (String expectedText) {
        String actualText = readText(homePageTitleBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public HomePage verifyProductAddedToCart () {
        click(addToCartButton1By);
        click(addToCartButton2By);
        waitVisability(shoppingCartBeigeBy);
        return this;
    }

    public HomePage assertNumberOfItems (int expectedNumberOfItems) {
        int actaulNumberOfItems = countItems(numberOfItemsBy);
        assertIntegerEquals(expectedNumberOfItems, actaulNumberOfItems);
        return this;
    }

    public HomePage clickOnMenuButton () {
        click(burgerMenuBy);
        return this;
    }

    public HomePage verifyAboutLink (String expectedLink) {
        String actualLink = readLink(aboutButtonBy);
        assertTextEquals(expectedLink, actualLink);
        return this;
    }

    }

