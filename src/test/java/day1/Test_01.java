package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author:
 * @create:
 * @date:
 */
public class Test_01 {
    public static void main(String[] args) throws InterruptedException {
        //Open a browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Open Url
        driver.get("http://newtours.demoaut.com/");
        driver.findElement(By.name("userName")).sendKeys("bohuai");
        driver.findElement(By.name("password")).sendKeys("asdasd");
        driver.findElement(By.name("login")).click();
        String title = driver.getTitle();
        System.out.println("title = " + title);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Thread.sleep(3000);
        driver.close();


    }
}
