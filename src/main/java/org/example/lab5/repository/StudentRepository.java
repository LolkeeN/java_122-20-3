package org.example.lab5.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRepository {

    public String getDataFromDatabase(String sql) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        try (Connection con = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/lab5_java", "root", "root")) {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            StringBuilder stringBuilder = new StringBuilder();
            while (resultSet.next()) {
                stringBuilder.append("id: ").append(resultSet.getString("id"));
                stringBuilder.append(" first_name: ").append(resultSet.getString("first_name"));
                stringBuilder.append(" last_name: ").append(resultSet.getString("last_name"));
                stringBuilder.append(" patronymic: ").append(resultSet.getString("patronymic"));
                stringBuilder.append(" date_of_birth: ").append(resultSet.getDate("date_of_birth"));
                stringBuilder.append(" gradesbook_number: ").append(resultSet.getInt("gradesbook_number"));
                stringBuilder.append('\n');
            }
            return stringBuilder.toString();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
