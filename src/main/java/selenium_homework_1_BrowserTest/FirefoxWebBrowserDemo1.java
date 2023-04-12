package selenium_homework_1_BrowserTest;

// Firefox Web-Browser Test:-
//----------------------------



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWebBrowserDemo1 {
    public static void main(String[] args)  {

        // 1) To set up the firefox browser:-
        // --------------------------------
        System.setProperty("webdriver.gecko.driver","C:\\Software\\Driver\\firefox driver\\geckodriver.exe");  //path approach use here


        // 2) Create Object for web-browser:-
        //-----------------------------------
        WebDriver driver=new FirefoxDriver();



        // 3) Open the url in browser:-
        //------------------------------
        driver.get("https://demo.nopcommerce.com/");



        // 4) Maximize the browser:-
        //----------------------------
        driver.manage().window().maximize();




        // 5) Verify & validate the Title:-
        //---------------------------------
        String ActualTitle=driver.getTitle();
        String ExpectedTitle= "nopCommerce demo store";

        if(ActualTitle.equals(ExpectedTitle))
        {
            System.out.println("Test is Passed");
        }
        else
        {
            System.out.println("Test is Failed");
        }



        // 6) Navigation Methods:-
        //----------------------------
        driver.navigate().to("https://www.facebook.com/");  //Navigate to new url
        driver.navigate().forward();                         // Navigate to forward from the current page
        driver.navigate().back();                            //Navigate to backward from the current page
        driver.navigate().refresh();                         //Navigate to refresh the page



        // 7) Close the browser:-
        //-------------------------
        driver.close();



    }
}
