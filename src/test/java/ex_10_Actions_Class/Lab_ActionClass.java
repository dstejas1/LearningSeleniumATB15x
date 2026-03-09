package ex_10_Actions_Class;

import Utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab_ActionClass extends CommonToAll {

    @Test
    public void test_action()  {
        WebDriver  driver = new ChromeDriver();
        openBrowser(driver,"https://awesomeqa.com/practice.html");
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));

        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys(firstName, "The QA engineer")
                .keyUp(Keys.SHIFT).build().perform();
    }
}
