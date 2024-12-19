package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    ChromeDriver driver;

    @Test
    public void takeScreenShot() throws InterruptedException, IOException {
        driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("rammehramehra");
        driver.findElement(By.name("password")).sendKeys("ram@123");
        // click log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Thread.sleep(6000);
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot, new File("Screenshot2.png"));
        System.out.println("Screenshot saved successfully!");

        Thread.sleep(10000);
        driver.close();
    }
}
