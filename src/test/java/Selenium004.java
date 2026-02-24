import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium004 {

    @Test
    public void Test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://app.vwo.com");
        driver.getCurrentUrl();
        driver.quit();
    }

}
