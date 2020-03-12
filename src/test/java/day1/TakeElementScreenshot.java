package day1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author:
 * @create:
 * @date:
 */
public class TakeElementScreenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("#content > ul > li:nth-child(21)")).click();
        driver.findElement(By.linkText("Form Authentication")).click();

        WebElement name = driver.findElement(By.cssSelector("#login > div:nth-child(1) > div > input[type=text]"));
        WebElement password = driver.findElement(By.cssSelector("#login > div:nth-child(2) > div > input[type=password]"));
        WebElement login = driver.findElement(By.cssSelector("#wooden_spoon"));

        File screenshot = name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("./target/screenshots/name.png"));

        name.sendKeys("bohuaiXiao");
        password.sendKeys("Cybertek111");
        login.click();

        driver.quit();

    }
}
