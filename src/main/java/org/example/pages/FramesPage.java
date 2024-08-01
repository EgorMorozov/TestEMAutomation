package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {

    public By frame1Input = By.xpath("//input[@name='mytext1']");
    public By frame2Input = By.xpath("//input[@name='mytext2']");
    public By frame3Input = By.xpath("//input[@name='mytext3']");
    public By frame4Input = By.xpath("//input[@name='mytext4']");
    public By frame5Input = By.xpath("//input[@name='mytext5']");


    public void getFrameByIndex(int frameIndex) {
        driver.switchTo().frame(frameIndex);
    }


    public FramesPage(WebDriver driver) {
        super(driver);
    }
}
