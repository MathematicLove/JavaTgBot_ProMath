package org.promathtelegrambot.operations.pro;

interface Pro{
    double inDegree(double x, double y);
    double convertToRadians(double x);
    double convertToDegrees(double x);
    int convertToBin(int x);
    double inSqrt(double x, double y);
    double inSquare(double x);
    double inSqRoot(double x);
    double convertSign(double x);
    double supremum(String nums);
    double infimum(String nums);
}

public class ProOperations implements Pro {
    @Override
    public double inDegree(double x, double y) {
        System.out.println("inDegree");
        return Math.pow(x, y);
    }

    @Override
    public double inSqrt(double x, double y) {
        System.out.println("inSqrt");
        return Math.sqrt(Math.pow(x, y));
    }

    @Override
    public double convertToRadians(double x) {
        System.out.println("convertToRadians");
        return Math.toRadians(x);
    }

    @Override
    public double convertToDegrees(double x) {
        System.out.println("convertToDegrees");
        return Math.toDegrees(x);
    }

    @Override
    public int convertToBin(int x) {
        System.out.println("convertToBin");
           int y, res = 0;
           for(int i = 31; i >= 0; i--) {
               y = x >> i;
               res = (y & 1);
           }
           return res;
    }

    @Override
    public double inSquare(double x) {
        System.out.println("inSquare");
        return Math.pow(x, 2);
    }

    @Override
    public double inSqRoot(double x) {
        System.out.println("inSqRoot");
        return Math.sqrt(x);
    }

    @Override
    public double infimum(String nums) {
        System.out.println("infimum");
        int min = 0;
        for(int i = 0; i < nums.length() - 1; i++) {
            if(nums.charAt(i) < nums.charAt(i+1)) {
                min = nums.charAt(i);
            } else {
                min = nums.charAt(i+1);
            }
        }
        return min;
    }

    @Override
    public double convertSign(double x) {
        System.out.println("convertSign");
        return x * -1;
    }

    @Override
    public double supremum(String nums) {
        System.out.println("supremum");
         int max = 0;
        for(int i = 0; i < nums.length() - 1; i++) {
            if(nums.charAt(i) > nums.charAt(i+1)) {
                max = nums.charAt(i);
            } else {
                max = nums.charAt(i+1);
            }
        }
        return max;
    }
}
