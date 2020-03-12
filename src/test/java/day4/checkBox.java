package day4;

import day1.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author:
 * @create:
 * @date:http://practice.cybertekschool.com/checkboxes
 */
public class checkBox {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        BrowserFactory.iWait(3);
        //find the subElement to locate the <input> subElement
        WebElement checkboxes = driver.findElement(By.id("checkboxes"));
        //create a list for<input>, Loop the list
        List<WebElement> inputList = checkboxes.findElements(By.tagName("input"));
        for (WebElement eachInput :
                inputList) {
            if (!eachInput.isSelected()){
                eachInput.click();
            }else {
                System.out.println("Already selected");
            }
        }
    }




}
