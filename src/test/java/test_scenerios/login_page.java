package test_scenerios;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.inventory;
import objects.login_page_valid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class login_page {
    WebDriver driver;
    login_page_valid obj;
    inventory obj1;

    public login_page() {
    }

    @BeforeTest
    public void beforetest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void login() throws InterruptedException {
        Thread.sleep(5000);
        login_page_valid page = new login_page_valid(driver);
    }
    @Test
    public void login_valid_creds() throws InterruptedException {
    obj = new login_page_valid(driver);
    obj.loginpage();
    }

    @Test
    public void get_count() {
        obj1 = new inventory(driver);
        obj1.count_prices();
    }
    @Test
    public void filters() throws InterruptedException {
        obj1 = new inventory(driver);
        obj1.filter_values();
    }

    @AfterTest
    public void aftertest()
    {
        driver.quit();
    }
}
