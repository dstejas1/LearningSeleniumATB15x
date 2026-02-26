package ex03_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mini_Project_katalon_demo_cura {

    @Owner("Tejas")
    @Description("Login to the cura.herokuapp.com to make appointment.")
    @Test
    public void Make_Appointment() throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement Make_Appointment_button = driver.findElement(By.id("btn-make-appointment"));
        Make_Appointment_button.click();
        driver.findElement(By.id("txt-username")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
      WebElement Login_btn = driver.findElement(By.id("btn-login"));
        Login_btn.click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        String Make_Appointment_text = driver.findElement(By.xpath("//h2[text()='Make Appointment']")).getText();
        Assert.assertEquals(Make_Appointment_text,"Make Appointment");
    }
}
