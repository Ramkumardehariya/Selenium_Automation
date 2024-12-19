package AutomationTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class ChildBrowserPopups {
    ChromeDriver driver;

    @Test
    public void printWindowHandle() throws InterruptedException{
        driver = new ChromeDriver();

        driver.get("https://www.irctc.co.in/nget/train-search");

        String windowhandle = driver.getWindowHandle();

        System.out.println("Window handles is: "+windowhandle);
    }

    @Test
    public void childBrowser() throws InterruptedException{

        driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");

        Set<String> allWindowHandles = driver.getWindowHandles();

        int count = allWindowHandles.size();
        System.out.println("Number of browser windows opened on the system is : "+ count);
        for (String windowHandle : allWindowHandles) {
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
            System.out.println("Window handle id of page -->" + title + " --> is : " + windowHandle);
            driver.close();
        }

    }

    @Test
    public void closeMainBrowserOnly() throws  InterruptedException{

        driver = new ChromeDriver();
        driver.get("https://study-notion-frontend-seven-chi.vercel.app/login");

        String parentWindowhandleID = driver.getWindowHandle();
        String title = driver.getTitle();

        Set<String> allWindowHandles = driver.getWindowHandles();

        int count = allWindowHandles.size();

        System.out.println("Number of browser windows opened on the system is : "+ count);

        for (String windowHandle : allWindowHandles) {
            driver.switchTo().window(windowHandle);
            if (windowHandle.equals(parentWindowhandleID)) {
                driver.close();
                System.out.println("Main Browser window with title -->" + title + " --> is closed");
            }
        }


    }

    @Test
    public void closeAllChildBrowserOnly() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://study-notion-frontend-seven-chi.vercel.app/login");

        String parentWindowhandleID = driver.getWindowHandle();

        Set<String> allWindowHandles = driver.getWindowHandles();

        int count = allWindowHandles.size();
        System.out.println("Number of browser windows opened on the system is : "+ count);
        for (String windowHandle : allWindowHandles) {
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
            if (!windowHandle.equals(parentWindowhandleID)) {
                driver.close();
                System.out.println("Child Browser window with title -->" + title + " --> is closed");
            }
        }
    }
}
