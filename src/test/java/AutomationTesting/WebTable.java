package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebTable {
    ChromeDriver driver;

    @Test
    public void webTableExample() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("F:\\javatest\\WebTable.html");

        List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
        int totalRows = allRows.size();
        System.out.println("total number of rows present in the table is :" + totalRows);

        List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
        int totalColumns = allColumns.size();
        System.out.println("Total number of columns in the table is :" + totalColumns);

        List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
        int totalCells = allCells.size();
        System.out.println("Total number of cells present in the table is :" + totalCells);

        int countNumberValue = 0;
        int sum = 0;
        for (WebElement cell : allCells) {
            String cellValue = cell.getText();
            try {
                int number = Integer.parseInt(cellValue);
                System.out.print(" " + number);
                countNumberValue++;
                sum = sum + number;
            } catch (Exception e) {
            }
        }
        System.out.println("Total count of numeric values is :" + countNumberValue);
        System.out.println("Total sum of all the numeric values is :" + sum);
        driver.close();

    }

    @Test
    public void autoSuggestionGoogle() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://www.google.com");

        driver.findElement(By.id("APjFqb")).sendKeys("selenium");
        Thread.sleep(2000);

        List<WebElement> allOptions = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
        int count = allOptions.size();

        System.out.println("Number of values present in the dropdown is : " + count);
        String expectedValue = "selenium interview questions";
        for (WebElement option : allOptions) {
            String text = option.getText();
            System.out.println(" " + text);
            if (text.equalsIgnoreCase(expectedValue)) {
                option.click();
                break;
            }

        }
    }

}
