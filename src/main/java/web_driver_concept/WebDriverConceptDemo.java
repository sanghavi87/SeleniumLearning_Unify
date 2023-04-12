package web_driver_concept;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConceptDemo {
    public static void main(String[] args) {

        //To setup the chrome browser
       // ---------------------------

        //Approach-2:-

        WebDriverManager.chromedriver().setup();  //we have open chrome url here
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();  //this one will maximize my browser window


        //now open the "nop-commerce" application:-
        //-----------------------------
        driver.get("https://demo.nopcommerce.com/"); //now we are opening application/website on chrome browser
        driver.manage().window().maximize();  //this one will maximize my browser window

        //close the browser :-
        //-----------------------

        driver.close();


        //


    }
}
