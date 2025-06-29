package org.promathtelegrambot.operations.probability;

interface Probability {
    double combine(int x, int y);
    double arrangement(int x, int y);
    int factorial(double x);
}

public class ProbabilityOperations implements Probability {
    @Override
    public int factorial(double x){
        if (x < 0){
            return 0;
        } else if(x == 0){
            return 1;
        } else {
            int res = 1;
            for (int i = 2; i < x + 1; i++) {
                res *= (i);
            }
            return res;
        }
    }

    @Override
    public double combine(int x, int y) {
        if (y > x){
            return 0;
        } else return ((double) factorial(x) / (factorial(y) * (factorial((x-y)))));
    }

    @Override
    public double arrangement(int x, int y) {
        if (y > x){
            return 0;
        } else return (factorial(y) * (combine(x, y)));
    }
}
