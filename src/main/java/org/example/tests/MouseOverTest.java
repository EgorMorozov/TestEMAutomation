package org.example.tests;

import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseOverTest extends BaseTest {

    @Test
    public void doubleClickTest() {
        homePage.getTestDirectory(HomePage.Links.MOUSE_OVER);

        int clickCount = 6;
        int expected = clickCount * 2;

        mouseOverPage.doubleClick(clickCount);
        String actual = mouseOverPage.getClickCount();

        Assert.assertEquals(actual, String.valueOf(expected));
    }
}
