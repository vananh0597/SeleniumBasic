package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FormyDropdownTest {
    WebDriver driver;

    @BeforeTest
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Anh_Nguyen//webdrivers//chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://formy-project.herokuapp.com/dropdown");
        this.driver = driver;
    }

    @Test
    public void SelectDropdownList() {

        List<WebElement> options = driver.findElements(By.xpath("/html/body/div/div/div/a"));

        Actions shiftClick = new Actions(driver);

        for (WebElement option : options) {
            WebElement drpListBtn = driver.findElement(By.id("dropdownMenuButton"));
            drpListBtn.click();
            shiftClick.keyDown(Keys.LEFT_CONTROL).click(option).keyUp(Keys.LEFT_CONTROL).perform();
        }

    }

}
