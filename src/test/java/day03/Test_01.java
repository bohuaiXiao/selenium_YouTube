package day03;

import day1.BrowserFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author:
 * @create:
 * @date:
 *
 * http://practice.cybertekschool.com/multiple_buttons
 * http://practice.cybertekschool.com/dropdown
 * http://practice.cybertekschool.com/javascript_alerts
 *
 */
public class Test_01 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        buttons.get(0).click();
        String text = driver.switchTo().alert().getText();
        System.out.println("text = " + text);
        driver.switchTo().alert().accept();

        String excepted = "You successfuly clicked an alert";
        String actual = driver.findElement(By.cssSelector("#result")).getText();
        if (excepted.equals(actual)){
            System.out.println("pass");
        }else {
            System.out.println("not pass");
        }

        System.out.println("__________________");

        // button 2
        buttons.get(1).click();
        String text2 = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        String excepted2 = "You clicked: Cancel"    ;
        String actual2 = driver.findElement(By.cssSelector("#result")).getText();

        if (excepted2.equals(actual2)){
            System.out.println(" text 2 is Pass");
        }else {
            System.out.println("text2 is not Pass");
        }

        System.out.println("_____________________"  );

        // button3
        buttons.get(2).click();
        Alert button3 = driver.switchTo().alert();
        String text3 = button3.getText();
        System.out.println(text3);
        button3.sendKeys("Hello world");
        driver.switchTo().alert().accept();
        String result = driver.findElement(By.cssSelector("#result")).getText();
        if (result.contains("Hello world")){
            System.out.println("Pass");
        }else {
            System.out.println("Not Pass");
        }

        BrowserFactory.iWait(3);
        driver.quit();
    }
}
