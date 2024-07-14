package src;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connection_2 extends System_2 {
    public static final String url = "jdbc:mysql://localhost:3306/survey_system";
    public static final String username = "root";
    public static final String password = "arfan244";

    Connection_2() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try {
            Connection connection2 = DriverManager.getConnection(url, username, password);
            String query1 = "insert into survey (arrival_condition,product_satisfaction,suggestion,improvement_1,improvement_2,improvement_3,improvement_4,improvement_5,rating) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection2.prepareStatement(query1);
            preparedStatement.setString(1, choice1);
            preparedStatement.setString(2, choice2);
            preparedStatement.setString(3, choice3);
            preparedStatement.setString(4, choice4);
            preparedStatement.setString(5, choice5);
            preparedStatement.setString(6, choice6);
            preparedStatement.setString(7, choice7);
            preparedStatement.setString(8, choice8);
            preparedStatement.setString(9, choice9);

            int rowsaffected = preparedStatement.executeUpdate();
            if (rowsaffected > 0) {
                System.out.println("Data Inserted Successfully.");
            } else {
                System.out.println("Failed to Insert Data");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
