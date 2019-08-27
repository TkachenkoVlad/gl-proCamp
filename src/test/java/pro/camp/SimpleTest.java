package pro.camp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

    private WebDriver driver;

    @Before
    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void stopBrowser() {
        driver.quit();
    }

    @Test
    public void test() {
        System.out.println(((HasCapabilities) driver).getCapabilities());
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
    }

}
