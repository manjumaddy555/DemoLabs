package objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class login_page_valid {
        WebDriver driver;

       public login_page_valid(WebDriver driver) {
               this.driver = driver;
       }
        By username = By.xpath("//input[@name='user-name']");
        By password = By.xpath("//input[@name='password']");
        By login = By.xpath("//input[@name='login-button']");

        public void loginpage() throws InterruptedException {
                driver.findElement(username).sendKeys("standard_user");
                driver.findElement(password).sendKeys("secret_sauce");
                driver.findElement(login).click();
                Thread.sleep(5000);
                driver.manage().window().maximize();
                String m = driver.getCurrentUrl();
                assertEquals(m,"https://www.saucedemo.com/inventory.html");
                System.out.println("User Succussfully Loggedin into Inventory");
        }
    @FindBy(css = ".pricebar")
    List<WebElement> price_items;
    By filter = By.xpath(".right_component >span .product_sort_container");


    public void count_prices() {
        int m = price_items.size();
        System.out.println("s" + m);
    }

    public void  filter_values() throws InterruptedException {
        WebElement dropdown = driver.findElement(filter);
        Select selobj = new Select(dropdown);
        selobj.selectByIndex(2);
        Thread.sleep(1000);
    }

}
