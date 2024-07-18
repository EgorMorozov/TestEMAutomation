package org.example;

import org.openqa.selenium.By;

/**
 * Hello world!
 */
public class App {

//    public static int math(MyFunctional myFunctional, int a, int b) {
//        return myFunctional.calculate(a, b);
//    }

    public static void main(String[] args) {


        MyFunctional<Integer, Integer> f1 = (a, b) -> 5 * 5;
        MyFunctional<Double, Double> f2 = (a, b) -> 5.56d + 5.66d;
        MyFunctional<Byte, Byte> f3 = ((a, b) -> (byte)(3 + 1));
        MyFunctional<Integer, Short> f4 = (a, b) -> 80 * 5;

        Cup testCup = new Cup();
        testCup.fillOutLiquid(new Water());
        testCup.clearUpLiquid();
        testCup.fillOutLiquid(new Coffee());
    }
}
