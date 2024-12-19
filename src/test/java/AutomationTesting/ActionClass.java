package AutomationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ActionClass {
    ChromeDriver driver;

    @Test
    public void contextClick() throws InterruptedException, AWTException {
        driver = new ChromeDriver();

        driver.get("https://study-notion-frontend-seven-chi.vercel.app/");
        driver.manage().window().maximize();

        WebElement link = driver.findElement(By.cssSelector("a[href='/login']"));

        Thread.sleep(6000);

        Actions actions = new Actions(driver);


        actions.contextClick(link).perform();
        Thread.sleep(3000);

        Robot r = new Robot();

        r.keyPress(KeyEvent.VK_W);
        r.keyRelease(KeyEvent.VK_W);

        Thread.sleep(6000);

        driver.quit();
    }

    @Test
    public void dragAndDrop() throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable,droppable).perform();

        String droppedText = droppable.getText();

        System.out.println("drop text "+droppedText);

        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void mouseHover() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("http://www.actimind.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        WebElement AreaOfExpertise = driver.findElement(By.xpath("//p[contains(text(),'Our experienced team will help you ')]"));
        action.moveToElement(AreaOfExpertise).perform();

        WebElement cloudApp = driver.findElement(By.linkText("Connect with us"));
        Thread.sleep(3000);
        action.moveToElement(cloudApp).click().perform();

        Thread.sleep(4000);
        driver.close();

    }

    @Test
    public void dropDownMenu() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("http://www.istqb.in/");
        driver.manage().window().maximize();

        WebElement foundation = driver.findElement(By.xpath("//span[.='FOUNDATION']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(foundation).perform();

        Thread.sleep(3000);
        WebElement advance = driver.findElement(By.xpath("(//span[text()='ADVANCED'])[1]"));
        actions.moveToElement(advance).perform();

        Thread.sleep(3000);
        WebElement agile = driver.findElement(By.xpath("//a[text()='AGILE']"));
        actions.moveToElement(agile).perform();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Contact']")).click();
        driver.close();
    }

}
