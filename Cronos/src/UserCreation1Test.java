// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UserCreation1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
 
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void userCreation1() {
    driver.get("http://192.168.10.107:2006/");
    driver.findElement(By.id("quick-panel-toggle")).click();
    driver.findElement(By.cssSelector(".md-select-icon")).click();
    driver.findElement(By.cssSelector("#select_option_9 > .md-text")).click();
    driver.findElement(By.cssSelector(".md-sidenav-backdrop")).click();
    driver.findElement(By.cssSelector(".md-sidenav-backdrop")).click();
    driver.manage().window().setSize(new Dimension(1050, 708));
    driver.findElement(By.cssSelector("ul:nth-child(1) > .ms-navigation-node:nth-child(3) > .ms-navigation-item .title")).click();
    driver.findElement(By.cssSelector(".ms-navigation-node:nth-child(3) .ms-navigation-node:nth-child(2) .mdi:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".ms-navigation-node:nth-child(3) .ms-navigation-node:nth-child(2) .ms-navigation-node .title")).click();
    driver.findElement(By.id("LoginName")).click();
    driver.findElement(By.id("LoginName")).sendKeys("KaranLKkk");
    driver.findElement(By.id("FirstName")).click();
    driver.findElement(By.id("FirstName")).sendKeys("Karannn");
    driver.findElement(By.id("LastName")).sendKeys("Lahh");
    driver.findElement(By.id("vPassword")).click();
    driver.findElement(By.id("vPassword")).sendKeys("Welcome@123");
    driver.findElement(By.id("vrePassword")).sendKeys("Welcome@123");
    driver.findElement(By.id("btnSave")).click();
  }
}
