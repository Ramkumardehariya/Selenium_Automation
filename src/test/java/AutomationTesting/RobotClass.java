package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {
    ChromeDriver driver;

    @Test
    public void Keyboard_Mouse_Operations() throws InterruptedException, AWTException {
        driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("rammehramehra");

        driver.findElement(By.name("password")).sendKeys("ram@123");

        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(6000);

        Robot r = new Robot();
        r.mouseMove(400,400);

        Thread.sleep(4000);

        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_F);
        r.keyRelease(KeyEvent.VK_F);
        r.keyRelease(KeyEvent.VK_ALT);

        Thread.sleep(5000);
        r.keyRelease(KeyEvent.VK_WINDOWS);
        r.keyRelease(KeyEvent.VK_WINDOWS);

        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_WINDOWS);
        r.keyPress(KeyEvent.VK_PRINTSCREEN);
        r.keyRelease(KeyEvent.VK_PRINTSCREEN);
        r.keyRelease(KeyEvent.VK_WINDOWS);

        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_WINDOWS);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_WINDOWS);

        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_D);
        r.keyRelease(KeyEvent.VK_D);
        r.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_F);
        r.keyRelease(KeyEvent.VK_F);
        r.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(10000);
        driver.close();
    }
}
