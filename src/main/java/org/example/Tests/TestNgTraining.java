package org.example.Tests;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestNgTraining extends BaseTest{
    @Test
    public void testNgTraining() throws IOException {
        System.out.println("I am TestNgTraining");
        String propValue = getProperty("pwd");
        System.out.println(propValue);
    }
}