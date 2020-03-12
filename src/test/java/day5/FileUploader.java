package day5;

import day1.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

/**
 * @author:
 * @create:
 * @date:
 */
public class FileUploader {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/upload");
        WebElement chooseButton = driver.findElement(By.id("file-upload"));

        File picture = new File("/Users/bohuaixiao/Desktop/image.png");
        if (picture.exists()){
            chooseButton.sendKeys(picture.getPath());
        }
        BrowserFactory.iWait(3);

        driver.findElement(By.cssSelector("#file-submit")).click();
        //driver.close();


    }

    public void upLoading (){

    }

}
