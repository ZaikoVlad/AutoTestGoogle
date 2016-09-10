package com.eviltester.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoTest {
   @Test
   public void startWebDriver() {

      System.setProperty("webdriver.gecko.driver", "D://Selenium Driver/geckodriver.exe");
      DesiredCapabilities capabilities = DesiredCapabilities.firefox();
      capabilities.setCapability("marionette", true);

      WebDriver driver = new FirefoxDriver();

      driver.get("http://www.google.com");

      WebElement element = driver.findElement(By.name("q"));
      element.sendKeys("Selenium");

      element.submit();

      System.out.println("Page title is: " + driver.getTitle());
      (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
         public Boolean apply(WebDriver d){
            return d.getTitle().toLowerCase().startsWith("selenium");
         }
      }
      );
      System.out.println("Page title is: " + driver.getTitle());

   }
}
