package day03;

import day1.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * @author:
 * @create:
 * @date:
 * http://practice.cybertekschool.com/dropdown
 */
public class Test_02 {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select dropDown = new Select(driver.findElement(By.cssSelector("#dropdown")));
        dropDown.selectByValue("1");
        dropDown.selectByVisibleText("Option 1");

        //year
        Select years = new Select(driver.findElement(By.cssSelector("#year")));
        years.selectByValue("1990");
        // month
        Select month = new Select(driver.findElement(By.cssSelector("#month")));
        month.selectByVisibleText("February");
        // days
        Select day = new Select(driver.findElement(By.cssSelector("#day")));
        day.selectByValue("18");

        //State
        Select state = new Select(driver.findElement(By.cssSelector("#state")));
        state.selectByValue("GA");

        //language
        Select language = new Select(driver.findElement(By.cssSelector("#content > select:nth-child(21)")));
        if (language.isMultiple()){
            List<WebElement> options = language.getOptions();

            String a = options.get(0).getText();

            language.selectByVisibleText(a);

            BrowserFactory.iWait(3);

            driver.findElement(By.cssSelector("#dropdownMenuLink")).click();
            driver.findElement(By.linkText("Google")).click();
            BrowserFactory.iWait(4);
            driver.quit();

        }
    }
}
