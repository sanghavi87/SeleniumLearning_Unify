package seleniumLearningClass_Unify;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class f_ImplicitWait {
    /*
    Implicit Wait : Dynamic Wait
    Global Wait : Applied for all elements
    Ignore extra Seconds : Save time and fast performance
    Anytime we can change the code
    Implicit wait is available inform of implicitly keyword in selenium

     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        driver.findElement(By.className("ico-login")).click(); //999
        driver.findElement(By.id("Email")).sendKeys("Tester@gmail.com"); //20
        driver.findElement(By.id("Password")).sendKeys("Test@123"); //1
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.findElement(By.className("ico-login")).click(); //999
        driver.findElement(By.id("Email")).sendKeys("Tester@gmail.com"); //20
        driver.findElement(By.id("Password")).sendKeys("Test@123"); //1
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }
}

