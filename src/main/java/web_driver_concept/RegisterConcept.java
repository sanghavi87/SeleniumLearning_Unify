package web_driver_concept;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterConcept {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Abhishek");
        driver.findElement(By.id("LastName")).sendKeys("Sanghavi");
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("rohan123@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("rohan123");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("rohan123");

        driver.close();


    }
}
