package org.promathtelegrambot.operations.base;

interface Base{
    double sum(double x, double y);
    double minus(double x, double y);
    double multiply(double x, double y);
    double divide(double x, double y);
    double percent(double x, double y);
}

public class BaseOperations implements Base {
    @Override
    public double sum(double x, double y) {
        System.out.println("Plus: ");
        return x + y;
    }
    @Override
    public double minus(double x, double y) {
        System.out.println("Minus: ");
        return x - y;
    }
    @Override
    public double multiply(double x, double y) {
        System.out.println("Multiply: ");
        return x * y;
    }
    @Override
    public double divide(double x, double y) {
        System.out.println("Divide: ");
        return x / y;
    }
    @Override
    public double percent(double x, double y) {
        System.out.println("Percent: ");
        return 100 * x / y;
    }
}
