package AutomationTesting;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.lang.InterruptedException;
import java.util.Set;

public class AutomationTest {
    WebDriver driver;

    @Test
    public void xpathAxes() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login.php/");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("7489629277");
        driver.findElement(By.name("pass")).sendKeys("ram@123");

        //driver.findElement(By.name("login")).click();

        driver.findElement(By.className("_97w5")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Ramkumar");
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Mehra");

        //descendent
        driver.findElement(By.xpath("(//option[2])[1]")).click();

        //child
        driver.findElement(By.xpath("//select[2]/option[6]")).click();

        //preceding sibling
        driver.findElement(By.xpath("//select[3]/option[24]/preceding-sibling::option[1]")).click();
        //following sibling
        //driver.findElement(By.xpath("//select[3]/option[24]/following-sibling::option[1]")).click();

        //parent
        //driver.findElement(By.xpath("(//input[@value='2'])/../../.")).click();
        //ancesstor
        driver.findElement(By.xpath("(//input[@value='2'])/ancestor::label")).click();

        Thread.sleep(30000);

        driver.close();
    }

    @Test
    public void webDriverMethod() throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("rammehramehra");
        driver.findElement(By.name("password")).sendKeys("ram@123");

        // click log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Thread.sleep(5000);

        String pageTitle = driver.getTitle();
        System.out.println("This is current page title : "+pageTitle);

        String currUrl = driver.getCurrentUrl();
        System.out.println("This is current url : "+currUrl);

        String windowHandle = driver.getWindowHandle();
        System.out.println("main window handle : "+windowHandle);

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("All window handles : "+windowHandles);

        String pageSource = driver.getPageSource();
        System.out.println("This is page source: "+pageSource);

        Thread.sleep(10000);
        driver.close();
    }

    @Test
    public void LocatorsExample() throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("rammehramehra");
        driver.findElement(By.name("password")).sendKeys("ram@123");

        //driver.findElement(By.linkText("Sign up")).click();
        //driver.findElement(By.partialLinkText("Sign")).click();

        //click log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        Thread.sleep(6000);
        driver.findElement(By.className("x1azxncr")).click();

        Thread.sleep(4000);
        driver.findElement(By.tagName("a")).click();

        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Messages']")).click();

        Thread.sleep(10000);
        driver.close();
    }

    @Test
    public void usingXpath() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("rammehramehra");
        driver.findElement(By.name("password")).sendKeys("ram@123");

        // click log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        //Absolute path log in
        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/section/main/article/div[2]/div[1]/div[2]/div/form/div/div[3]/button")).click();


        // click on profile
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[@href='/rammehramehra/?next=%2F']")).click();

        // click on first photo
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@class='x1i10hfl xjbqb8w x1ejq31n xd10rxx x1sy0etr x17r0tee x972fbf xcfux6l x1qhh985 xm0m39n x9f619 x1ypdohk xt0psk2 xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x16tdsg8 x1hl2dhg xggy1nq x1a2a7pz _a6hd']")).click();

        //click on cross button
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//div[@role='button'][@tabindex='0'])[25]")).click();

        // click on Edit profile
        Thread.sleep(4000);
        //driver.findElement(By.xpath("//a[text()='Edit profile']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
        Thread.sleep(4000);
        driver.navigate().back();

        // click on Following
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@href='/rammehramehra/following/?next=%2F'][@role='link']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@class='_abl-'][@type='button']")).click();

        // click on Follower
        Thread.sleep(4000);
        driver.findElement(By.xpath("//li[@class='xl565be x1m39q7l x1uw6ca5 x2pgyrj'][2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@class='_abl-'][@type='button']")).click();

        // go to messanger
        //driver.findElement(By.xpath("//span[text()='Messages']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[starts-with(text(),'Mes')]")).click();


        //open message text
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='DHARSHANAVANA']")).click();

        // write text
        Thread.sleep(5000);
        driver.findElement(By.xpath("//p")).sendKeys("Hi darshan");
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().back();


        // click send button for message
        //driver.findElement(By.xpath("//div[text()='Send']")).click();


        //xpath group Index
        //click on my highlight story
        //driver.findElement(By.xpath("//li[@class='_acaz'][1]")).click();
        //driver.findElement(By.xpath("//li[@class='_acaz'][4]")).click();
        //driver.findElement(By.xpath("//li[@class='_acaz'][last()]")).click();
        //driver.findElement(By.xpath("(//li[@class='_acaz'])[last()-1]")).click();
        //driver.findElement(By.xpath("(//li[@class='_acaz'])[position()=5]")).click();
        driver.findElement(By.xpath("(//li[@class='_acaz'])[position()>=5]")).click();

        //click on sound inside highlight story
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//div[@role='button'][1])[18]")).click();

        Thread.sleep(30000);
        driver.close();
        driver.quit();
    }

    @Test
    public void webElementMethod() throws InterruptedException{
        driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.name("username"));
        userName.clear();
        userName.sendKeys("rammehramehra");

        driver.findElement(By.name("password")).sendKeys("ram@123");


        String attribute = userName.getDomAttribute("class");
        System.out.println("Attribut class: "+attribute);

        String cssValue = userName.getCssValue("color");
        System.out.println("CSS value: "+cssValue);

        Point location = userName.getLocation();
        System.out.println("Coordinate x is: "+location.getX());
        System.out.println("Coordinate y is: "+location.getY());

        Rectangle rect = userName.getRect();
        System.out.println("Rectangle of userName");
        System.out.println("X: " + rect.getX());
        System.out.println("Y: " + rect.getY());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());

        Dimension size = userName.getSize();
        System.out.println("width of userName is: "+size.getWidth());
        System.out.println("height of userName is: "+size.getHeight());

        String tagName = userName.getTagName();
        System.out.println("Tagname of userName: "+tagName);

        String gettext = userName.getText();
        System.out.println("The text inside the heading is: "+gettext);

        boolean userNameIsVisible = userName.isDisplayed();
        System.out.println("UserName is visible or not: "+userNameIsVisible);

        WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        boolean logInButton = submitButton.isEnabled();
        System.out.println("Is the Log in button enabled? : " + logInButton);
        submitButton.submit();

        boolean isChecked = userName.isSelected();
        System.out.println("Is the checkbox selected? " + isChecked);

        Thread.sleep(10000);
        driver.close();
    }
}
