package day4;

import day1.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

/**
 * @author:
 * @create:
 * @date:
 * http://practice.cybertekschool.com/add_remove_elements/
 */
public class Add_RemoveElement {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        BrowserFactory.iWait(3);

        //if i want click 3 times
        WebElement add_element = driver.findElement(By.cssSelector("#content > div > button"));
        for (int i = 0; i <3; i++) {
          add_element.click();
          BrowserFactory.iWait(1);

        }

        WebElement deleteElement = driver.findElement(By.id("elements"));
        List<WebElement> buttons = deleteElement.findElements(By.tagName("button"));
        Iterator<WebElement> iterator = buttons.iterator();
        while(iterator.hasNext()){
            iterator.next().click();
            BrowserFactory.iWait(1);
        }
        System.out.println("Delete all Element");
        BrowserFactory.iWait(3);
        driver.quit();
    }
}
