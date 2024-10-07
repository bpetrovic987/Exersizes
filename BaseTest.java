package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    public WebDriver driver;

@Before
public void setup () {
    System.setProperty("webdriver.chromedriver", "C:\\Users\\Korisnik\\Desktop\\Biljana September 2024\\NewTestProject\\NewTestProject\\lib\\chromedriver.exe");
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    }

@After
    public void teardown() {
        driver.quit();
    }
}
