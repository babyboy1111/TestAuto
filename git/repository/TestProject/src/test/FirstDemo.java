package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
public class FirstDemo{
   public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver",
         "C:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      //implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.get("https://www.google.com/");
      //identify element
      WebElement r = driver.findElement(By.name("q"));
      r.sendKeys("game");
      // press ENTER
      r.sendKeys(Keys.RETURN);
   }
}
       

