package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author:
 * @create:
 * @date:
 */
public class xPathPractice {
    public static void main(String[] args) {
   WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a")).click();


    }
}
