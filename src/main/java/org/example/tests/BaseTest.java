package org.example.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    protected HomePage homePage = new HomePage(setUp());
    //    protected TextInputPage textInputPage = new TextInputPage(setUp());
    TextInputPage textInputPage = PageFactory.initElements(setUp(), TextInputPage.class);
    protected DynamicTablePage dynamicTablePage = new DynamicTablePage(setUp());
    protected MouseOverPage mouseOverPage = new MouseOverPage(setUp());
    protected FramesPage framesPage = new FramesPage(setUp());
    protected AlertsPage alertsPage = new AlertsPage(setUp());

    protected WebDriver driver;

    private WebDriver setUp() {

        switch (System.getProperty("browser","Chrome")) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default: {
                System.out.println("Неверное имя браузера");
            }
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }

    @BeforeClass
    public void startTest() {
        driver.get(getFromProperties("homeUrl"));
    }

    @AfterClass
    public void tearDawn() {
        driver.quit();
    }

    public String getFromProperties(String propertyKey) {
        Properties props = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream("src/main/resources/application.properties");
            props.load(inputStream);
        } catch (IOException e) {
            System.out.println("Не удалось загрузить файл");
        }
        return props.getProperty(propertyKey);
    }
}
