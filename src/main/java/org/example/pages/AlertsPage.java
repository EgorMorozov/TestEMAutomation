package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BasePage {


    private final By alertBtn = By.xpath("//button[@id='alertButton']");
    private final By alertConfirm = By.xpath("//button[@id='confirmButton']");
    private final By alertPrompt = By.xpath("//button[@id='promptButton']");

    public void clickAlert() {
        driver.findElement(alertBtn).click();
    }

    public void clickConfirm() {
        driver.findElement(alertConfirm).click();
    }

    public void clickPrompt() {
        driver.findElement(alertPrompt).click();

    }

    public AlertsPage(WebDriver driver) {
        super(driver);
    }
}
