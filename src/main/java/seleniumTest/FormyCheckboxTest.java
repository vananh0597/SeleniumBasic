package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FormyCheckboxTest {

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
        driver.get("https://formy-project.herokuapp.com/checkbox");
        this.driver = driver;
    }

    @Test(priority = 1)
    public void SelectCheckbox1() {
        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();
        if (checkbox1.isSelected()) {
            System.out.println("Checkbox1 is selected");
        } else {
            System.out.println("Checkbox1 is not selected");
        }
    }

    @Test(priority = 2)
    public void SelectCheckbox2() {
        WebElement checkbox2 = driver.findElement(By.id("checkbox-2"));
        checkbox2.click();
        if (checkbox2.isSelected()) {
            System.out.println("Checkbox2 is selected");
        } else {
            System.out.println("Checkbox2 is not selected");
        }

    }


    @Test(priority = 3)
    public void SelectCheckbox3() {
        WebElement checkbox3 = driver.findElement(By.id("checkbox-3"));
        checkbox3.click();
        if (checkbox3.isSelected()) {
            System.out.println("Checkbox3 is selected");
        } else {
            System.out.println("Checkbox3 is not selected");
        }
    }

}
