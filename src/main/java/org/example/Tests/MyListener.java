package org.example.Tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Ой тест упал");
        System.out.println(result.getMethod());
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        System.out.println("Стартует тест " + context.getName());
        System.out.println("Начало в " + context.getStartDate());
    }
}
