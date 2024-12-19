package AutomationTesting;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    ChromeDriver driver;

    @Test
    public  void  handlingFrames() throws  InterruptedException{
        driver = new ChromeDriver();

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.switchTo().frame(0);
        WebElement frame1Input = driver.findElement(By.name("mytext1"));
        frame1Input.sendKeys("Hello from Frame 1");
        System.out.println("Entered text in Frame 1.");
        driver.switchTo().defaultContent();


        Thread.sleep(2000);
        driver.switchTo().frame(1);
        WebElement frame2Input = driver.findElement(By.name("mytext2"));
        frame2Input.sendKeys("Hello from Frame 2");
        System.out.println("Entered text in Frame 2.");
        driver.switchTo().defaultContent();


        Thread.sleep(2000);
        driver.switchTo().frame(2);
        WebElement frame3Input = driver.findElement(By.name("mytext3"));
        frame3Input.sendKeys("Hello from Frame 3");
        System.out.println("Entered text in Frame 3.");
        driver.switchTo().defaultContent();


        Thread.sleep(2000);
        driver.switchTo().frame(3);
        WebElement nestedFrameInput = driver.findElement(By.name("mytext4"));
        nestedFrameInput.sendKeys("Hello from Nested Frame");
        System.out.println("Entered text in the Nested Frame.");
        driver.switchTo().defaultContent();


        Thread.sleep(2000);
        driver.switchTo().frame(4);
        WebElement frame5Input = driver.findElement(By.name("mytext5"));
        frame5Input.sendKeys("Hello from Frame 5");
        System.out.println("Entered text in Frame 5.");
        driver.switchTo().defaultContent();

        Thread.sleep(6000);
        driver.close();
    }
}
