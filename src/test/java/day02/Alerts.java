package day02;

import day1.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author:
 * @create:
 * @date:
 */
public class Alerts {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        List<WebElement> button = driver.findElements(By.tagName("button"));
        button.get(0).click();
        BrowserFactory.iWait(2);
        // to get the text from popup message
        String text = driver.switchTo().alert().getText();
        System.out.println("text = " + text);
        driver.switchTo().alert().accept();// to click OK；

        String expected = "You successfuly clicked an alert";
        String actual = driver.findElement(By.id("result")).getText();
        if (expected.equals(actual)){
            System.out.println("TEST PASS");
        }else {
            System.out.println("TEST NOT PASS");
            System.out.println("Your expected is "+ expected);
            System.out.println("Your actual is "+ actual);
        }
        BrowserFactory.iWait(3);
        driver.quit();


    }
}
