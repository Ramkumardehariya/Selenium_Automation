package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigators {
    ChromeDriver driver;

    @Test
    public void BrowserNavigation() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("rammehramehra");

        driver.findElement(By.name("password")).sendKeys("ram@123");

        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Thread.sleep(6000);
        driver.navigate().to("https://www.instagram.com/rammehramehra/?next=%2F");

        Thread.sleep(4000);
        driver.navigate().back();

        Thread.sleep(4000);
        driver.navigate().forward();

        Thread.sleep(4000);
        driver.navigate().refresh();

        Thread.sleep(15000);
        driver.close();
    }
}
