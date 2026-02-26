package ex03_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium16_LinkText_Partial_Text_TagName_Locators {

    @Description("verify that create account negative TC")
    @Test
    public void test_login_vwo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
      //  WebElement a_Tag_free_trail_full_match = driver.findElement(By.linkText("Start a free trial"));
     //   a_Tag_free_trail_full_match.click();

      WebElement  a_Tag_free_trail_full_match = driver.findElement(By.partialLinkText("trial"));
        a_Tag_free_trail_full_match.click();

        driver.quit();

    }
}
