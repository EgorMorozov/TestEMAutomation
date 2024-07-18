package org.example.Tests;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.fail;


@Listeners(MyListener.class)
public class TestBrowser extends BaseTest {


    @DataProvider()
    public Object[][] prepareTestData() {
        return new Object[][]{{-1, "correct"}, {0, "correct"}, {1, "correct"}, {56, "correct"}, {89, "correct"}, {99, "correct"}, {100, "correct"}, {101, "correct"}};
    }

    @BeforeMethod()
    public void preSteps() {
        System.out.println("Подготовка");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("DELETE");
    }

    @Test(dataProvider = "prepareTestData")
    public void testOne(int i, String isCorrect) {
        System.out.println(i);
        Assert.assertEquals(isCorrect, "correct");
    }

    @Test()
    public void testTwo() {
        System.out.println("Проверка пользователя");
        fail();
    }

    @Test()
    public void testTree() {
        System.out.println("Удаление");
    }


}
