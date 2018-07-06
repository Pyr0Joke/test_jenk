import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test_mv_dark_jenk {
    @Test
    public void loginDarkFireFox(WebDriver driver){
        System.setProperty("webdriver.gecko.driver", "D:\\Gecko\\geckodriver.exe");
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        driver = new FirefoxDriver(firefoxOptions);
        driver.get("http://dark-world.ru/main/");
        driver.findElement(By.id("Login")).sendKeys("shmel9311@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("458854qwe");
        driver.findElement(By.id("loginBtn")).click();
        WebElement dynamicElement = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.id("logoffLink")));
    }
}
