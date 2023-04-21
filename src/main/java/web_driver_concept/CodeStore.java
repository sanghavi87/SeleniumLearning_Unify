package web_driver_concept;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CodeStore {
    public static void SelectDateMonthYear(WebElement element, String Value)
    {
        Select pickup= new Select(element);  //we have created "pickup" object here
        pickup.selectByVisibleText(Value);   // then we have called method selectbyVisableText()
    }
}
