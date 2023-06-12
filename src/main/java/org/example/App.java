package org.example;

import java.util.Objects;
import java.util.Scanner;
import org.example.calculation.MatrixCreator;

/**
 * Hello world!
 */
public class App {

    private final static MatrixCreator matrixCreator = new MatrixCreator();

    public static void main(String[] args) {
        Scanner scanner;
        do {
            scanner = new Scanner(System.in);
            System.out.println("Choose any option:");
            System.out.println("User input matrix: 'user input'");
            System.out.println("Random numbers matrix: 'random'");
            System.out.println("Get matrix average: 'avg'");
            System.out.println("Get matrix minimum: 'min'");
            System.out.println("Get matrix maximum: 'max'");
            System.out.println("Get matrix string: 'matrix'");
            System.out.println("Get average geom: 'avgGeom'");
            String userInput = scanner.nextLine();
            if (userInput.equals("user input")) {
                System.out.println("Please, enter rows count");
                int rows = scanner.nextInt();
                System.out.println("Please, enter columns count");
                int columns = scanner.nextInt();
                matrixCreator.createMatrixUserInput(rows, columns, scanner);
                System.out.println();
                continue;
            }
            if (userInput.equals("random")) {
                System.out.println("Please, enter rows count");
                int rows = scanner.nextInt();
                System.out.println("Please, enter columns count");
                int columns = scanner.nextInt();
                matrixCreator.createMatrixRandomNumbers(rows, columns);
                System.out.println();
                continue;
            }
            if (userInput.equals("min")) {
                System.out.println("Min is " + matrixCreator.getMinimum());
                System.out.println();
                continue;
            }
            if (userInput.equals("max")) {
                System.out.println("Max is " + matrixCreator.getMaximum());
                System.out.println();
                continue;
            }
            if (userInput.equals("avg")) {
                System.out.println("AVG is " + matrixCreator.getAvg());
                System.out.println();
                continue;
            }
            if (userInput.equals("matrix")) {
                System.out.println(matrixCreator.getMatrixStringRepresentation());
                continue;
            }
            if (userInput.equals("avgGeom")) {
                System.out.println(matrixCreator.getAverageGeom());
                System.out.println();
            }
        } while (!Objects.equals(scanner.next(), "stop"));

    }
}
