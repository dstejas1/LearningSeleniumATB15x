package ex_06_WebTables;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Explicit_WAIT_programm {
    @Owner("TEJAS")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify the login flow")
    @Test
    public void test_appvwo()  {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
       WebElement Email_id= driver.findElement(By.id("login-username"));
       WebElement Password= driver.findElement(By.id("login-password"));
       WebElement Submit_button = driver.findElement(By.cssSelector("#js-login-btn"));
        Email_id.sendKeys(" admin@admin.com");
        Password.sendKeys("admin");
        Submit_button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));
      WebElement Error_notification = driver.findElement(By.xpath("//div[contains(text(),'Your email')]"));
        Assert.assertEquals(Error_notification.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }

    }

