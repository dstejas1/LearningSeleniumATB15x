package ex_09_Input_Select_Alerts_Radio;

import Utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestSelenium_Input_Checkbox_Radio extends CommonToAll {

    @Test
    public void test_select() {
        // Select BOX - HTMLs
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://the-internet.herokuapp.com/dropdown");
        WebElement option = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(option);
        dropdown.selectByVisibleText("Option 2");




    }

    }
