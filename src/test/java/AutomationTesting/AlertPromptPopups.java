package AutomationTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;

public class AlertPromptPopups {

    ChromeDriver driver;

    @Test
    public void AlertButton() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(5000);
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
        driver.close();

    }
    @Test
    public  void  timerAlertButton() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1200)");
        Thread.sleep(2000);
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(6000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void confirmButton() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 900)");
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        //Switch to alert pop up
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(2000);
//    alert.dismiss();
        alert.accept();
        Thread.sleep(3000);
        driver.close();

    }

    @Test
    public void Alert_Promptpopup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 900)");
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
        //Switch to alert pop up
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Dharshan");
        Thread.sleep(2000);
//      alert.dismiss();
        alert.accept();
        Thread.sleep(3000);
        driver.close();

    }

    @Test
    public void hiddonDivisionPopUp() throws InterruptedException{

        driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='28']")).click();


        Thread.sleep(4000);
       driver.close();
    }

}
