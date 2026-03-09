package ex_09_Input_Select_Alerts_Radio;

import Utils.CommonToAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSeleniumJSAlerts extends CommonToAll {

    @Test
    public void test_Alerts() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://the-internet.herokuapp.com/javascript_alerts");
        WebElement element = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        element.click();
        waitForAlert(driver,5);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(),"You successfully clicked an alert");
    }
}
