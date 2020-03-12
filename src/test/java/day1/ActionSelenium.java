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
public class ActionSelenium {
    public WebDriver  driver;

    public void InitDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.imooc.com/user/newlogin");
        driver.manage().window().maximize();
    }

    public  void inputBox(){

      // driver.findElement(By.name("email")).sendKeys("609037724@qq.com");
        String a = driver.findElement(By.name("email")).getAttribute("placeholder");
        System.out.println("a = " + a);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.name("password")).sendKeys("tomxiao7788");
       driver.findElement(By.className("moco-btn moco-btn-red moco-btn-lg btn-full xa-login")).click();
    }

    public void radioBox(){



    }



    public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.bilibili.com/");
       driver.findElement(By.xpath("//*[@id=\"internationalHeader\"]/div[1]/div/div[3]/div[2]/div[1]/span/div/img")).click();





    }
}
