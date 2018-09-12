package uk.co.investormind.pfm.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {
        try {
            System.out.println("Connecting to database");

            String connectionUrl = "jdbc:mysql://localhost:3306/personal_finance_db?useUnicode=true&characterEncoding=UTF-8&user=manager&password=password";
            Connection conn = DriverManager.getConnection(connectionUrl);

            System.out.println("Success!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
