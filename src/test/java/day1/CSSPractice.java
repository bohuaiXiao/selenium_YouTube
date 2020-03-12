package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author:
 * @create:
 * @date:
 */
public class CSSPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.cssSelector("#login > div:nth-child(1) > div > input[type=text]")).sendKeys("bohuaiXiao");
        driver.findElement(By.cssSelector("#login > div:nth-child(2) > div > input[type=password]")).sendKeys("123456");
        driver.findElement(By.cssSelector(" #wooden_spoon")).click();

        Thread.sleep(3000);
        driver.close();
    }
}
