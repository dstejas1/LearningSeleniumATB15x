package ex_06_WebTables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM_Assignment {

    @Test
    @Description("Orange HRM Clicking on Employee table ")
    public void test_web_table_login() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement button = driver.findElement(By.xpath("//button"));

        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        button.click();

        Thread.sleep(2000);
     WebElement FirstTerminatedEmployee = driver.findElement(By.xpath("(//div[@role='row'][.//div[text()='Terminated']]//div[9]//i[contains(@class,'bi-trash')])[1]"));
        FirstTerminatedEmployee.click();
        Thread.sleep(2000);
        WebElement no_cancel = driver.findElement(By.xpath("//button[contains(.,'Cancel')]"));
        Assert.assertTrue(no_cancel.isDisplayed());

        driver.quit();
    }
}
