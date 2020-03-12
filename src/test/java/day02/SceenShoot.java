package day02;

import day1.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

/**
 * @author:
 * @create:
 * @date:
 */
public class SceenShoot {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/javascript_alerts");
       // WebElement form = driver.findElement(By.cssSelector("#content > div.example > form"));
        WebElement element =driver.findElement(By.id("file-upload"));
        File file = new File("/Users/bohuaixiao/Desktop/Screen Shot 2020-02-27 at 7.39.16 PM.png");

        if (file.exists()){
            element.sendKeys(file.getPath());
        }

        WebElement submit = driver.findElement(By.cssSelector("#file-submit"));
        submit.click();

        BrowserFactory.iWait(2);
        driver.close();

    }
}
