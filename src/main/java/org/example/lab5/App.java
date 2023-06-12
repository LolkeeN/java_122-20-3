package org.example.lab5;

import java.util.Scanner;
import org.example.lab5.repository.StudentRepository;

public class App {

    private final static StudentRepository studentRepository = new StudentRepository();

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Please, enter sql to execute");
        Scanner scanner = new Scanner(System.in);
        String sql = scanner.nextLine();

        String dataFromDatabase = studentRepository.getDataFromDatabase(sql);
        System.out.println(dataFromDatabase);
    }
}
