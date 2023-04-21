package web_driver_concept;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathDemo1 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


        //1) Login : use with properties
        //--------------------------------
        //a[@class='ico-login']

        //2) Register: use with multiproperties (and)
        //---------------------------------------------
        //a[@href='/register?returnUrl=%2F' and @class='ico-register']

        //3) Search: using contain() in x-path
        //--------------------------------------
        //button[contain(@class,'button-1 search-box-button')]


        //4) Search: with and without contains
        //---------------------------------------
        //button[@type='submit' and  contain(@class,'button-1 search-box-button')]

        //5) Shopping cart: using the text()
        //-------------------------------------
        //class[text()='shopping cart']

    }
}
