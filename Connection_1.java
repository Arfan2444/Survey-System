package src;

import javax.swing.*;
import java.sql.*;

public class Connection_1 extends System_1 {
    public static final String url = "jdbc:mysql://localhost:3306/systems";
    public static final String username = "root";
    public static final String password = "arfan244";

    Connection_1(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM systems WHERE id=? AND name=? ";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,user_input2);
            preparedStatement.setString(2,user_input1);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                JOptionPane.showMessageDialog(null, "Logged in successfully.");
                frame.dispose();
                new System_2();

            }
            else {
                JOptionPane.showMessageDialog(null, "Failed to login.");
            }

        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }

}
