/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Mattafire
 */
public class Selenium {

    public static void main(String[] args) {

        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\geckodriver-v0.11.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.id("gsr"));
        element.sendKeys("Rexburg, Idaho"); // send also a "\n"
        element.submit();

    }

}
