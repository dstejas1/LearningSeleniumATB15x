package ex_04_Xpath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium20_MiniProject {

    @Owner("Pramod")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify login is working")
    @Test
    public void test_OHRM_login() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/pim/viewEmployeeList");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        WebElement input_username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement Login_button = driver.findElement(By.xpath("//button[@type='submit']"));
        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        Login_button.click();

        Thread.sleep(3000);
        WebElement h6 = driver.findElement(By.xpath("//span[@class=\"oxd-topbar-header-breadcrumb\"]/h6"));
        Assert.assertEquals(h6.getText(),"PIM");

        driver.quit();
    }
}
