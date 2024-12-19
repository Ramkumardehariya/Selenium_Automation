package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.IOException;

public class FileUploadPopUp {
    ChromeDriver driver;

    @Test
    public void FileUploadAutoIt() throws InterruptedException, IOException {
        driver = new ChromeDriver();

        driver.get("https://www.ilovepdf.com/powerpoint_to_pdf");
        driver.manage().window().maximize();
        Thread.sleep(1000); // Allow page to load

        // Click on the upload button to open the file upload dialog
        driver.findElement(By.id("uploader")).click();

        Thread.sleep(2000);

        Runtime.getRuntime().exec("C:\\Users\\ramku\\Downloads\\setUpfileUpload.exe");

        Thread.sleep(2000);
        driver.findElement(By.id("processTask")).click();


        Thread.sleep(4000);

        driver.close();
    }

    @Test
    public void FileUploadAutoItAndDownload() throws InterruptedException, IOException {
        driver = new ChromeDriver();

        driver.get("https://www.ilovepdf.com/powerpoint_to_pdf");
        driver.manage().window().maximize();
        Thread.sleep(1000); // Allow page to load

        // Click on the upload button to open the file upload dialog
        driver.findElement(By.id("uploader")).click();

        Thread.sleep(2000);

        Runtime.getRuntime().exec("C:\\Users\\ramku\\Downloads\\setUpfileUpload.exe");

        Thread.sleep(2000);
        driver.findElement(By.id("processTask")).click();


        Thread.sleep(20000);

        driver.close();
    }
}
