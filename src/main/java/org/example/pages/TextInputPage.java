package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextInputPage extends BasePage {

//    private final By inputText = By.xpath("//input[@id='newButtonName']");
//    private final By button = By.xpath("//button[@id='updatingButton']");

    @FindBy(xpath = "//input[@id='newButtonName']")
    private WebElement inputText;

    @FindBy(xpath = "//button[@id='updatingButton']")
    private WebElement button;

//    WebElement elemet = driver.findElement(By.xpath("//input[@id='newButtonName']"));


    public String setText(String textToType) {
//        driver.findElement(inputText).sendKeys(textToType);
        inputText.sendKeys(textToType);
        button.click();
        return textToType;
    }

    public String getTextFromButton() {
        return button.getText();
    }

    public TextInputPage(WebDriver driver) {
        super(driver);
    }
}
