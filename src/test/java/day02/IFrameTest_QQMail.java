package day02;

import day1.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author:
 * @create:
 * @date:
 */
public class IFrameTest_QQMail {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://mail.qq.com/");

        WebElement frame = driver.findElement(By.id("login_frame"));
        driver.switchTo().frame(frame);
        driver.findElement(By.cssSelector("#u")).sendKeys("471116123");
        BrowserFactory.iWait(1);
        driver.findElement(By.cssSelector("#p")).sendKeys("tomxiao7788");
        BrowserFactory.iWait(1);
        driver.findElement(By.cssSelector("#p_low_login_enable")).click();
        BrowserFactory.iWait(1);

        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("body > div > div.header > div > a:nth-child(2)")).click();
        BrowserFactory.iWait(3);

        driver.findElement(By.id("login_button")).click();
        BrowserFactory.iWait(3);

        driver.quit();
    }
}
