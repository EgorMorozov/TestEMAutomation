package org.example.tests;

import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class AlertTest extends BaseTest {

    @Test
    public void alertTest() {
        homePage.getTestDirectory(HomePage.Links.ALERTS);

        alertsPage.clickAlert();
        driver.switchTo().alert().accept();


        //5 это пятница
        int day = LocalDate.now().getDayOfWeek().getValue();

        alertsPage.clickConfirm();

        if (day == 5) {
            driver.switchTo().alert().accept(); //подтвердить
        } else {
            driver.switchTo().alert().dismiss(); //отменить
            driver.switchTo().alert().accept();
        }

        String textToType = "test";
        String exepected = "User value: %s";

        alertsPage.clickPrompt();
        driver.switchTo().alert().sendKeys(textToType);
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
        String actual = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        Assert.assertEquals(String.format(exepected, textToType), actual);


    }
}
