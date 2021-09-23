import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/awsmpshk/geckodriver");
        WebDriver driver = new FirefoxDriver();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));

        driver.get("https://avito.ru");

        WebElement anchor = driver.findElement(By.cssSelector("a.link-link-MbQDP"));
        anchor.click();

        WebElement searchInput = driver.findElement(By.cssSelector("input[data-marker='search-form/suggest']"));
        searchInput.sendKeys("Volkswagen Polo" + Keys.ENTER);
    }
}
