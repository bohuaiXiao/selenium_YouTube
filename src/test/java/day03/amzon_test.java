package day03;

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
public class amzon_test {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://www.amazon.com/");

        List<WebElement> imgList = driver.findElements(By.tagName("img"));
        for (WebElement each: imgList
             ) {
            System.out.println(each.getText());
        }

    }
}
