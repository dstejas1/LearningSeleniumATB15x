package ex_10_Actions_Class;

import Utils.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Bookind_com extends CommonToAll {

    @Description("Select the city and search booking")
    @Test
    public void searchBooking(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");
        driver.manage().window().maximize();

        waitForVisibility(driver, "//button[contains(@aria-label,'Dismiss')]//*[name()='svg']");

        WebElement Dismiss = driver.findElement(By.xpath("//button[contains(@aria-label,'Dismiss')]//*[name()='svg']"));
        Dismiss.click();
        WebElement Flights = driver.findElement(By.cssSelector("#flights"));
        Flights.click();
        WebElement Going = driver.findElement(By.xpath("//span[contains(text(),'Going')]"));
        Going.click();
        WebElement textbox = driver.findElement(By.xpath("//input[@data-ui-name='input_text_autocomplete']"));

        Actions action = new Actions(driver);
        action.moveToElement(textbox)
                .click().pause(Duration.ofSeconds(2))
                .sendKeys("DELHI")
                .pause(Duration.ofSeconds(2))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        driver.findElement(By.xpath("//button[.//span[text()='Search']]")).click();
        WebElement filter = driver.findElement(By.xpath("//span[contains(text(),'filters')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(filter));

        driver.quit();


    }

}
