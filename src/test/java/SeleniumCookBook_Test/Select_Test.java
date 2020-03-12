package SeleniumCookBook_Test;


import day1.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author:
 * @create:
 * @date:
 */
public class Select_Test {


    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dropdown");

        Select dropDown = new Select(driver.findElement(By.cssSelector("#dropdown")));
      //  assertFalse(dropDown.isMultiple());
       // assertEquals(3,dropDown.getOptions().size());


        dropDown.selectByValue("1");

        // SELECT YOUR DATE OF BIRTH
        Select year = new Select(driver.findElement(By.id("year")));
        Select month = new Select(driver.findElement(By.id("month")));
        Select day = new Select(driver.findElement(By.id("day")));
        year.selectByValue("1990");
        month.selectByValue("1");
        day.selectByValue("18");

        // state selection
        Select state = new Select(driver.findElement(By.id("state")));
        state.selectByValue("GA");

        // languages
        Select languages = new Select(driver.findElement(By.name("Languages")));
        if (languages.isMultiple()){
            List<WebElement> options = languages.getOptions();
            for (int i = 0; i < options.size(); i++) {
                if (i%2!=0){
                    languages.selectByValue(options.get(i).getAttribute("value"));
                    System.out.println("Click hte is : "+options.get(i).getAttribute("value"));

                }
            }
        }
        driver.findElement(By.cssSelector("#dropdownMenuLink")).click();
        String targetUrl = "";
        List<WebElement> a = driver.findElement(By.cssSelector("#content > div > div")).findElements(By.tagName("a"));
        for (WebElement each :a
                ) {
            String href = each.getAttribute("href");
            String text = each.getText();
            System.out.println(text+" 's URL is "+ href);
        }
        driver.findElement(By.linkText("Yahoo")).click();

//        WebElement website = driver.findElement(By.cssSelector("#dropdownMenuLink"));
//        List<WebElement> aList = website.findElements(By.tagName("a"));
//        for (WebElement each: aList) {
//
//            String href = each.getAttribute("href");
//            String text = each.getText();
//            System.out.println("The link is "+text+" its URL is "+href);
//            if (text.equals("Yahoo")){
//                each.click();
//            }
//        }


    }

@Test
    public static void assertFalse(boolean options){
        if (options){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

    public static void assertEquals(int count, int actual){
        if (count==actual){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}

