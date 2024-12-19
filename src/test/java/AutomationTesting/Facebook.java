package AutomationTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
    ChromeDriver driver;

    @Test
    public void facebookLogIn() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login.php/");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("7489629277");
        driver.findElement(By.name("pass")).sendKeys("ram@123");

        driver.findElement(By.name("login")).click();

        Thread.sleep(30000);
        driver.close();
    }
}
