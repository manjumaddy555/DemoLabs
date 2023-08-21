package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class inventory {
    WebDriver driver;

    public inventory(WebDriver driver) {
        this.driver = driver;
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

