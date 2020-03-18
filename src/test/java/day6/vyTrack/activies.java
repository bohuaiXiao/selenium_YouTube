package day6.vyTrack;

import day1.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author:
 * @create:
 * @date:
 */
public class activies {
    private WebDriver driver;
    private String URL = "http://qa3.vytrack.com";
    private String username = "storemanager85";   //   valid username
    private String password = "UserUser123";
    private By userBy = By.cssSelector("input[name='_username']");
    private By passwordBy = By.cssSelector("input[name='_password']");
    private By submitBy = By.cssSelector("button[id='_submit']");
    private By ActiveBy = By.cssSelector("#main-menu > ul > li:nth-child(5) > a > span");
    private By CreateButtonBy = By.cssSelector("a[title='Create Calendar event']");
    private By startDateBy = By.cssSelector("[id*='date_selector_oro_calendar_event_form_start-uid']");
    private By startTimeBy = By.cssSelector("[id*='time_selector_oro_calendar_event_form_start-uid']");


    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(URL);
        driver.findElement(userBy).sendKeys(username);
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(submitBy).click();
        BrowserFactory.iWait(3);

    }
    @AfterMethod
    public void tearDown(){
        BrowserFactory.iWait(3);
        driver.close();
    }

    @Test
    public void test(){
        BrowserFactory.iWait(3);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(ActiveBy)).perform();
        driver.findElement(By.linkText("Calendar Events")).click();
        BrowserFactory.iWait(2);
        driver.findElement(CreateButtonBy).click();
        BrowserFactory.iWait(1);
        // name
        String nameDefault = driver.findElement(By.cssSelector("#user-menu > a")).getText();
        String nameExpect = driver.findElement(By.cssSelector("span[class='select2-chosen']")).getText().trim();
        Assert.assertEquals(nameDefault,nameExpect);
        //Title
        boolean value = driver.findElement(By.cssSelector("input[name='oro_calendar_event_form[title]']")).getAttribute("value").isEmpty();
        Assert.assertTrue(value);
        System.out.println("EMPTY!");
        //Time
        String startDate = driver.findElement(startDateBy).getAttribute("value");
        String startTime = driver.findElement(startTimeBy).getAttribute("value");
        System.out.println("startDate = " + startDate);
        System.out.println("startTime = " + startTime);
        String expectedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy"));
        Assert.assertEquals(startDate,expectedDate);
        String formatTime = LocalTime.now().format(DateTimeFormatter.ofPattern("h:m a"));
        Assert.assertEquals(startTime,formatTime);

    }
}
