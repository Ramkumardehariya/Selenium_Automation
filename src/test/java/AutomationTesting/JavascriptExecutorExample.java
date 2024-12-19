package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class JavascriptExecutorExample {
    ChromeDriver driver;

    @Test
    public void enterTextintoDisabledTextbox() throws InterruptedException{

        driver = new ChromeDriver();
        driver.get("F:\\javatest\\DisabledTextBox.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t1').value='admin'");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t2').value=''");
        js.executeScript("document.getElementById('t2').value='manager'");
        js.executeScript("document.getElementById('t2').type='button'");

    }

    @Test
    public void ScrollUpandDown() throws InterruptedException{

        driver = new ChromeDriver();

        driver.get("https://study-notion-frontend-seven-chi.vercel.app/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 1; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 1000)");
            Thread.sleep(3000);
        }

        for (int i = 1; i < 10; i++) {
            js.executeScript("window.scrollBy(0, -1000)");
            Thread.sleep(3000);
        }

        driver.close();
    }

    @Test
    public void ScrollUpandDowntospecificElementonWebpage() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://study-notion-frontend-seven-chi.vercel.app/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@href='/login']")).click();

        WebElement ele = driver.findElement(By.xpath("//a[@href='/']"));
        Thread.sleep(3000);
        int x = ele.getLocation().getX();
        int y = ele.getLocation().getY();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+", "+y+")");
        Thread.sleep(3000);

    }

    @Test
    public  void javaScriiptExcutorExample() throws InterruptedException{
        driver = new ChromeDriver();

        driver.get("https://study-notion-frontend-seven-chi.vercel.app/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(3000);

        //Scroll to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        //Highlight an element
        WebElement element = driver.findElement(By.xpath("//h1[text()='Languages']"));
        js.executeScript("arguments[0].style.border='3px solid red'", element);

        //Fetch the page title
        String title = (String) js.executeScript("return document.title;");
        System.out.println("Page Title: " + title);

        Thread.sleep(5000);

        long start = System.currentTimeMillis();
        js.executeAsyncScript(
                "var callback = arguments[arguments.length - 1];" +
                        "setTimeout(function() {" +
                        "   callback('AJAX call complete');" +
                        "}, 4000);"
        );
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms");

        Thread.sleep(6000);
        driver.close();
    }


}
