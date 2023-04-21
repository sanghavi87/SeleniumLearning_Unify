package web_driver_concept;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginConcept {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.id("Email")).sendKeys("rohan@gmail.com");
        driver.findElement(By.className("password")).sendKeys("rohan123");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        driver.findElement(By.className("ico-logout")).click();

        driver.close();







    }


}
