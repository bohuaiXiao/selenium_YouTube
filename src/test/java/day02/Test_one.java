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
public class Test_one {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        WebElement ul = driver.findElement(By.className("list-group"));
        List<WebElement> elementList = ul.findElements(By.tagName("li"));

        for (WebElement each:elementList
             ) {
            WebElement a = each.findElement(By.tagName("a"));
            System.out.println(a.getText());
        }


    }
    }
