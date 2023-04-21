package selenium_homework_2_Registration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Registration extends UtilsClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Abhishek");
        driver.findElement(By.id("LastName")).sendKeys("Sanghavi");

        //for dropdown selection :-
        //----------------------------
        //first we have create the webelement object (Day, Month and Year)
        WebElement Day= driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month= driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year= driver.findElement(By.name("DateOfBirthYear"));

        //we have created "selectvaluefromdrompown" method in "Utils" class and we have called that method by using inheritance
        SelectValueFromDropDown(Day, "21");
        SelectValueFromDropDown(Month, "March");
        SelectValueFromDropDown(Year, "1992");


        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("rohan123@gmail.com");
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Marks Wholesale Ltd");
        driver.findElement(By.xpath("//input[@id='Newsletter']")).click();
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("rohan123");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("rohan123");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();

        driver.close();
    }
}
