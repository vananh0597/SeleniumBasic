package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class FormyButtonTest {

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
        driver.get("https://formy-project.herokuapp.com/buttons");
        this.driver = driver;
    }

//    @BeforeMethod
//    public void getURL() {
//        driver.get("https://formy-project.herokuapp.com/buttons");
//    }


    @Test (priority = 1)
    public void assertClickPrimaryButtonWork() {
        WebElement primaryButton = driver.findElement(By.className("btn-primary"));
        primaryButton.click();
    }

    @Test(priority = 2)
    public void assertClickSuccessButtonWork() {
        WebElement successButton = driver.findElement(By.className("btn-success"));
        successButton.click();
    }

    @Test(priority = 3)
    public void assertClickInfoButtonWork() {
        WebElement infoButton = driver.findElement(By.className("btn-info"));
        infoButton.click();
    }

    @Test(priority = 4)
    public void assertClickWarningButtonWork() {
        WebElement warningButton = driver.findElement(By.className("btn-warning"));
        warningButton.click();
    }

    @Test(priority = 5)
    public void assertClickDangerButtonWork() {
        WebElement dangerButton = driver.findElement(By.className("btn-danger"));
        dangerButton.click();
    }

    @Test(priority = 6)
    public void assertClickLinkButtonWork() {
        WebElement linkButton = driver.findElement(By.className("btn-link"));
        linkButton.click();
    }

    @Test(priority = 7)
    public void assertClickLeftButtonWork() {
        WebElement leftButton = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[1]"));
        leftButton.click();
    }

    @Test(priority = 8)
    public void assertClickMiddleButtonWork() {
        WebElement middleButton = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[2]"));
        middleButton.click();
    }

    @Test(priority = 9)
    public void assertClickRightButtonWork() {
        WebElement rightButton = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[3]"));
        rightButton.click();
    }

    @Test(priority = 10)
    public void assertClick1ButtonWork() {
        WebElement button1 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[1]"));
        button1.click();
    }

    @Test(priority = 11)
    public void assertClick2ButtonWork() {
        WebElement button2 = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[2]"));
        button2.click();
    }

    @Test(priority = 12)
    public void assertClickDropdownButtonWork() {
        WebElement dropdown = driver.findElement(By.id("btnGroupDrop1"));
        dropdown.click();
    }


    @AfterTest
    public void terminateBrowser() {
        driver.close();
    }

}

