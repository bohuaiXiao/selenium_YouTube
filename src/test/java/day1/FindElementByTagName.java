package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author:
 * @create:
 * @date:
 */
public class FindElementByTagName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
        WebElement h1 = driver.findElement(By.tagName("h1"));
        String h1Txt = h1.getText();
        System.out.println("h1Txt = " + h1Txt);



    }
}
