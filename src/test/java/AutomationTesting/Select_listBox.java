package AutomationTesting;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.*;

public class Select_listBox {

   public ChromeDriver driver;

    @Test
    public void listBoxExample(){

        driver = new ChromeDriver();

        driver.get("F:\\javatest\\WebHtml2.html");

        WebElement list = driver.findElement(By.id("mtr"));

        Select s = new Select(list);
        List<WebElement> options = s.getOptions();
        int size = options.size();
        System.out.println("Number of elements present inside the listbox is : "+ size);
        for (WebElement webElement : options) {
            String text = webElement.getText();
            System.out.println(text);
        }
        s.selectByIndex(0);
        s.selectByValue("v");

        s.selectByVisibleText("Poori");
        System.out.println("************Print all selected options***********");
        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
        int size2 = allSelectedOptions.size();
        System.out.println("Number of items that is selected in the list box is : "+size2);
        System.out.println(" Selected items are printed below ");
        for (WebElement webElement : allSelectedOptions) {
            System.out.println(webElement.getText());
        }
        System.out.println("check whether it is a multiple select listbox or not");
        boolean multiple = s.isMultiple();
        System.out.println(multiple +" yes , it is multi select");
        if (multiple) {
            WebElement firstSelectedOption = s.getFirstSelectedOption();
            System.out.println(firstSelectedOption.getText() + " is the first selected item in the list box");
            s.deselectByIndex(0);
            WebElement firstSelectedOption1 = s.getFirstSelectedOption();
            System.out.println(firstSelectedOption1.getText() + " is the first selected item");
            s.deselectByValue("v");
            WebElement firstSelectedOption2 = s.getFirstSelectedOption();
            System.out.println(firstSelectedOption2.getText() + " is the first selected item");
            s.deselectByVisibleText("Poori");
        }
    }

    @Test
    public void printValuesInSortedOrder() {

        driver = new ChromeDriver();
        driver.get("F:\\javatest\\WebHtml2.html");
        WebElement listElement = driver.findElement(By.id("mtr"));
        Select s = new Select(listElement);
        List<WebElement> allOptions = s.getOptions();
        int count = allOptions.size();
        System.out.println(count);
        System.out.println("-----print the values in the list ----");


        ArrayList<String> list = new ArrayList<String>();
        for (WebElement option : allOptions) {
            String text = option.getText();
            System.out.println(text);
            list.add(text);
        }
        Collections.sort(list);


        System.out.println("-----print the value in sorted order----");
        for (String value : list) {
            System.out.println(value);
        }

        driver.close();
    }

    @Test
    public void printUniqueElementsInTheListBox(){
        driver = new ChromeDriver();
        driver.get("F:\\javatest\\WebHtml2.html");
        WebElement listElement = driver.findElement(By.id("mtr"));

        Select s = new Select(listElement);
        List<WebElement> allOptions = s.getOptions();
        int count = allOptions.size();
        System.out.println(count);
        System.out.println("-----print the values in the list ----");

        HashSet<String> allElements = new HashSet<String>();
        for (WebElement option : allOptions) {
            String text = option.getText();
            System.out.println(text);
            allElements.add(text);
        }

        System.out.println(allElements);

        driver.close();
    }

    @Test
    public void printUniqueElementInSorted(){
        driver = new ChromeDriver();
        driver.get("F:\\javatest\\WebHtml2.html");
        WebElement listElement = driver.findElement(By.id("mtr"));
        Select s = new Select(listElement);
        List<WebElement> allOptions = s.getOptions();
        int count = allOptions.size();
        System.out.println(count);
        System.out.println("-----print the values in the list ----");
        TreeSet<String> allElements = new TreeSet<String>();
        for (WebElement option : allOptions) {
            String text = option.getText();
            System.out.println(text);
            allElements.add(text);
        }
        System.out.println(allElements);

        driver.close();
    }

    @Test
    public void checkListHasDuplicateValues(){
            driver = new ChromeDriver();
            driver.get("F:\\javatest\\WebHtml2.html");
            WebElement listbox = driver.findElement(By.id("mtr"));
            Select s = new Select(listbox);
            List<WebElement> allOptions = s.getOptions();
            int count1 = allOptions.size();
            System.out.println("Number of elements in the list is :" +count1);
            HashSet<String> allElementText = new HashSet<String>();
            for (int i = 0; i < count1; i++) {
                String text = allOptions.get(i).getText();
                System.out.println(text);
                allElementText.add(text);
            }
            int count2 = allElementText.size();
            System.out.println("Number of elements in the hashset is :" +count2);
            if (count1==count2) {
                System.out.println("list box has NO duplicate values");
            }
            else{
                System.out.println("list box has duplicate values");
            }
            System.out.println(allElementText);
            driver.close();
    }

    @Test
    public void printDuplicateItemintheListHashSet(){
        driver = new ChromeDriver();

        driver.get("F:\\javatest\\WebHtml2.html");
        WebElement listbox = driver.findElement(By.id("mtr"));
        Select s = new Select(listbox);
        List<WebElement> allOptions = s.getOptions();
        int count1 = allOptions.size();
        System.out.println("Number of elements in the list is :" +count1);
        HashSet<String> allElementText = new HashSet<String>();
        for (int i = 0; i < count1; i++) {
            String text = allOptions.get(i).getText();
            if (!allElementText.add(text)) {
                System.out.println(text +" is the duplicate item in the list box");
            }
        }
        System.out.println(allElementText.size());
        System.out.println(allElementText);
        driver.close();
    }

}
