package seleniumLearningClass_Unify;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class m_ScrollingPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(2000);

        JavascriptExecutor js= ((JavascriptExecutor)driver);

//      1.Scrolling the page with pixel
//        js.executeScript("window.scrollBy(0,1500)");

//      2.Scrolling the page by element

//        WebElement element = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[1]/strong"));
//        js.executeScript("arguments[0].scrollIntoView();",element);

//      3.Scrolling the page down
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(2000);

//     4. Scrolling the page up

//        js.executeScript("window.scrollBy(0,-1000)");
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
    }
}
