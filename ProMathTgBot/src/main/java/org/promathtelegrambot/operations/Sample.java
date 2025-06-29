package org.promathtelegrambot.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.promathtelegrambot.operations.base.BaseOperations;
import org.promathtelegrambot.operations.pro.ProOperations;
import org.promathtelegrambot.operations.probability.ProbabilityOperations;
import org.promathtelegrambot.operations.geometry.GeometryOperations;
import org.promathtelegrambot.operations.statistics.StatisticsOperations;
import org.promathtelegrambot.operations.linearalgebra.LinearAlgebraOperations;

public class Sample {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a first double number: ");
        double x = scanner.nextDouble();
        System.out.println();
        System.out.print("Please enter a second double number: ");
        double y = scanner.nextDouble();
        System.out.print("Please enter a first integer number: ");
        int z = scanner.nextInt();
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////
        BaseOperations baseOperations = new BaseOperations();
        ProOperations proOperations = new ProOperations();
        ProbabilityOperations probabilityOperations = new ProbabilityOperations();
        GeometryOperations geometryOperations = new GeometryOperations();
        StatisticsOperations statisticsOperations = new StatisticsOperations();
        LinearAlgebraOperations linearAlgebraOperations = new LinearAlgebraOperations();
        ////////////////////////////////////////////////////////////////////////////
        System.out.println(baseOperations.sum(x,y));
        System.out.println(baseOperations.minus(x,y));
        System.out.println(baseOperations.multiply(x,y));
        System.out.println(baseOperations.divide(x,y));
        System.out.println(baseOperations.percent(x,y));
        ////////////////////////////////////////////////////////////////////////////
        System.out.println(proOperations.inDegree(x,y));
        System.out.println(proOperations.inSqrt(x,y));
        System.out.println(proOperations.convertToBin(z));
        System.out.println(proOperations.inSqRoot(x));
        System.out.println(proOperations.inSqrt(x,y));
        System.out.println(proOperations.convertToDegrees(x));
        System.out.println(proOperations.convertToRadians(y));
        System.out.println(proOperations.convertSign(x));
        ////////////////////////////////////////////////////////////////////////////
        System.out.print("Enter integer to search factorial: ");
        int fact = scanner.nextInt();
        System.out.println();
        System.out.print("Enter integer to search factorial: ");
        int fact2 = scanner.nextInt();
        System.out.println();
        System.out.println("factorial: ");
        System.out.println(probabilityOperations.factorial(fact));
        System.out.println("combine");
        System.out.println(probabilityOperations.combine(fact, fact2));
        System.out.println("arrangement");
        System.out.println(probabilityOperations.arrangement(fact, fact2));
        ////////////////////////////////////////////////////////////////////////////
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.println();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println();
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.println();
        System.out.print("Enter angle: ");
        double angle = scanner.nextDouble();
        System.out.println();
        geometryOperations.setValues(height, width, radius, angle);
        ////////////////////////////////////////////////////////////////////////////
        System.out.print("Enter size of sample: ");
        int sampleSize = scanner.nextInt();
        List<Double> sampleValues = new ArrayList<>();
        System.out.println();
        for (int i = 0; i <= sampleSize; i++) {
            System.out.println("Enter sample value at " + i + " position: ");
            sampleValues.add(scanner.nextDouble());
        }
        System.out.println("Mean of sample: ");
        System.out.println(statisticsOperations.mean(sampleValues));
        ////////////////////////////////////////////////////////////////////////////
        System.out.println("Enter size of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter size of cols: ");
        int cols = scanner.nextInt();
        double[][] matrix = new double[rows][cols];
        System.out.println("Filled: " + Arrays.deepToString(linearAlgebraOperations.randomFill(matrix)));
        System.out.println("Determinant for 2x2: " + linearAlgebraOperations.detForTwo(matrix));
        System.out.println("Transpose: " + Arrays.deepToString(linearAlgebraOperations.transpose(matrix)));
        System.out.println("Adjudicate matrix " + Arrays.deepToString(linearAlgebraOperations.adjust(matrix)));
        System.out.println("Determinant for 3x3: " + linearAlgebraOperations.detForThree(matrix));
        System.out.println("Determinant for 4x4: " + linearAlgebraOperations.det(matrix));
    }
}
