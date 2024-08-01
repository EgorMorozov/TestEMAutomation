package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverPage extends BasePage {

    private final Actions actions = new Actions(driver);

    By linkClick = By.xpath("//a[@title='Active Link']");
    By clickCount = By.xpath("//span[@id='clickCount']");

    public void doubleClick(int count) {
        for (int i = 0; i < count; i++) {
            actions.moveToElement(driver.findElement(linkClick)).doubleClick().build().perform();
        }
    }

    public String getClickCount() {
        return driver.findElement(clickCount).getText();
    }

    public MouseOverPage(WebDriver driver) {
        super(driver);
    }
}
