package com.example;

import java.sql.*;

public class CompanyDB {
    Connection conn = null;
    Statement stmt = null;

    CompanyDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:company.db");
            stmt = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS COMPANY  " + "(ID INT PRIMARY KEY     NOT NULL,"
                    + " NAME           TEXT    NOT NULL, " + " AGE            INT     NOT NULL, "
                    + " ADDRESS        CHAR(50), " + " SALARY         REAL)";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void insertData(int id, String name, int age, String address, float salary) {
        String sql;
        sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " + "VALUES (" + id + ", '" + name + "', " + age + ", '"
                + address + "', " + salary + " );";
        try {
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void selectAll() {
        String sql = "SELECT * FROM COMPANY;";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                float salary = rs.getFloat("salary");

                System.out.println("ID = " + id);
                System.out.println("NAME = " + name);
                System.out.println("AGE = " + age);
                System.out.println("ADDRESS = " + address);
                System.out.println("SALARY = " + salary);
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void UpdateData(int id, String name, int age, String address, float salary) {
        String sql = "UPDATE COMPANY SET ";
        sql = sql + " Name = '" + name + "',";
        sql = sql + " Age = " + age;
        sql = sql + " ,Address = '" + address + "'";
        sql = sql + " ,SALARY = " + salary;
        sql = sql + " where ID=" + id + ";";
        try {
            stmt.executeUpdate(sql);
            // conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println(sql);
            System.exit(0);
        }
    }
}