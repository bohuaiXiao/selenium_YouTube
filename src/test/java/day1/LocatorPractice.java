package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author:
 * @create:
 * @date:
 */
public class LocatorPractice {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome")   ;

        driver.get("http://practice.cybertekschool.com");
        WebElement dropDownLink = driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[3]"));
        dropDownLink.click();

    }
}
