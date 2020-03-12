package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author:
 * @create:
 * @date:
 */
public class BrowserFactory {
    public static WebDriver getDriver(String browser){
       if (browser.equalsIgnoreCase("chrome")){
           WebDriverManager.chromedriver().setup();
           return new ChromeDriver();
       }else if (browser.equals("firefox")){
           WebDriverManager.firefoxdriver().setup();
           return new FirefoxDriver();
       }else {
           return null;
       }
    }

    public static void iWait(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
