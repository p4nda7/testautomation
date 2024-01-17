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
public class TC01NeuerBenutzerregistrieren1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC01NeuerBenutzerregistrieren1() {
    driver.get("https://www.lotto-brandenburg.de/home");
    driver.manage().window().setSize(new Dimension(1710, 1107));
    driver.findElement(By.cssSelector(".js-track-register > .button--label")).click();
    driver.findElement(By.name("user.title")).click();
    {
      WebElement dropdown = driver.findElement(By.name("user.title"));
      dropdown.findElement(By.xpath("//option[. = 'Herr']")).click();
    }
    driver.findElement(By.id("user.firstName")).click();
    driver.findElement(By.id("user.firstName")).sendKeys("Max");
    driver.findElement(By.id("user.lastName")).sendKeys("Musstermann");
    driver.findElement(By.id("user.lastName")).click();
    driver.findElement(By.id("user.lastName")).sendKeys("Mustermann");
    driver.findElement(By.id("user.maidenName")).click();
    driver.findElement(By.id("user.maidenName")).sendKeys("Muster");
    driver.findElement(By.id("register_birthday")).sendKeys("01.12.1999");
    driver.findElement(By.id("user.birthPlace")).sendKeys("Berlin");
    driver.findElement(By.id("register-plz")).sendKeys("12051");
    driver.findElement(By.cssSelector(".form--row:nth-child(6) > .medium-7")).click();
    driver.findElement(By.id("city")).click();
    {
      WebElement dropdown = driver.findElement(By.id("city"));
      dropdown.findElement(By.xpath("//option[. = 'Bitte gültige Postleitzahl eingeben']")).click();
    }
    driver.findElement(By.id("register-plz")).click();
    driver.findElement(By.cssSelector(".m01411--body")).click();
    driver.findElement(By.id("register-plz")).sendKeys("14197");
    driver.findElement(By.cssSelector(".column > .form--row:nth-child(5)")).click();
    driver.findElement(By.id("register-plz")).click();
    driver.findElement(By.id("city")).click();
    {
      WebElement dropdown = driver.findElement(By.id("city"));
      dropdown.findElement(By.xpath("//option[. = 'Bitte gültige Postleitzahl eingeben']")).click();
    }
    driver.findElement(By.id("city")).click();
    {
      WebElement dropdown = driver.findElement(By.id("city"));
      dropdown.findElement(By.xpath("//option[. = 'Bitte gültige Postleitzahl eingeben']")).click();
    }
    driver.findElement(By.id("register-plz")).click();
    driver.findElement(By.id("street")).click();
    driver.findElement(By.id("street")).sendKeys("Musterstraße 777");
    driver.findElement(By.id("street")).click();
    driver.findElement(By.id("city")).click();
    {
      WebElement dropdown = driver.findElement(By.id("city"));
      dropdown.findElement(By.xpath("//option[. = 'Bitte gültige Postleitzahl eingeben']")).click();
    }
    driver.findElement(By.id("street")).click();
    driver.findElement(By.id("street")).sendKeys("Berliner Str. ");
    driver.findElement(By.id("register-hausnummer")).sendKeys("21");
    driver.findElement(By.id("userIban")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("max.muster@gmail.com");
    driver.findElement(By.id("userPassword")).sendKeys("Km7dLg7uH9!\"§");
    driver.findElement(By.cssSelector(".-checkbox")).click();
  }
}
