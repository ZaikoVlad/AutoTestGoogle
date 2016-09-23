import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;


public class GoTestTest {

    @Test
    public void startWebDriver() {

        System.setProperty("webdriver.gecko.driver", "D://Selenium Driver/geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);

        WebDriver driver = new FirefoxDriver();

        driver.get("http://learn.talkable.com/test/sa.html");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.cssSelector("#affiliate_member_first_name"));
        element.sendKeys("qwerty");

        WebElement element1 = driver.findElement(By.className("textfield is-center js-input-email"));
        element1.sendKeys("danikor95@mail.ru");

        WebElement element2 = driver.findElement(By.className("button is-large is-block"));
        element2.click();




    }
}