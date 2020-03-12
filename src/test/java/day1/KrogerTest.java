package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * @author:
 * @create:
 * @date:
 */
public class KrogerTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.kroger.com");
        List<WebElement>  links= driver.findElements(By.tagName("a"));
        int linkAccount = links.size();
        //check how many links this web window have
        System.out.println("linkAccount = " + linkAccount);

        for (int i = 0; i < links.size(); i++) {
            links.get(i).click();
            driver.navigate().back();
            links =driver.findElements(By.tagName("a"));
        }
        driver.close();








    }
}
