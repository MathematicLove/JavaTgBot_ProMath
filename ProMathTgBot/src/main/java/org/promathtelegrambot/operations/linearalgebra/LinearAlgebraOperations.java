package org.promathtelegrambot.operations.linearalgebra;

import java.util.Arrays;
import java.util.List;

interface Linear{
    double detForTwo(double[][] matrix);
    double detForThree(double[][] matrix);
    double det(double[][] matrix);
    double[][] transpose(double[][] matrix);
    double[][] adjust(double[][] matrix);
    double[][] randomFill(double[][] matrix);
}

public class LinearAlgebraOperations implements Linear{
    @Override
    public double[][] randomFill(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.random();
            }
        }
        return matrix;
    }

    @Override
    public double detForTwo(double[][] matrix) {
        double det = 0;
        if(matrix.length==2){
            det = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        } else {
            System.out.println("Matrix should be 2x2!");
            return 0;
        }
        return det;
    }

    @Override
    public double detForThree(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            System.out.println(("Matrix should be 3x3"));
    }

    double a11 = matrix[0][0];
    double a12 = matrix[0][1];
    double a13 = matrix[0][2];
    double a21 = matrix[1][0];
    double a22 = matrix[1][1];
    double a23 = matrix[1][2];
    double a31 = matrix[2][0];
    double a32 = matrix[2][1];
    double a33 = matrix[2][2];

        return a11 * a22 * a33
                   + a12 * a23 * a31
                   + a13 * a21 * a32
                   - a13 * a22 * a31
                   - a11 * a23 * a32
                   - a12 * a21 * a33;
    }

    @Override
    public double det(double[][] matrix) {
        double determinant = 0;
    for (int j = 0; j < matrix.length; j++) {
        double[][] minor = getMinor(matrix, 0, j);
        double minorDet = det(minor);
        determinant += matrix[0][j] * Math.pow(-1, 0 + j) * minorDet;
    }

    return determinant;
}

private double[][] getMinor(double[][] matrix, int row, int col) {
    int n = matrix.length;
    double[][] minor = new double[n - 1][n - 1];

    for (int i = 0, minorRow = 0; i < n; i++) {
        if (i == row) continue;
        for (int j = 0, minorCol = 0; j < n; j++) {
            if (j == col) continue;
            minor[minorRow][minorCol] = matrix[i][j];
            minorCol++;
        }
        minorRow++;
    }

    return minor;
    }

    @Override
    public double[][] transpose(double[][] matrix) {
        if (matrix == null || matrix.length == 0) return new double[0][0];

        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] transposeMatrix = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    @Override
    public double[][] adjust(double[][] matrix) {
        int n = matrix.length;

        for (double[] row : matrix) {
            if (row.length != n) {
                throw new IllegalArgumentException("Матрица должна быть квадратной");
            }
        }

        double[][] adjMatrix = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    double[][] minor = getMinor(matrix, j, i);
                    double minorDet = det(minor);
                    adjMatrix[i][j] = Math.pow(-1, i + j) * minorDet;
                }
            }
        return adjMatrix;
    }
}
