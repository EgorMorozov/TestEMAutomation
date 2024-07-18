package org.example;
@FunctionalInterface
public interface MyFunctional<V,T> {
    public V calculate(V a,T b);

    default public int divide(int a, int b){
        return a/b;
    }
}
