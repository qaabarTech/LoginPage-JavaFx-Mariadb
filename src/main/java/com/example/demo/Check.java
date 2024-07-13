package com.example.demo;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.*;


public class Check {

    public static boolean check(TextField user , PasswordField pass){
        boolean isValid = true;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/yourdatabasename","root","yourdatabasepassword");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM test1 WHERE username = '"+user+"' AND password1 = '"+pass+"'");
            while (rs.next()) {
                String username = rs.getString(2);
                String password = rs.getString(3);
                if(user.getText().equals(username) && pass.getText().equals(password)){
                     isValid =true;
                }else{
                    isValid = false;
                }

            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

       return isValid;
    }
}
