package org.example.calculation;

import java.util.Random;
import java.util.Scanner;
import org.example.exceptions.InvalidMatrixSizeException;

public class MatrixCreator {

    private int maximum;
    private int minimum;
    private int avg;
    private double avgGeom;
    private String matrixStringRepresentation;

    public void createMatrixRandomNumbers(int rows, int columns) {
        if (rows > 20 || columns > 20) {
            throw new InvalidMatrixSizeException("Invalid matrix size. Max rows/columns size is 20");
        }
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt();
                stringBuilder.append(matrix[i][j]).append(" ");
                if ((i == 0 && j == 0) || this.minimum > matrix[i][j]) {
                    this.minimum = matrix[i][j];
                }
                if ((i == 0 && j == 0) || this.maximum < matrix[i][j]) {
                    this.maximum = matrix[i][j];
                }
                avg += matrix[i][j];
                avgGeom *= matrix[i][j];
            }
            stringBuilder.append('\n');
        }
        avg = avg / rows * columns;
        avgGeom = Math.pow(avgGeom, 1.0/(rows*columns));
        matrixStringRepresentation = stringBuilder.toString();
        System.out.println(stringBuilder);
    }

    public void createMatrixUserInput(int rows, int columns, Scanner scanner) {
        if (rows > 20 || columns > 20) {
            throw new InvalidMatrixSizeException("Invalid matrix size. Max rows/columns size is 20");
        }
        int[][] matrix = new int[rows][columns];
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Beginning matrix filling");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("enter the elements for the Matrix");
                matrix[row][col] = scanner.nextInt();
                stringBuilder.append(matrix[row][col]).append(" ");
                if ((row == 0 && col == 0) || this.minimum > matrix[row][col]) {
                    this.minimum = matrix[row][col];
                }
                if ((row == 0 && col == 0) || this.maximum < matrix[row][col]) {
                    this.maximum = matrix[row][col];
                }
                avg += matrix[row][col];
                avgGeom *= matrix[row][col];
            }
            stringBuilder.append('\n');
            System.out.println();
        }
        avg = avg / (rows * columns);
        avgGeom = Math.pow(avgGeom, 1.0/(rows*columns));
        System.out.println(stringBuilder);
        matrixStringRepresentation = stringBuilder.toString();
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getAvg() {
        return avg;
    }

    public String getMatrixStringRepresentation() {
        return matrixStringRepresentation;
    }
    public double getAverageGeom() {
        return avgGeom;
    }
}
