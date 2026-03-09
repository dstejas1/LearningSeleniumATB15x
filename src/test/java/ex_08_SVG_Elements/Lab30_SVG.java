package ex_08_SVG_Elements;

import Utils.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab30_SVG extends CommonToAll {

    @Test
    public void test_Flipkart_Search_SVG_Icon() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.flipkart.com/search");
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("macmini");
        WebElement searchIcon = driver.findElement(By.xpath("(//*[local-name()='svg'])[1]"));
        searchIcon.click();
        waitForVisibility(driver,"//div[contains(@data-id,'CPU')]");

        List<WebElement> titles = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
        for (WebElement title : titles) {
            System.out.println(title.getText());
        }
    }
}
