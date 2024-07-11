package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBrowser {

    @Test
    public void testOpenBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.by/?hl=ru");

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Уточки");
        driver.findElement(By.xpath("//input[@value='Поиск в Google' and @class='gNO89b'][1]")).click();

        System.out.println("SUCCESS");
        driver.quit();
    }
}
