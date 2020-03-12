package day4;

import day1.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Scanner;

/**
 * @author:
 * @create:
 * @date:
 * http://practice.cybertekschool.com/autocomplete
 */
public class AutoComplete {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/autocomplete");
        BrowserFactory.iWait(2);

        WebElement InputElement = driver.findElement(By.cssSelector("#myCountry"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something");
        String text = scanner.nextLine();
        InputElement.sendKeys(text);

        WebElement buttonElement = driver.findElement(By.cssSelector("#content > div > form > input"));
        buttonElement.click();
        String expected = "You selected: "+text;

        WebElement actual = driver.findElement(By.cssSelector("#result"));
        String actualText = actual.getText();

        if (expected.equals(actualText)){
            System.out.println("Test Pass");
        }else {
            System.out.println("Filed Pass");
        }

    }
}
