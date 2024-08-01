package org.example.tests;

import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextInputTest extends BaseTest {


    @Test
    public void textInputTest() {
        driver.get(getFromProperties("homeUrl"));
        homePage.getTestDirectory(HomePage.Links.TEXT_INPUT);
        String startButtonValue = textInputPage.getTextFromButton();

        String expectedText = textInputPage.setText("HellWorld");
        String actualText = textInputPage.getTextFromButton();

        Assert.assertEquals(expectedText, actualText);
        Assert.assertNotEquals(actualText, startButtonValue);
    }
}
