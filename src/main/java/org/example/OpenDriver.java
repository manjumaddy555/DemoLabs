package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenDriver {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nissan.co.uk/");
        Thread.sleep(5000);
        String Manju = driver.getCurrentUrl();
        System.out.println("Print URL: " + Manju);
        WebElement ele = driver.findElement(By.cssSelector(".ot-sdk-container .ot-sdk-row >div > div .banner-actions-container #onetrust-accept-btn-handler"));
        String M = ele.getText();
        System.out.println(M);
        ele.click();

       //Alert alert = driver.switchTo().alert();
       // alert.dismiss();
        //driver.findElement(By.cssSelector("._9vtf ._6lux  > div > input")).sendKeys("M@nju$1996mm");
        //WebElement Bclick = driver.findElement(By.xpath("//button[@name='login']"));
       // Bclick.click();


        //Thread.sleep(5000);
       // accept.click();
       // String Titlre = driver.getTitle();
      //  System.out.println(Titlre);
//driver.close();
    }
}
